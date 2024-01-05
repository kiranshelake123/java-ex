package krn;

 class student {
   String name;
   int age;
   
  
 void display(){
	 System.out.println( age + " " +   name);}   
 }
	 
 
public class oops1 {
	public static void main (String [] args) {
	student s1 = new student();
	s1.name = "hello";
    s1.age =  12; 
    
    
	s1.display();
	
}
}

