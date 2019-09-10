package exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class _3_SolarSystem {

	public static void main(String[] args) {
		List<Planet> planets = Arrays.asList(new Planet("Mercury", 57, 0.056, 0), new Planet("Venus", 108, 0.866, 0),
				new Planet("Jupiter", 779, 1321, 79), new Planet("Mars", 228, 0.151, 2), new Planet("Earth", 150, 1, 1),
				new Planet("Saturn", 1430, 763.59, 62));

		// 1: Sort the planets by distance from the sun
		Collections.sort(planets, (p1, p2) -> p1.getDistanceFromSun() - p2.getDistanceFromSun());
		System.out.println(planets);
		// 2. Sort the planets in alphabetical order

		planets.sort(Comparator.comparing(Planet::getName));
		System.out.println(planets);

		// 3. Sort planets from largest to smallest
		Collections.sort(planets, (p1, p2) -> (int) (p2.getVolume() * 100) - (int) (p1.getVolume() * 100));
		System.out.println(planets);

	}

}
