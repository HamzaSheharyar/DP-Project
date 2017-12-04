package com.dp.example;

public class ZingerBurgerOrder implements Chain {
private Chain nextInChain;
	
	public void setNextChain(Chain nextChain) {
		nextInChain = nextChain;
		
	}

	
	public void Order(MealBuilder request) {
		if(request.getDeal() == "Zinger")

	{
		System.out.print("Zinger Burger Ready");
		
	}
		else 
		{
			System.out.println("Out of Menu");
			}
	}

}
