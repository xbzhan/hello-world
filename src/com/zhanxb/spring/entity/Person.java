package com.zhanxb.spring.entity;

import com.zhanxb.spring.HelloMessage;

public class Person {
	private HelloMessage helloMessage;

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(HelloMessage helloMessage) {
		super();
		this.helloMessage = helloMessage;
	}

	public HelloMessage getHelloMessage() {
		return helloMessage;
	}

	public void setHelloMessage(HelloMessage helloMessage) {
		this.helloMessage = helloMessage;
	}
	public String sayHello(){
		return this.helloMessage.sayHello();
		
	}
}
