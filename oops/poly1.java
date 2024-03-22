package oops;

class X{  
void display(){
	System.out.println("drawing...");}  
}  
class Y extends X{  
public void display()
{System.out.println("drawing rectangle...");}  
}  
class Z extends X{  
void display(){
	System.out.println("drawing circle...");}  
}  

 

class poly1{  
public static void main(String args[]){  

X s=new Y();  
s.display();  
s=new Z();  
s.display(); 
}  
}