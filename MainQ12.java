import java.io.*;
class Person {
   String name;
   String gender;
   String address;
   int age;
   
   Person(String name,String gender,String addr,int age)
   {
    this.name = name;
    this.gender = gender;
    this.address = addr;
    this.age = age;
   }

   protected void display(){
    System.out.println("Name : " + this.name);
    System.out.println("Gender : " + this.gender);
    System.out.println("Address : " + this.address);
    System.out.println("Age : " + this.age);
   }
}

class Employee extends Person{
    int empId;
    String companyName;
    String qualification;
    int salary;

    Employee(String name,String gen,String add,int age,int id,String comp,String qual,int salary)
    {
        super(name,gen,add,age);
        this.empId = id;
        this.companyName =comp;
        this.qualification =qual;
        this.salary=salary;
    }
    protected void display()
    {
        super.display();
        System.out.println("ID : " + this.empId);
        System.out.println("Company name : " + this.companyName);
        System.out.println("Qualification: " + this.qualification);
        System.out.println("Salary : " + this.salary);
       }
}

class Teacher extends Employee{
    String subject;
    String dept;
    int tchrid;

    Teacher(String name,String gen,String add,int age,int id,String comp,String qual,int salary,String subj,String dept,int tchid){
        super(name,gen,add,age,id,comp,qual,salary);
        this.dept =dept;
        this.tchrid =tchid;
        this.subject =subj;
    }

    public void display(){
        System.out.println("..........................................");
        super.display();
        System.out.println("Subject : " + this.subject);
        System.out.println("Department : " + this.dept);
        System.out.println("Teacher ID : " + this.tchrid);
        System.out.println("..........................................");
    }
}
class MainQ12{
	public static void main(String[] args)
		{
		Teacher []tr= new Teacher[10];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int empid=0,sal=0,i,n=0,age=0,trid=0;
		String name,addr,dept,subj,gen,cname,qua;
		try
			{
			System.out.println("Enter no of teachers:");
			n=Integer.parseInt(br.readLine());

			for(i=0;i<n;i++)
				{
				System.out.println("Enter name:");
				name=br.readLine();
                                System.out.println("Enter gender:");
				gen=br.readLine();
                                System.out.println("Enter address:");
				addr=br.readLine();
                                System.out.println("Enter age:");
				age=Integer.parseInt(br.readLine());
                                System.out.println("Enter Empid:");
				empid=Integer.parseInt(br.readLine());
                                System.out.println("Enter Company name:");
				cname=br.readLine();
                                System.out.println("Enter qualification:");
				qua=br.readLine();
                                System.out.println("Enter salary:");
				sal=Integer.parseInt(br.readLine());
                                 System.out.println("Enter subject:");
				subj=br.readLine();
                                System.out.println("Enter department:");
				dept=br.readLine();
                                  System.out.println("Enter teacherid:");
			        trid=Integer.parseInt(br.readLine());
                               
				tr[i]=new Teacher(name,gen,addr,age,empid,cname,qua,sal,subj,dept,trid);				
				}		
			}
		catch(IOException e1)
			{
                            System.out.println(e1);
                        }
		for(i=0;i<n;i++)
			{
			tr[i].display();
			}
		}
	}