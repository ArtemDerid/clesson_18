package ua.lviv.lgs.min;

import java.util.ArrayList;
import java.util.List;

public class MyList {

	// якщо замінити addToList(List list) на addToList(List<Integer> list), тоді
	// помилка

	public static void addToList(List list) {
		list.add("Some Text");
		list.add(56);
	}

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		addToList(list);
		System.out.println(list.get(0));
		System.out.println(list.get(1));
	}
	// програма працює, бо під час запуску типи generic стираються, і замість
	// List<Integer> ми отримуємо просто List
}
