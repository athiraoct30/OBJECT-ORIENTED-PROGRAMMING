import java.io.*;
class emp
	{
	int empno,salary;
	String ename;
	
	void getdata(int empno, String ename, int salary)
		{
		this.empno=empno;
		this.ename=ename;
		this.salary=salary;
		}
	void display()
		{
		System.out.println("Employee Details:");
		System.out.println("Emp no:"+ empno);
		System.out.println("Emp name:"+ ename);
		System.out.println("Salary:"+ salary);
		}
	}
class EmployeeQ9
	{
	public static void main(String[] args)
		{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		emp []e= new emp[10];
		int eno1=0,eno2=0,sal=0,i,n=0;
		String name;
		try
			{
			System.out.println("Enter no of employees:");
			n=Integer.parseInt(br.readLine());

			for(i=0;i<n;i++)
				{
				System.out.println("Enter the empno,ename,salary:");
				eno1=Integer.parseInt(br.readLine());
				name=br.readLine();
				sal=Integer.parseInt(br.readLine());
				e[i]=new emp();
				e[i].getdata(eno1,name,sal);
				}
			System.out.println("enter the emp no to search:");
			eno2=Integer.parseInt(br.readLine());
			for(i=0;i<n;i++)
				{
				if(e[i].empno==eno2)	
					{
					e[i].display();
					break;
					}
				}
			}
		catch(IOException e1)
			{System.out.println(e1);}
		}
	}