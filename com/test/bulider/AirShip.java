package com.test.bulider;

public class AirShip {
	private OrbitalModule orbitalModule;
	private Engine engine;
	private EscapeTower escapeTower;
	public AirShip(OrbitalModule orbitalModule, Engine engine, EscapeTower escapeTower) {
		this.orbitalModule = orbitalModule;
		this.engine = engine;
		this.escapeTower = escapeTower;
	}
	
	public void fire(){
		System.out.println("OrbitalModule "+orbitalModule.getName()+" is ready ");
		System.out.println("Engine "+engine.getName()+" is ready ");
		System.out.println("EscapeTower "+escapeTower.getName()+" is ready ");
	}
	
}

//
class OrbitalModule{
	
	private String name;
	
	public OrbitalModule(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
//
class Engine{
	private String name;
	
	public Engine(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}

//
class EscapeTower{
	private String name;
	
	public EscapeTower(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}


