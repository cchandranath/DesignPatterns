package com.example.creational.singletone;

import java.util.Random;

public class NTone {
	private NTone[] instances;
	//private int numOfInstance;

	private NTone() {
	}

	private NTone(int numOfInstance) {
		//this.numOfInstance = numOfInstance;
		instances = new NTone[numOfInstance];
		for (int i = 0; i < numOfInstance; i++) {
			instances[i] = new NTone();
		}
	}

	public static NTone getInstance(int numOfInstance) {
		// INITIALIZE
		NTone tone = new NTone(numOfInstance);
		int random = new Random().nextInt(numOfInstance);
		return tone.instances[random];
	}

}
