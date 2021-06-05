import java.util.*;
public class CPU {
    float price;
   class Processor
    {
     int core; 
     String mf1;
    }
    static class RAM
    {
        String mem;
        String mf2;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        CPU c = new CPU();
        CPU.Processor p= c.new Processor();
        CPU.RAM r= new CPU.RAM();
        System.out.println("Enter Price :");
        c.price=sc.nextInt();
        System.out.println("Enter Processor core and manufacturer : ");
        p.core=sc.nextInt();
        p.mf1=sc.nextLine();
        System.out.println("Enter RAM memory and manufacturer : ");
        r.mem=sc.nextLine();
        r.mf2=sc.nextLine();
        System.out.println("CPU PRICE :"+c.price);
        System.out.println("PROCESSOR CORE :"+p.core);
        System.out.println("PROCESSOR MANUFACTURER :"+p.mf1);
        System.out.println("RAM MEMORY :"+r.mem);
        System.out.println("PROCESSOR MANUFACTURER :"+r.mf2);
    }
    
}
