//Program to define Person entity
package com.tnsif.daythree.scannerdemo;
public class Person {
//Data members
private String name;
private int income;
private String gender;
private int age;
private int tax;
//Getter and Setters
public int getTax() {
return tax;
}
public void setTax(int tax) {
this.tax = tax;
}
public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}
public int getIncome() {
return income;
}
public void setIncome(int income) {
this.income = income;
}
public String getGender() {
return gender;
}
public void setGender(String gender) {
this.gender = gender;
}
public int getAge() {
return age;
}
public void setAge(int age) {
this.age = age;
}
//Object class method to return string
@Override
public String toString() {
return "Person [name=" + name + ",income=" + income + ", gender=" + gender + ",age=" + age + ", tax="+tax+"]";
}

//Program to demonstrate encapsulat
// function to calculate tax
public void calculateTax(Person person) {
if (person.getAge() > 65 ||
person.getGender().equalsIgnoreCase("female")) {
person.setTax(0);
System.out.println("Tax not applicable");
} else {
if (person.getIncome() <= 160000) {
person.setTax(0);
} else if (person.getIncome() >
160000 && person.getIncome() <= 500000) {
person.setTax((person.getIncome()
- 160000) * 10 / 100);
} else if (person.getIncome() >=
500000 && person.getIncome() <= 800000) {
person.setTax((person.getIncome()
- 500000) * 20 / 100 + 34000);
} else {
person.setTax((person.getIncome()
- 800000) * 30 / 100 + 94000);
}
}
}

//Program to demonstrate encapsula
import java.util.Scanner;
public static void main(String[] args) {
//scanner object to accept user inputs
Scanner ob = new Scanner(System.in);
String name;
System.out.println("Enter Person Name :");
name = ob.next();
System.out.println("Enter age: ");
int age = ob.nextInt();
System.out.println("Enter gender: ");
String gender = ob.next();
System.out.println("Enter taxable income:");
int income = ob.nextInt();
//Person object and initialize valuesusing setter
Person person = new Person();
person.setName(name);
person.setAge(age);
person.setGender(gender);
person.setIncome(income);
//display person details using toString()
System.out.println(person);
TaxCalculation calc=new TaxCalculation();
calc.calculateTax(person); //taxcalculation
System.out.println("After calculating tax: ");
System.out.println(person);
ob.close();

}

