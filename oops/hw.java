package oops;

class A{  
void msg(){
	
	System.out.println("Hello");}  
}  
class B{  
void msg(){
	
	System.out.println("Welcome");}  
}  
class C extends  B {    //suppose if it were  
  
	class hw {
 public static void main(String args[]){  
   C obj=new C();  
   obj.msg();   //Now which msg() method would be invoked?  
}  
	}
}
