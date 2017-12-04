package com.dp.example;

public class BeafBurgerOrder implements Chain {
	private Chain nextInChain;
	
	public void setNextChain(Chain nextChain) {
		nextInChain = nextChain;
		
	}

	
	public void Order(MealBuilder request) {
		if(request.getDeal() == "Beef")

	{
		System.out.print("Beef Burger Ready");
		
	}
		
		{
			nextInChain.Order(request);
			}
	}

}
