package com.pp2;

//La clase Student hereda de la clase Person
public class Student extends Person{
	private String nameOfUniversity;
	
	//Uso del constructor sobrecargado
	public Student(int age, String name, String nameOfUniversity) {
		super(age,name);
		this.nameOfUniversity=nameOfUniversity;
	}
	
	//Metodo showStudent
	public void showStudent() {
		System.out.println("Student name: "+name);
		System.out.println("Age: "+age);
		System.out.println("University: "+nameOfUniversity);
	}
	
	//Metodo showAge heredado por la clase Person
	public void showAge() {
		super.showAge();
	}
}
