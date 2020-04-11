mport java.util.Scanner;
public class Additionpublic{      
    Scanner sc = new Scanner(System.in);  
     int num1 = sc.nextInt();   
    int num2 = sc.nextInt();   
    int sum=num1+num2;   
    System.out.println("Addition public is: "+sum);        }
class Additionprivate{      
    Scanner sc = new Scanner(System.in);   
    private int num3= sc.nextInt();   
    private int num4= sc.nextInt();      
    public int getnum1()  
     {     return num3;   }     
     public int getnum2()   
    {     return num4;   }
    int sum=getnum1()+getnum2();
     System.out.println("Addition is: "+sum);
}

class Additionprotected{  
     protected int num5, num6;   
}
class Extended extends Additionprotected{  
Scanner sc = new Scanner(System.in);   
    int num5 = sc.nextInt();   
    int num6 = sc.nextInt();   
    int sum=num5+num6;   System.out.println("Addition is: "+sum);}

public class AdditionTwoNumbers2 {
 public static void main(String[] args){
    System.out.println("Enter two Number: ");
     Additionpublic pub=new Additionpublic();
     System.out.println("Enter two Number: ");
      Additionprivate pri=new Additionprivate();
 System.out.println("Enter two Number: ");
 Extended pro=new Extended();                        
 }
 }