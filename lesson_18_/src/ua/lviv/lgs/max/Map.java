package ua.lviv.lgs.max;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Map<K, V> {

	private static final int capacity = 10;
	private int size = 0;
	private MyEntry<K, V>[] table;

	public Map() {
		table = new MyEntry[capacity];
	}

	// Додаємо новий об’єкт в мапу
	public void put(K key, V value) {
		if (size == table.length) {
			ensureCapacity();
		}
		if (size == 0) {
			table[0] = new MyEntry(key, value);
			size++;
		} else {
			boolean flag = false;
			if (!flag) {
				for (int i = 0; i < table.length; i++) {
					if (table[i] != null) {
						if (table[i].getKey().equals(key)) {
							table[i].setValue(value);
							size++;
							break;
						} else {
							flag = true;
						}
					}
				}
			}
			if (flag) {
				table[size++] = new MyEntry(key, value);
			}
		}
	}

	private void ensureCapacity() {
		int newIncreasedCapacity = table.length * 2;
		table = Arrays.copyOf(table, newIncreasedCapacity);
	}

	// Видалямо об’єкт мапи за ключем(тобто немає ні ключа ні значення)
	public K remove(K key) {
		for (int i = 0; i < table.length; i++) {
			if (table[i] != null) {
				if (table[i].getKey().equals(key)) {
					for (int j = i; j < table.length-1; j++) {
						table[j] = table[j + 1];
					}
				}
			}
		}
		return key;
	}

	// Видаляємо об’єкт мапи за значенням(значенню об’єкта присвоюється нульова
			// спилка, при цьому зберігається ключ)
	public V removeUsingValue(V value) {
		for (int i = 0; i < table.length; i++) {
			if (table[i] != null) {
				if (table[i].getValue().equals(value)) {
					table[i].setValue(null);
				}
			}
		}
		return value;
	}
	
	//Виводимо на екран Set ключів
	public void showKeys() {
		HashSet<K> setOfKeys = new HashSet<>();
		for (MyEntry<K, V> myEntry : table) {
			if(myEntry != null) {
				K set = myEntry.getKey();
				setOfKeys.add(set);
			}
		}
		System.out.println(setOfKeys);
	}
	
	//Виводимо на екран List значень
	public void showValues() {
		List<V> listOfValues = new ArrayList();
		for (MyEntry<K, V> myEntry : table) {
			if(myEntry != null) {
				V list = myEntry.getValue();
				listOfValues.add(list);
			}
		}
		System.out.println(listOfValues);
	}
	
	//Виводимо на екран цілу мапу
	public void showMap() {
		java.util.Map<K, V> printMap = new HashMap();
		for (MyEntry<K, V> myEntry : table) {
			if(myEntry != null) {
				K keys = myEntry.getKey();
				V values = myEntry.getValue();
				printMap.put(keys, values);
			}
		}
		System.out.println(printMap);
	}


	@Override
	public String toString() {
		return "Map [" + Arrays.toString(table) + "]";
	}

}
