create database beers;

use beers;

CREATE TABLE beer (
        id INT NOT NULL AUTO_INCREMENT,
        NAME VARCHAR(30) NOT NULL,
        DESCRIPTION VARCHAR(400) NOT NULL,
        ALCOHOLPERCENTAGE FLOAT NOT NULL,
        BREWERYLOCATION VARCHAR(30) NOT NULL,
        PRIMARY KEY (ID)
    );

CREATE USER 'beeruser'@'localhost' IDENTIFIED BY 'beeruser';

GRANT ALL ON beers.* TO 'beeruser'@'localhost';
	
INSERT INTO beer values (default, 'Duff Beer', 'Springfields favorite beer', 4.0, 'Springfield');
INSERT INTO beer values (default, 'Hanks Brew', 'Breaking bads favorite beer', 6.5, 'New Mexico');
INSERT INTO beer values (default, 'Erdinger Beer', 'Erdinger is the worlds largest wheat beer brewery. It is widely available and popular across Germany and the European Union. Erdinger was founded in 1886 by Johann Kienle. Erdinger beer is the best-known culinary product of the city', 5.3, 'Germany');
INSERT INTO beer values (default, 'Guiness','Guinness is an Irish dry stout that originated in the brewery of Arthur Guinness (1725–1803) at St. Jamess Gate brewery in the capital city of Dublin, Ireland. Guinness, produced by the Diageo beverages company, is one of the most successful beer brands worldwide. It is brewed in almost 50 countries and is available in over 120.Annual sales total of Guinness in 2011 was 850 million litres',4.1,'Dublin');
INSERT INTO beer values (default, 'Heineken','Heineken Lager Beer is a pale lager beer produced by the Dutch brewing company Heineken International. Heineken is well known for its signature green bottle and red star',5.0,'Amsterdam');