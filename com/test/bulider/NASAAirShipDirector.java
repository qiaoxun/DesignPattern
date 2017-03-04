package com.test.bulider;

public class NASAAirShipDirector implements AirShipDirector {
	
	private AirShipBuilder builder;
	public NASAAirShipDirector(AirShipBuilder builder) {
		this.builder = builder;
	}

	@Override
	public AirShip directAirShip() {
		OrbitalModule orbitalModule = builder.builderOrbitalModule();
		Engine engine = builder.builderEngine();
		EscapeTower escapeTower = builder.builderEscapeTower();
		
		AirShip airShip = new AirShip(orbitalModule, engine, escapeTower);
		
		return airShip;
	}
	
}
