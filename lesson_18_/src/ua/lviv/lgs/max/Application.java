package ua.lviv.lgs.max;

public class Application {

	public static void main(String[] args) {

		// Додаємо новий об’єкт в мапу
		Map<String, Integer> map = new Map<>();
		map.put("gal", 90);
		map.put("Ola", 12);
		map.put("Ji", 6);
		map.put("Rock", 3);
		map.put("Vice", 80);
		map.put("gal", 33);
		map.showMap();

		// Видалямо об’єкт мапи за ключем(тобто немає ні ключа ні значення)
		map.remove("Ji");
		map.showMap();

		// Видаляємо об’єкт мапи за значенням(значенню об’єкта присвоюється нульова
		// спилка, при цьому зберігається ключ)
		map.removeUsingValue(80);
		map.showMap();

		//Виводимо на екран Set ключів
		map.showKeys();
		
		//Виводимо на екран List значень
		map.showValues();
		
		//Виводимо на екран цілу мапу
		map.showMap();

	}

}
