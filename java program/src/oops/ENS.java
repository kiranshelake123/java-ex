package oops;

public class ENS {  
public static void main(String[] args) {  
    //creating instance of Account class  
    Account a=new Account();  
    //setting values through setter methods  
    a.setAcc_no(7560504000L);  
    a.setName("Sonoo Jaiswal");  
    a.setEmail("sonoojaiswal@javatpoint.com");  
    a.setAmount(500000f);  
    //getting values through getter methods  
    System.out.println(a.getAcc_no()+" "+a.getName()+" "+a.getEmail()+" "+a.getAmount());  
}  
}  

