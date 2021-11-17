package com.advancedjava;

class Building {
public Building() {
		System.out.println("this is an Building");
	}
}

class Office extends Building {

	public Office() {
		System.out.println("this is an office");
	}

}

public class SubstitutionPrinciple {

	public static void main(String[] args) {

		//Building building = new Building();
		Office office = new Office();

		showBuilding(office);

	}

	private static void showBuilding(Building office) {

	}

}
