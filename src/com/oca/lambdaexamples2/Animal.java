package com.oca.lambdaexamples2;

public class Animal {
	
//	Our goal is to print out all the animals in a list according to some criteria. We’ll show you
//	how to do this without lambdas to illustrate how lambdas are useful. We start out with the
//	Animal class:
	private String species;
	private boolean canHop;
	private boolean canSwim;
	
	public Animal(String speciesName, boolean hopper, boolean swimmer) {
		species = speciesName;
		canHop = hopper;
		canSwim = swimmer;
	}
	
	public boolean canHop() {
		return canHop;
	}
	public boolean canSwim() {
		return canSwim;
	}
	// toString method to identify the Animal 
	public String toString() {
		return species;
	}
	public String getSpecies() {
		return species;
	}

	
	public void setSpecies(String species) {
		this.species = species;
	}

	public boolean isCanHop() {
		return canHop;
	}

	public void setCanHop(boolean canHop) {
		this.canHop = canHop;
	}

	public boolean isCanSwim() {
		return canSwim;
	}

	public void setCanSwim(boolean canSwim) {
		this.canSwim = canSwim;
	}



}
