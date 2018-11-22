package com.jmg.webservice.controller;

public class Service implements IService{

	@Override
	public String aa(String text) {
		// TODO Auto-generated method stub
		System.out.println("aa"+text);
		return "aaa";
	}

	@Override
	public String bb(String text) {
		// TODO Auto-generated method stub
		System.out.println("bb"+text);
		return "bbb";
	}

}
