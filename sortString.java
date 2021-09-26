import java.util.*;
public class sortString {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String[] arr=new String[100];
       String temp;
        int s;
        System.out.println("Enter size of array :");
        s=sc.nextInt();  
        System.out.println("Enter strings :");
        for(int i=0;i<=s;i++)
        {
            arr[i]=sc.nextLine();
        }
        for(int i=0;i<s;i++)
        {
            for(int j=i+1;j<=s;j++)
            {
               if(arr[i].compareTo(arr[j])>0) 
               {
                   temp=arr[i];
                   arr[i]=arr[j];
                   arr[j]=temp;
               }
            }
        }
        System.out.println("Sorted String Array :");
        for(int i=0;i<=s;i++)
	{
            System.out.println(arr[i]);
        }
    }
}
