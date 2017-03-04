package com.test.bulider;

public class NASAAirShipBuilder implements AirShipBuilder {

	@Override
	public OrbitalModule builderOrbitalModule() {
		return new OrbitalModule("NASA OrbitalModule");
	}

	@Override
	public Engine builderEngine() {
		return new Engine("NASA Engine");
	}

	@Override
	public EscapeTower builderEscapeTower() {
		return new EscapeTower("NASA EscapeTower");
	}

}
