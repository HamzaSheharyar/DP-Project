package com.dp.example;

public abstract class ColdDrink implements Item {

	public Packing packing()
	{
		return new Glass();
	}
	
	
}
