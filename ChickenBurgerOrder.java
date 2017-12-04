package com.dp.example;

public class ChickenBurgerOrder implements Chain {

private Chain nextInChain;
	
	public void setNextChain(Chain nextChain) {
		nextInChain = nextChain;
		
	}

	
	public void Order(MealBuilder request) {
		if(request.getDeal() == "Chicken")

	{
		System.out.print("Chicken Burger Ready");
		
	}
		else 
		{
			nextInChain.Order(request);
			}
	}

}
