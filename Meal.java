package com.dp.example;

import java.util.List;
import java.util.ArrayList;

public class Meal implements Cloneable {

	@Override
	public Object clone()
	{
			Object clone= null;
	try {
		clone = super.clone();
		
	} 
	catch (CloneNotSupportedException e) {
		e.printStackTrace();
		// TODO: handle exception
	}
			return clone;
		
	}
	
	private List<Item> items  = new ArrayList<Item>();
	
	public void addItem(Item item)
	{
		items.add(item);
	}
	
	public float getcost()
	{
		float cost = 0.0f;
		for (Item item : items) {
			
			cost += item.price();
		}
		return cost;
	}
	public void ShowItems()
	{
		for (Item item : items) {
			 System.out.println("Item :" + item.name());
			 System.out.println(", packing :" + item.packing().pack());
			 System.out.println(",price :" + item.price());
			
			 
		}
	}
	
	
	
	
	
	
	
	

}
