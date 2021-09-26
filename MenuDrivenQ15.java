import java.io.*;
interface calculate
	{
	void area();
	void perimeter();
	}
class rectangle implements calculate
	{
	int l=10,b=20;
	public void area()
		{
		System.out.println("area of rectangle:"+ (l*b));
		}
	public void perimeter()
		{
		System.out.println("perimeter of rectangle:"+(2*(l+b)));
		}
	}

class circle implements calculate
	{
        int r=10;
	public void area()
		{
		System.out.println("area of circle:"+ (3.14*r*r));
		}
	public void perimeter()
		{
		System.out.println("perimeter of circle:"+ (2*3.14*r));
		}
	}
class MenuDrivenQ15
	{
	public static void main(String[] args) 
		{
		rectangle r = new rectangle();
		circle c = new circle();
		int ch=0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try
			{
			 while (true) {
                            System.out.println("1:Area of Circle");
                            System.out.println("2:Perimeter of Circle");
                            System.out.println("3:Area of Rectangle");
                            System.out.println("4:Perimter of Rectangle");
                            System.out.println("5:EXIT");
                            System.out.println("Enter choice ");
                            ch = Integer.parseInt(br.readLine());
                            switch (ch) {
                            case 1:
                                c.area();
                                break;
                            case 2:
                                c.perimeter();
                                break;
                            case 3:
                                r.area();
                                break;
                            case 4:
                                r.perimeter();
                                break;
                            case 5:
                                System.exit(0);
                            default:
                                System.out.println("invalid choice!");
            }
        }
			}
		catch(IOException e1)
			{System.out.println(e1);}
		}
	}