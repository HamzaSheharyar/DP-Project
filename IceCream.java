package com.dp.example;

abstract class IceCream implements Item {

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "ice cream";
	}

	@Override
	public Packing packing() {
		// TODO Auto-generated method stub
		return new Glass();
	}

	@Override
	public float price() {
		// TODO Auto-generated method stub
		return 25.0f;
	}

}
