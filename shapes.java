import java.io.*;
class shapes
	{
	void area(int l)
		{
		System.out.println("Area of square:"+l * l);
		}
	void area(int l, int b)
		{
		System.out.println("Area of rectangle:"+l * b);
		}
	void area(float l)
		{
		System.out.println("Area of circle:"+3.14 * l *l);
		}
	public static void main(String []args) throws IOException
		{
		int l,b,s;
                float r;
		shapes sp= new shapes();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                int ch;
                do
                {
                   System.out.println("\n 1 . Square \t 2 . Rectangle \t 3 . Circle \t 4.Exit \n Enter your choice :");
                   ch =Integer.parseInt(br.readLine());
                switch(ch)
                  {
                    case 1:
			System.out.println("Enter side of square:");
                        s=Integer.parseInt(br.readLine());
			sp.area(s);
                        break;
                    case 2:
                        System.out.println("Enter length and breadth of rectangle:");
                        l=Integer.parseInt(br.readLine());
                        b=Integer.parseInt(br.readLine());
			sp.area(l,b);
                        
                        break;
                    case 3:
                        System.out.println("Enter radius of circle:");
                        r=Float.parseFloat(br.readLine());
			sp.area(r);
                        break;
                  } 
                }while(ch<4);
                
	}
}