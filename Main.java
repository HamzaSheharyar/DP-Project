package com.dp.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//Chain req1 = new ZingerBurgerOrder();
		//Chain req2 = new ChickenBurgerOrder();
		//Chain req3 = new BeafBurgerOrder();

		//req1.setNextChain(req2);
		//req2.setNextChain(req3);

		//MealBuilder mb = new MealBuilder("vfdv", "cdcd", "Zinger");

		//req1.Order(mb);

		Scanner scan = new Scanner(System.in);
		MealBuilder mealBuilder = MealBuilder.getMealBuilder();
		List<Meal> meals = new ArrayList<>();
		
		
		while (true) {
			System.out.println("Welcome to Fast Food Management");
			System.out.println("Create a Deal Press 1 ");
			System.out.println("Show all Deals Press 2 ");
			System.out.println("Ice Cream Package 3 ");
			//System.out.println("Clone Meal Press 3 ");
			//System.out.println("Exit Press anything else");
			 String input = scan.next();
			if (input.equals("1")) {
				meals.add(createDeals());
			} 
			else if (input.equals("2")) {
				showDeals();
			}
			else if (input.equals("3")) {
				creatIceCreameDeals();
			}
			else
				break;
		}
	}

	private static Meal createDeals() {
		
		
			
			
				System.out.println("-----------------------------------------");
				System.out.println("Zinger Burger:" + "Coke");

				System.out.println("Total Cost: " + "150.00 Rs.");
				System.out.println("-----------------------------------------");
			
				System.out.println("-----------------------------------------");
				System.out.println("Beef Burger:" + "7up");

				System.out.println("Total Cost: " + "160.00 Rs.");
				System.out.println("-----------------------------------------");
			
				System.out.println("-----------------------------------------");
				System.out.println("Chicken Burger:" + "Pepsi");

				System.out.println("Total Cost: " + "140.00 Rs.");
				System.out.println("-----------------------------------------");
		
				System.out.println("Out Of Menu");
			
			return null;
	}
	private static Meal creatIceCreameDeals() {
		System.out.println("-----------------------------------------");
		
		System.out.println("Kulfa + Choco = 100.00 Rs.");
		System.out.println("-----------------------------------------");
		return null;
}
		
		
	

	private static void showDeals() {
		System.out.println("-----------------------------------------");
		System.out.println("Zinger + 1.Lr Coke = 160.00 Rs.");
		System.out.println("Beef + 1.Lr 7up = 150.00 Rs.");
		System.out.println("Chicken + 1.Lr Pepsi = 140.00 Rs.");
		System.out.println("-----------------------------------------");
	}

}
