package ua.lviv.lgs.max;

public class Application {

	public static void main(String[] args) {

		// ������ ����� �ᒺ�� � ����
		Map<String, Integer> map = new Map<>();
		map.put("gal", 90);
		map.put("Ola", 12);
		map.put("Ji", 6);
		map.put("Rock", 3);
		map.put("Vice", 80);
		map.put("gal", 33);
		map.showMap();

		// �������� �ᒺ�� ���� �� ������(����� ���� � ����� � ��������)
		map.remove("Ji");
		map.showMap();

		// ��������� �ᒺ�� ���� �� ���������(�������� �ᒺ��� ������������ �������
		// ������, ��� ����� ���������� ����)
		map.removeUsingValue(80);
		map.showMap();

		//�������� �� ����� Set ������
		map.showKeys();
		
		//�������� �� ����� List �������
		map.showValues();
		
		//�������� �� ����� ���� ����
		map.showMap();

	}

}
