package com.design.pattern.structural.proxy;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet {

	Internet internet = new SimpleInternet();
	private static List<String> bannedWebsite = new ArrayList<String>();
	
	static {
		bannedWebsite.add("ccc.com");
		bannedWebsite.add("aaa.com");
		bannedWebsite.add("bbb.com");
	}
	
	@Override
	public void renderWebsite(String name) {
		if(bannedWebsite.contains(name)) {
			throw new RuntimeException("Cannot access " + name + " website\n");
		}
		internet.renderWebsite(name); 
	}

}
