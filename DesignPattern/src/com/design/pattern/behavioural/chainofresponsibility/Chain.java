package com.design.pattern.behavioural.chainofresponsibility;

public interface Chain {
	public void setChain(Chain chain);
	public void execute(int number);
}
