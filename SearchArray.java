import java.io.*;
class SearchArray
	{
	public static void main(String []args)
            {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int []arr= new int[5];
		int item=0,flag=0,i=0;
		try
                    {
			System.out.println("Enter any 5 numbers:");
			for(i=0;i<5;i++)
				{
				arr[i]=Integer.parseInt(br.readLine());
				}
			System.out.println("Enter the Item to search:");
			item=Integer.parseInt(br.readLine());
                    }
		catch(IOException e)
                    {
			System.out.println(e);
                    }
		for(i=0;i<5;i++)
                    {
			if(item==arr[i])
                            {
				flag=1;
				break;
                            }
                    }
		if(flag==1)
			System.out.println("Item found at position  "+ (i+1));
		else
			System.out.println("Item not found ");
		}
	}