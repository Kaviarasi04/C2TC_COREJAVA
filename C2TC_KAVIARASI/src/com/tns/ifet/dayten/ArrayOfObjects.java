package com.tns.ifet.dayten;

public class ArrayOfObjects {

	public static void main(String[] args) {
		Student[] arr;
		// allocating memory for 5 objects of type Student.
		arr = new Student[7];
		// initialize the first elements of the array
		arr[0] = new Student(1, "Jai");
		// initialize the second elements of the array
		arr[1] = new Student(2, "Kavi");
		// so on...
		arr[2] = new Student(3, "Laks");
		arr[3] = new Student(4, "Jan");
		arr[4] = new Student(5, "Lp");
		arr[5] = new Student(6, "Meha");
		arr[6] = new Student(7, "Madu");
		
		// accessing the elements of the specified array
		for (int i = 0; i < arr.length; i++)
			System.out.println("Element at " + i + " : " + arr[i].getRollNo()+ " " + arr[i].getName());


	}

}