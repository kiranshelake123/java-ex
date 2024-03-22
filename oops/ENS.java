package oops;




class student {
	String name;
	int age;
	int id;

public String getName() {
	return name;
}

public void setName(String abc )
{
    
	name = "abc";

}
public int getAge() 
{
	return age;
}

 public void setAge(int a)
{
	age = 12;
	
}
 public int getId() 
 {
 	return age;
 }

  public void setId(int b)
 {
 	id = 121;
 	
 }
 
}
public class ENS {
	public static void main (String [] args)
	{
	
	student obj =new student();
obj.name="abc";
obj.age=12;
obj.id=121;
	
	
	
	System.out.println( obj.name + " " +  obj.age + " " +  obj.id );
	
	
	}
}
