package task_3_Amphibia;

abstract class Amphibia {

	void eat() {
		System.out.println("I'm eating now");
	}

	void sleep() {
		System.out.println("I'm sleeping now");
	}

	void swim() {
		System.out.println("I'm swimming now");
	}

	void walk() {
		System.out.println("I'm walking now");
	}
}

class Frog extends Amphibia {

}
