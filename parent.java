package helloWorld;

public class parent {

	
		public void sayHello(){
			System.out.println("Hello from Parent");
		}
	}

	class Child2 extends parent{
		@Override
		public void sayHello(){
			System.out.println("Hello from Chid");
		}
	}


	class Main6
	{
		public static void main(String[] args) 
		{
			parent p = new parent();   //for calling hello from child
			//Parent p = new Parent();  //for calling hello from parent
			p.sayHello();
		}
	}
