import java.util.Scanner;
class Additionpublic
{
    public int num1,num2;
    Additionpublic()
    {
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.println("sum of Public :: "+sum);
    }
}
class Additionprivate
{
    private int num1,num2;
    Additionprivate()
    {
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        num2 = sc.nextInt();
    }
    public int getnum1()
    {
        return num1;
    }
    public int getnum2()
    {
        return num2;
    }
}

class Additionprotected
{
    protected int num5, num6;
}

class Extended extends Additionprotected
{
    public int sum;
    Extended()
    {
        Scanner sc = new Scanner(System.in);
        num5 = sc.nextInt();
        num6 = sc.nextInt();
        sum  = num5 + num6;
        System.out.println("Sum of protected :: "+sum);
    }
}
    

class addi
{
    public static void main(String[] args) 
    {
        System.out.println("Enter two Numbers");
        Additionprivate pri = new Additionprivate();
        int sum = pri.getnum1()+ pri.getnum2();
        System.out.println("Sum of private :: " +sum);
        System.out.println("Enter two Numbers");
        Extended pro = new Extended();
        System.out.println("Enter two Numbers");
        Additionpublic plu = new Additionpublic();
    }
}