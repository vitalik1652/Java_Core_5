package taks_1_Pet;

abstract class Pet {
	abstract void voice();
}

class Cow extends Pet {
	void voice() {
		System.out.println("� ������ - ����-����");
	}
}

class Cat extends Pet {
	void voice() {
		System.out.println("� �� - �����-�����");
	}
}

class Dog extends Pet {
	void voice() {
		System.out.println("� ��� - �����-�����");
	}
}
