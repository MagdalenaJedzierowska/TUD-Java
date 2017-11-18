package com.example.jdbcdemo.domain;

//NOT RELEVANT ANYMORE
public enum Brand {
	Sony("Sony"),
	Microsoft("Microsoft"),
	Nintendo("Nintendo"),
	Sega("Sega"),
	Atari("Atari"),
	Bandai("Bandai");
	
	String value;

	private Brand(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return this.value;
	}
}
