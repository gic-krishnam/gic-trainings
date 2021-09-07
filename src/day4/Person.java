package day4;

public class Person {
	static void myMethod() {
	 }
	private String fname="krishnam";
	private String lname="chaturvedi";
	private String age="25";
	Person(){
	 }
	  public static void main(String[] args) {
		  myMethod();
	    Person myObj = new Person();
	    System.out.println("Name: " + myObj.fname + " " + myObj.lname);
	    System.out.println("Age: " + myObj.age);
	  }
}
