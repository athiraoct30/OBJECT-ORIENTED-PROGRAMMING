/*11. single inheritance with constructor*/
import java.io.*;
class emp
	{
	int empid,salary;
	String ename,address;	
	
	emp(int empid, String ename, int salary,String address)
		{
		this.empid=empid;
		this.ename=ename;
		this.salary=salary;
		this.address=address;
		}
	
	}
class teacher extends emp
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
		System.out.println("employee details:");
		System.out.println("emp no:"+ empid);
		System.out.println("emp name:"+ ename);
		System.out.println("salary:"+ salary);
		System.out.println("address:"+ address);
		System.out.println("department:"+ dept);
		System.out.println("subject:"+ subj);
		}
	}
class inher
	{
	public static void main(String[] args)
		{
		teacher []t= new teacher[5];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int eno1=0,sal=0,i,n=0;
		String name,addr,dept,subj;
		try
			{
			System.out.println("enter no of employees:");
			n=Integer.parseInt(br.readLine());

			for(i=0;i<n;i++)
				{
				System.out.println("enter the empno,ename,salary,address,dept,subj:");
				eno1=Integer.parseInt(br.readLine());
				name=br.readLine();
				sal=Integer.parseInt(br.readLine());
				addr=br.readLine();
				dept=br.readLine();
				subj=br.readLine();
				t[i]=new teacher(eno1,name,sal,addr,dept,subj);				
				}		
			}
		catch(IOException e1)
			{System.out.println(e1);}
		for(i=0;i<n;i++)
			{
			t[i].display();
			}
		}
	}