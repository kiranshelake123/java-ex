package oops;

class Animal{  
void eat(){
	System.out.println("eating...");}  
}  
class Dog extends Animal{  
void bark(){
	System.out.println("barking...");}  
}  
class Cat extends Dog{  
void meow(){System.out.println("meowing...");}  
}  
class inh{  
public static void main(String args[]){  
Cat c=new Cat();  
c.meow();  
c.bark();
c.eat();
//c.bark();//C.T.Error  
}}  
