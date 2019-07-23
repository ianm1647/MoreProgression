package com.moreprogression.main.world;

public class Generation {

	public static void genLoad() {
		ProgressionOreGeneration.setupOreGeneration();
		ProgressionOreGeneration.setupNetherOreGeneration();
		ProgressionOreGeneration.setupEndOreGeneration();
		ProgressionRockGeneration.setupRockGeneration();
		ProgressionRockGeneration.setupNetherRockGeneration();
		ProgressionPlantGeneration.setupPlantGeneration();
	}

}
