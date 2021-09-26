import java.io.*;
class employee
	{
	int empid,salary;
	String ename,address;	
	
	employee(int empid, String ename, int salary,String address)
		{
		this.empid=empid;
		this.ename=ename;
		this.salary=salary;
		this.address=address;
                }       
	
	}
class teacher extends employee
	{
	String dept,subj;
	teacher(int empid, String ename, int salary,String address,String dept,String subj)
		{
		super(empid,ename,salary, address);
		this.dept=dept;
		this.subj=subj;
		}
	void display()
		{
		System.out.println(empid+"      "+ename+"          "+salary+"       "+address+"        "+dept+"        "+subj);
                }
	}
class inheritance
	{
	public static void main(String[] args)
		{
		teacher []t= new teacher[10];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int eno1=0,sal=0,i,n=0;
		String name,addr,dept,subj;
		try
			{
			System.out.println("Enter no of employees:");
			n=Integer.parseInt(br.readLine());

			for(i=0;i<n;i++)
				{
				System.out.println("Enter the employee number:");
				eno1=Integer.parseInt(br.readLine());
                                System.out.println("Enter the employee name:");
				name=br.readLine();
                                System.out.println("Enter the employee salary:");
				sal=Integer.parseInt(br.readLine());
                                System.out.println("Enter the employee address:");
				addr=br.readLine();
                                System.out.println("Enter the employee department:");
				dept=br.readLine();
                                System.out.println("Enter the employee subject:");
				subj=br.readLine();
				t[i]=new teacher(eno1,name,sal,addr,dept,subj);				
				}		
			}
		catch(IOException e1)
			{
                            System.out.println(e1);
                        }
                System.out.println("EmpNo"+"    "+"EmpName"+"       "+"Salary"+"    "+"Address"+"       "+"Department"+"        "+"Subject");
		for(i=0;i<n;i++)
			{
			t[i].display();
			}
		}
	}
