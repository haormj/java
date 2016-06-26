package com.haormj.bridge;

public class Main {

	public static void main(String[] args){
		ISeasoning pepper = new PepperSeasoning();
		Noodle ramen = new RamenNoodle(pepper);
		ramen.getNoodle();
		ISeasoning vinegar = new VinegarSeasoning();
		Noodle sliced = new SlicedNoodle(vinegar);
		sliced.getNoodle();
	}
	
}
