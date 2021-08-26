package com.Techment.day8.collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Products 
{
	int id;
	String name;
	int price;
	int quantity;
	
	public Products(int id, String name, int price, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}



	@Override
	public String toString() {
		return "Product1 [id=" + id + ", name=" + name + ", price=" + price + ", quantity=" + quantity + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
}
class DesQuantity implements Comparator<Products>
{

	@Override
	public int compare(Products p1, Products p2) {
		// TODO Auto-generated method stub
		if(p2.quantity>p1.quantity)
			return 1;
		else
		return 0;
	}
	
}
class QuantitySorting implements Comparator<Products>
{

	@Override
	public int compare(Products p1, Products p2) {
		// TODO Auto-generated method stub
		if(p1.quantity==p2.quantity)
			return 0;
	    else if(p1.quantity<p2.quantity)
			return 1;
		else
		return -1;
	}
	
}


class priceSorting implements Comparator<Products>
{

	@Override
	public int compare(Products o1, Products o2) {
		// TODO Auto-generated method stub
		if(o1.price==o2.price)
			return 0;
		else if(o1.price>o2.price)
		return 1;
		else
			return -1;
	}
	
}

public class Product {

	public static void main(String[] args) {
		
		ArrayList<Products> p = new ArrayList<Products>();
		p.add(new Products(1,"Biscuit",20,200));
		p.add(new Products(2,"maggie",44,150));
		p.add(new Products(3,"Cadbury",550,50));
		p.add(new Products(4,"choco chip",33,260));
		p.add(new Products(5,"hide n sik",600,15));
		
		for(Products pro : p)
		{
			System.out.println(pro);
		}
		
		System.out.println("==========product which are greater than 500==========");
		Collections.sort(p,new QuantitySorting());
		for(Products pro : p)
		{
			if(pro.price>500) {
			
			System.out.println(pro);
			}
		}
	
		System.out.println("==========sorting quantity in descending==========");
		Collections.sort(p,new DesQuantity());
		for(Products pro : p)
		{
			System.out.println(pro);
		}
		
		System.out.println("==========sorting product price in ascending ==========");
		Collections.sort(p,new priceSorting());
		for(Products pro : p)
		{
			System.out.println(pro);
		}

	}

}
