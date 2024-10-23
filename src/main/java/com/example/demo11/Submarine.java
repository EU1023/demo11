package com.example.demo11;

public class Submarine extends Boat implements Dive{

	
	@Override
	public void Diving() {
		System.out.println("¤U¼ç");
	}

	@Override
	public void move() {
		System.out.println("©ñ¤ô");
	}

}
