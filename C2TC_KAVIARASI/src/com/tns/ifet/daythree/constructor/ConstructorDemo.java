package com.tns.ifet.daythree.constructor;

import java.util.Scanner;

public class ConstructorDemo {

	public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			String name, city;
			int id;
			System.out.println("Enter customer id:");
			id=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter customer name:");
			name=sc.nextLine();
			System.out.println("Enter customer city:");
			city=sc.nextLine();
			System.out.println(" ");
			Customer cl =new Customer();
			cl.setCustomerName(name);
			cl.setCustomerId(id);
			cl.setCustomerCity(city);
			System.out.println(cl);
			System.out.println("Enter customer id:");
			id=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter customer name:");
			name=sc.nextLine();
			System.out.println("Enter customer city:");
			city=sc.nextLine();
			Customer c2=new Customer(name, id, city);
			System.out.println(c2);
			sc.close();
	}

}

