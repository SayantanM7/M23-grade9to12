package helloWorld;

public class Parent2 {

	protected void protect(){
		System.out.println("I'm inside protected method");
	}
}
class child extends Parent2{
	private void privateMethod(){
		System.out.println("I'm inside private method");

	}
}



class Main0 {
  public static void main(String[] args) {

	  child kid = new child();
	  //kid.privateMethod();
	  
    System.out.println("Hello world!");
  }
}

