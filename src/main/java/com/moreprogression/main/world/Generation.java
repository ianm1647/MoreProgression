package com.moreprogression.main.world;

public class Generation {

	public static void genLoad() {
		ProgressionWorldGeneration.setupOverworldGeneration();
		ProgressionWorldGeneration.setupNetherGeneration();
		ProgressionWorldGeneration.setupEndGeneration();
		ProgressionWorldGeneration.setupPlantGeneration();
	}

}
