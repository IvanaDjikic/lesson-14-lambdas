package exercises;

import java.text.NumberFormat;

public class Planet {

	private int distanceFromSun; // Average distance in millions of kilometers
	private String name;
	private double volume; // Relative to Earth which is 1.0
	private int satellites;

	public Planet(String name, int distanceFromSun, double volume, int satellites) {
		super();
		this.name = name;
		this.distanceFromSun = distanceFromSun;
		this.volume = volume;
		this.satellites = satellites;
	}

	public String toString() {
		return "\n" + this.name + " ,distance from the Sun: " + this.distanceFromSun + " ,volume: " + this.volume
				+ " ,number of satelites: " + this.satellites;
	}

	public int getDistanceFromSun() {
		return distanceFromSun;
	}

	public double getVolume() {
		return volume;
	}

	public String getName() {
		return name;
	}

}
