import java.util.*;
public class complex {
    int r,img;
    Scanner sc=new Scanner(System.in);
    public void getData()
    {
        System.out.println("Enter real and imaginary number: ");
        r=sc.nextInt();
        img=sc.nextInt();
    }
    public void  show()
    {
        System.out.println("Complex No: "+r+" + "+img+"i");
        
    }
    public static void main(String args[])
    {
        complex c1,c2,c3;
        c1=new complex();
        c2=new complex();
        c3=new complex();
        c1.getData();
        c2.getData();
        c3.r=c1.r+c2.r;
        c3.img=c1.img+c2.img;
        c1.show();
        System.out.println("");
        c2.show();
        System.out.println("");
        System.out.print("Sum : ");
        c3.show();
    }   
}
