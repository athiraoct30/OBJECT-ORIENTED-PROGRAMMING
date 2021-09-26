import java.io.*;
class StringManipulation
	{
	public static void main(String []args)
            {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s1,s2,s3;
		int ch;
		try
			{
			System.out.println("Enter 2 strings:");
			s1=br.readLine();
			s2=br.readLine();
			do
				{
				System.out.println("\n1-Copy, 2-Append, 3-Compare,4-Reverse,5-exit \n Enter your choice:");
				ch=Integer.parseInt(br.readLine());
				switch(ch)
					{
					case 1: s3=s1;
						System.out.println("Copied string:"+s3);
						break;
					case 2: s3=s1+ "  "+s2;
						System.out.println("Appended strings:"+s3);
						break;
					case 3: int x=s1.compareTo(s2);
						if(x==0)
							System.out.println("Both Strings are equal");
						else if(x<0)
							System.out.println("2ND STRING is larger");
						else
							System.out.println("1ST STRING is larger");
						break;
					case 4: s3=new StringBuffer(s1).reverse().toString();
						System.out.println("Reversed string:"+s3);
						break;
					
					}
				}while(ch<5);
		}
		catch(IOException e)
			{
			System.out.println(e);
			}
		}
	}
						