package helloWorld;

public class Mammals {
	//this activity is mainly to explain Hierarchical inheritance
	//parent class
	
		void mam(){
			System.out.println("Inside Mammals Class");
			}
	}
	//child class
	class Lion2 extends Mammals{
		void roar(){
			System.out.println("Inside Lion class ");
			}
	}
	//child 
	class Human extends Mammals{
		void hum(){
			System.out.println("Inside Human");
			}
	}

	class Main4{
		public static void main(String args[]){
		Lion2 obj=new Lion2();//object of child of child class
//		obj.hum();//this will result in error to run this we have to create object of Human
		obj.roar();
		obj.mam();
		}
	}
	 

