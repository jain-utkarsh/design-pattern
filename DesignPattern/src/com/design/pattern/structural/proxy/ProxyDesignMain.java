package com.design.pattern.structural.proxy;

public class ProxyDesignMain {

	public static void main(String[] args) {
		Internet internet = Internetfactory.getInstance();
		internet.renderWebsite("ddd.com"); 
		internet.renderWebsite("eee.com"); 
		internet.renderWebsite("aaa.com");
	}
}

class Internetfactory {
	
	public static Internet getInstance() {
		return new ProxyInternet();
	}
}
