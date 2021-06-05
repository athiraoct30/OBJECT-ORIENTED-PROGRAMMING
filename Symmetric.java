import java.util.*;
public class Symmetric {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a[][]=new int[100][100];
        int b[][]=new int[100][100];
        int r,c,flag=0;
        System.out.println("Enter row and column size : ");
        r=sc.nextInt();
        c=sc.nextInt();
        if(r==c)
        {
        System.out.println("Enter matrix : ");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        
    
        for(int i=0;i<r;i++)   
        {
            for(int j=0;j<c;j++)
            {
                b[j][i]=a[i][j];
            }
        }
        for(int i=0;i<r;i++)   
        {
            for(int j=0;j<c;j++)
            {
                if(b[i][j]!=a[i][j])
                {
                    flag=1;
                    break;
                }
            }
        }
        if(flag==1)
            System.out.println("It is not a Symmetric Matrix");
        else
            System.out.println("It is a Symmetric Matrix");
        }
        else
            System.out.println("Since matrix is not a square matrix, it is not symmetric");
    }
}
