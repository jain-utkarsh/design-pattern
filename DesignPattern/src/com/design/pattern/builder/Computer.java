package com.design.pattern.builder;

public class Computer {

	String ram;
	String processor;
	String graphicsCard;
	String ssd;
	String hdd;
	
	
	public Computer(ComputerBuilder computerBuilder) {
		this.ram = computerBuilder.ram;
		this.processor = computerBuilder.processor;
		this.graphicsCard = computerBuilder.graphicsCard;
		this.ssd = computerBuilder.ssd;
		this.hdd = computerBuilder.hdd;
	}
	

	public String getRam() {
		return ram;
	}
	
	public void setRam(String ram) {
		this.ram = ram;
	}
	
	public String getProcessor() {
		return processor;
	}
	
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	
	public String getGraphicsCard() {
		return graphicsCard;
	}
	
	public void setGraphicsCard(String graphicsCard) {
		this.graphicsCard = graphicsCard;
	}
	
	public String getSsd() {
		return ssd;
	}
	
	public void setSsd(String ssd) {
		this.ssd = ssd;
	}
	
	public String getHdd() {
		return hdd;
	}
	
	public void setHdd(String hdd) {
		this.hdd = hdd;
	}
	
	@Override
	public String toString() {
		return "Computer [ram=" + ram + ", processor=" + processor + ", graphicsCard=" + graphicsCard + ", ssd=" + ssd
				+ ", hdd=" + hdd + "]";
	}
	
	public static class ComputerBuilder {
		String ram;
		String processor;
		String graphicsCard;
		String ssd;
		String hdd;
		
		
		public ComputerBuilder setRam(String ram) {
			this.ram = ram;
			return this;
		}
		
		public ComputerBuilder setProcessor(String processor) {
			this.processor = processor;
			return this;
		}
		
		public ComputerBuilder setGraphicsCard(String graphicsCard) {
			this.graphicsCard = graphicsCard;
			return this;
		}
		
		public ComputerBuilder setSsd(String ssd) {
			this.ssd = ssd;
			return this;
		}
		
		public ComputerBuilder setHdd(String hdd) {
			this.hdd = hdd;
			return this;
		}
		
		public Computer build() {
			return new Computer(this);
		}
	}
}
