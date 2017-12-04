package com.dp.example;

public class MealBuilder extends ChickenBurgerOrder {
	private String Beef;
	private String Chicken;
	private String DealOrder;
	
	public MealBuilder(String beef1, String Chicken1 , String dealorder)
	{
		Beef= beef1;
		Chicken = Chicken1;
		DealOrder=dealorder;
		
	}
	public String getBeef(){return Beef;}
	public String getChicken(){return Chicken;}

	public String getDeal(){return DealOrder;}

private MealBuilder()
{

 
}
private static MealBuilder obj;

public static MealBuilder getMealBuilder(){

if(obj == null)
        return obj = new MealBuilder();

   return obj;
}
}

