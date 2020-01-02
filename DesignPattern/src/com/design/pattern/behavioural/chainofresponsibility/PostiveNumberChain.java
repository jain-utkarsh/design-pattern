package com.design.pattern.behavioural.chainofresponsibility;

public class PostiveNumberChain implements Chain{

	private Chain chain;
	
	@Override
	public void setChain(Chain chain) {
		this.chain = chain;
	}

	@Override
	public void execute(int number) {
		if(number > 0) {
			System.out.println("Number is Positive");
 		}else {
 			if(chain == null) {
 				throw new RuntimeException("No Chain Found for this number");
 			}
 			chain.execute(number); 
		}
	}

}
