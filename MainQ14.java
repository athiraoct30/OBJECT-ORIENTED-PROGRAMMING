import java.io.*;
class students
	{
	int rollno;
	String name;
	float marks;
	void getdata(int rollno,String name,float marks)
		{
		this.rollno=rollno;
		this.name=name;
		this.marks=marks;
		}
	}
interface sports
	{
	final int score=10;
	void show();
	}
class result extends students implements sports
	{
	public void show()
		{
		System.out.println(rollno+"         "+name+"        "+marks+"   "+score);
		}
	}
class MainQ14
	{
	public static void main(String []args)
		{
		int rollno=0; 
		String name=""; 
		float marks=0;
		result r = new result();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try
			{
			System.out.println("Enter rollno:");
			rollno=Integer.parseInt(br.readLine());
                        System.out.println("Enter Name:");
			name=br.readLine();
                        System.out.println("Enter Marks:");
			marks=Float.parseFloat(br.readLine());
			}
		catch(IOException e)
			{
			System.out.println(e);
			}
		r.getdata(rollno,name,marks);
                System.out.println("ROLL NO"+"     "+"NAME"+"      "+"MARKS"+"  "+"SCORE");
		r.show();
		}
	}
		

			