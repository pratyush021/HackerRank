// This is my first commit 
import java.util.Scanner;
class sum{
    public static void main(String []args)
    {
        int n,sum1,sum2,i,j,diff;
        sum1 = 0;
        sum2 = 0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[][] a = new int[n][n];
        for( i = 0;i < n;i++)
        {
            for( j = 0;j < n;j++)
            {
                a[i][j] = sc.nextInt();
            }
        }
        //finding sum

    
        for (i = 0; i < n; i++) 
        { 
            for (j = 0; j < n; j++) 
            { 
                // finding sum of primary diagonal 
                if (i == j) 
                    sum1 += a[i][j]; 
       
                // finding sum of secondary diagonal 
                if (i == n - j - 1) 
                    sum2 += a[i][j]; 
            } 
        }
    diff = sum2-sum1;
    System.out.println(" "+diff);
   
    // Write your code here
    }
}
