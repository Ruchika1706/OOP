package com.cisco.prj.client;

import java.lang.reflect.Method;

import com.cisco.prj.entity.Mobile;
import com.cisco.prj.entity.Product;
import com.cisco.prj.entity.TV;

public class ProductClient {

	public static void main(String[] args) {
		Product[] products = new Product[4];
		products[0] = new TV(1, "Sony Bravia", 120000.00, "LED");
		products[1] = new Mobile(2, "iPhone X", 130000.00, "4G");
		products[2] = new Mobile(3, "One Plust 6t", 56000.00, "4G");
		products[3] = new TV(4, "LG", 920000.00, "LED");
		printExpensive(products);
		printInfo(products);
		printInfoOCP(products);

	}

	private static void printInfoOCP(Product[] products) {
		System.out.println("*****************");
		for(Product p: products) {
			Class clazz = p.getClass();
			Method[] methods = clazz.getMethods();
			for(Method m: methods) {
				try {
				if(m.getName().startsWith("get")) {
					Object ret = m.invoke(p);
					System.out.println(ret);
				}
				}
				catch (Exception ex) {
					ex.printStackTrace();
				}
			}
			System.out.println("*****************");
		}
	}

	private static void printInfo(Product[] products) {
		for(Product p: products) {
			System.out.println(p.getName() + " , " +p.getPrice());
			if(p.getClass() == TV.class) {
				TV t = (TV)p;
				System.out.println(t.getScreenType());
				
			} else if(p.getClass()== Mobile.class) {
				Mobile m = (Mobile)p;
				System.out.println(m.getConnectivity());
			}
		}
		
	}

	private static void printExpensive(Product[] products) {
		for (Product p: products) {
			if(p.isExpensive()) { //dynamic binding or Polymorphism
				System.out.println(p.getName() + " is Expensive");
			}
		}
		
	}

}
