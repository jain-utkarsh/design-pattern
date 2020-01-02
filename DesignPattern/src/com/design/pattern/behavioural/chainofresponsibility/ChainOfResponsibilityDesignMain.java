
package com.design.pattern.behavioural.chainofresponsibility;

public class ChainOfResponsibilityDesignMain {

	public static void main(String[] args) {
		NegativeNumberChain negativeNumberChain = new NegativeNumberChain();
		PostiveNumberChain postiveNumberChain = new PostiveNumberChain();
		ZeroNumberChain zeroNumberChain = new ZeroNumberChain();
		
		//Chain 1
		//postiveNumberChain.setChain(zeroNumberChain); 
		negativeNumberChain.setChain(postiveNumberChain);
		negativeNumberChain.execute(0); 
		
	}
}
