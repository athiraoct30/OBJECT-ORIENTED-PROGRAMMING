import java.io.*;
public class Product {
    BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
    int pcode;
    String pname;
    double price;
    
    void getData() throws IOException 
    {
        System.out.println("Enter pcode :");
        pcode=Integer.parseInt(br.readLine());
        System.out.println("Enter pname :");
        pname=br.readLine();
        System.out.println("Enter price:");
        price=Double.parseDouble(br.readLine());
    }
    void showData()
    {
        System.out.println(pcode+"  "+pname+"   "+price);
    }
    static void compare(Product p1,Product p2,Product p3)
    {
        System.out.println("Product with lowest price is ");
        if(p1.price<p2.price && p1.price<p3.price)
        {
            System.out.println(p1.pname);
        }
        else if(p2.price<p1.price && p2.price<p3.price)
        {
            System.out.println(p2.pname);
        }
        else
        {
            System.out.println(p3.pname);
        }
    }
            
 
    public static void main(String args[])
    {
        Product p1=new Product();
        Product p2=new Product();
        Product p3=new Product();
        
        System.out.println("**********PRODUCT 1****************");
        p1.getData();
        System.out.println("**********PRODUCT 2****************");
        p2.getData();
        System.out.println("**********PRODUCT 3****************");
        p3.getData();
        System.out.println("***************************************");
        System.out.println("PCODE   PNAME   PRICE");
        p1.showData();
        p2.showData();
        p3.showData();
        compare(p1,p2,p3);
    }
}
