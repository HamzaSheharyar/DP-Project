package com.dp.example;

public class Choco extends IceDeco  {

	public Choco(IceCream c) {
		super(c);
		// TODO Auto-generated constructor stub
	}

	@Override
	public float price() {
		// TODO Auto-generated method stub
		return ic.price() + 30;
	}

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return ic.name()+ "choco";
	}
	

}