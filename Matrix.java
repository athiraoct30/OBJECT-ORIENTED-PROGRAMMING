import java.util.*;
public class Matrix {
   public static void main(String args[]) {
           int r,c;
           int[][] a = new int[100][100];
           int[][] b = new int[100][100];
           Scanner sc=new Scanner(System.in);
           System.out.println("Enter number of rows: ");
           r= sc.nextInt();
           System.out.println("Enter number of colums: ");
           c= sc.nextInt();
           System.out.println("Enter MATRIX 1: ");
           for(int i=0;i<r;i++)
           {
               for(int j=0;j<c;j++)
               {
                   a[i][j]=sc.nextInt();
               }
           }      System.out.println("Enter MATRIX 2: ");
           for(int i=0;i<r;i++)
           {
               for(int j=0;j<c;j++)
               {
                   b[i][j]=sc.nextInt();
               }
           }      
           int[][] s=new int[r][c];
           for(int i=0;i<r;i++)
           {
               for(int j=0;j<c;j++)
               {
                   s[i][j]=a[i][j]+b[i][j];
               }
           }      
           System.out.println("SUM : ");
           for(int i=0;i<r;i++)
           {
               for(int j=0;j<c;j++)
               {
                   System.out.print(s[i][j]+"    ");
               }
               System.out.println("");
           }  
    }
}

