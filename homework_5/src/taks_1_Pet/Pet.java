package taks_1_Pet;

abstract class Pet {
	abstract void voice();
}

class Cow extends Pet {
	void voice() {
		System.out.println("ί κξπξβΰ - Μσσσ-Μσσσ");
	}
}

class Cat extends Pet {
	void voice() {
		System.out.println("ί κ³ς - Μÿσσσ-Μÿσσσ");
	}
}

class Dog extends Pet {
	void voice() {
		System.out.println("ί οερ - Γΰσσσ-Γΰσσσ");
	}
}
