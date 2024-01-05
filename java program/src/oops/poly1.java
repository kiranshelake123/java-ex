package oops;

class Shape{  
void display(){
	System.out.println("drawing...");}  
}  
class Rectangle extends Shape{  
public void display()
{System.out.println("drawing rectangle...");}  
}  
class Circle extends Shape{  
void display(){
	System.out.println("drawing circle...");}  
}  
class Triangle extends Shape{  
void display(){
	System.out.println("drawing triangle...");}  
}  

class poly1{  
public static void main(String args[]){  

Shape s=new Rectangle();  
s.display();  
s=new Circle();  
s.display();  
s=new Triangle();  
s.display();  
}  
}