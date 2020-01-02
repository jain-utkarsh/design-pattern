package com.design.pattern.builder;

public class BuilderDesignMain {

	public static void main(String[] args) {
		
		Computer computer1 = new Computer.ComputerBuilder()
									.setGraphicsCard("Nvidia")
									.setHdd("256GB")
									.setProcessor("i9")
									.setRam("16 GB")
									.setSsd("128GB").build();
		
		Computer computer2 = new Computer.ComputerBuilder()
				.setGraphicsCard("AMD")
				.setHdd("512GB")
				.setProcessor("i7")
				.setRam("16 GB").build();
		
		System.out.println(computer1);
		System.out.println(computer2);
		
	}

}
