package Seminars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task3_5 {
	public static void main(String[] args) {

		//Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
		//Вывести название каждой планеты и количество его повторений в списке.

		List<String> planets = new ArrayList<>();
		planets.add("Меркурий");
		planets.add("Венера");
		planets.add("Земля");
		planets.add("Марс");
		planets.add("Юпитер");
		planets.add("Сатурн");
		planets.add("Уран");
		planets.add("Нептун");
		planets.add("Земля");
		planets.add("Марс");
		planets.add("Юпитер");
		planets.add("Юпитер");

		Collections.sort(planets);
		String currentPlanet = planets.get(0);
		int count = 1;

		for (int i = 1; i < planets.size(); i++) {
			String planet = planets.get(i);
			if (planet.equals(currentPlanet)) {
				count++;
			} else {
				System.out.println("Планета: " + currentPlanet + ", количество повторений: " + count);
				currentPlanet = planet;
				count = 1;
			}
		}
		System.out.println("Планета: " + currentPlanet + ", количество повторений: " + count);

	}
}
