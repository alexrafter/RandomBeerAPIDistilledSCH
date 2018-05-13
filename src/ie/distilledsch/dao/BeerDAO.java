package ie.distilledsch.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import ie.distilledsch.model.Beer;

public class BeerDAO {
	
	public static int lastBeerId;

	public Beer getAnotherBeer(){
		ArrayList<Beer> allBeers = getBeerList();
		if(allBeers.size() > 0){
			//code to ensure a different beer is returned every time the method is called
			Beer beer = allBeers.get((int) (Math.random() * allBeers.size()));
			if(allBeers.size() == 1){
				lastBeerId = beer.getId();
			}
			else{
				while(lastBeerId==beer.getId()){
					beer = allBeers.get((int) (Math.random() * allBeers.size()));
				}
				lastBeerId = beer.getId();
			}
			return beer;
		}
		else {
			return new Beer(0,"No Beer Found","",0.0f,"");
		}
	}

	private Connection getConnection() throws SQLException, ClassNotFoundException {
        String user = "beeruser";
        String password = "beeruser";
        String url = "jdbc:mysql://localhost:3306/beers?useSSL=false&serverTimezone=GMT";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(url, user, password);
        return conn;
    }

	public ArrayList<Beer> getBeerList() {
		ArrayList<Beer> allBeers = new ArrayList<Beer>();
		Beer beer = null;
		
        String query = "SELECT ID, NAME, DESCRIPTION, ALCOHOLPERCENTAGE, BREWERYLOCATION FROM BEER";
        try(
        	Connection con = getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query)) {
            while (rs.next()) {
                beer = new Beer(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getFloat(4), rs.getString(5));
                allBeers.add(beer);
            }

        } catch (SQLException ex) {
        	System.out.println(ex.getMessage());
        } catch (ClassNotFoundException e) {
        	System.out.println(e.getMessage());
		}
		return allBeers; 
    }
}
