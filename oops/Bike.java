package oops;

//method overloading


class Vehicle{  
		  void run(){System.out.println("Vehicle is running");}  
		} 


		//Creating a child class  
		class Bike extends Vehicle{  
		  public static void main(String args[]){ 
			  
			  
			  Bike obj = new Bike();  //creating an instance of child class  
		  
		  
		  
		  obj.run();  //calling the method with child class instance  
		 
		  }  
		}  

