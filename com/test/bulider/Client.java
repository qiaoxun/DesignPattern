package com.test.bulider;

public class Client {
	//StringBuilder append method
	//SQL PreparedStatement
	//JDOM DomBuilder SAXBuilder
	public static void main(String[] args) {
		AirShipBuilder builder = new NASAAirShipBuilder();
		AirShipDirector director = new NASAAirShipDirector(builder);
		AirShip airShip = director.directAirShip();
		airShip.fire();
		
		StringBuffer sb = new StringBuffer();
		sb.append("");
	}
}
