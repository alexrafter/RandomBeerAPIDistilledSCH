package ie.distilledsch.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import ie.distilledsch.dao.BeerDAO;
import ie.distilledsch.model.Beer;

@Path("/beer")
public class RandomBeerService {
	
	
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String getRandomBeerHTML(){
		BeerDAO beerDAO = new BeerDAO();
		Beer randomBeer = beerDAO.getAnotherBeer();
		String result="<head><title>Random Beer API</title><meta name='viewport' content='width=device-width, initial-scale=1'>" +
		"<link rel='stylesheet' href='./../resources/css/bootstrap.min.css'>" +
		"<script src='https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js'></script></head><body>" +
	    "<div class='row' ><div class='col-md-2'></div><div class='col-md-6'><h2>" + randomBeer.getName() +  "</h2></div>" +
		"<div class='col-md-4'><button type='button' class='btn btn-primary' onClick='window.location.reload()''>Show Another Beer</button></div></div>" +
		"<div class='row'><div class='col-md-2'></div><div class='col-md-8'><ul class='list-group'>" +
		"<li class='list-group-item'>Description: " + randomBeer.getDescription() + "</li>" +
		"<li class='list-group-item'>Alcohol: " + randomBeer.getAlcoholPercentage() + "%</li>" +
		"<li class='list-group-item'>Brewery Location: " + randomBeer.getBreweryLocation() + "</li></ul>" +
		"</div></div><div class='col-md-2'></div></body>";
		return result;
	}
	
}