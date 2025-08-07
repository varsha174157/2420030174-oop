package skill03;
import java.util.*;
public class matrixmultiplication {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows and coloumns of first matrix: ");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();

        System.out.print("Enter rows and coloumns of second matrix: ");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();

       
        int[][] a = new int[r1][c1];
        int[][] b = new int[r2][c2];
        int[][] prod = new int[r1][c2];

        System.out.println("Enter first matrix:");
        for (int i = 0; i < r1; i++)
        {
            for (int j = 0; j < c1; j++)
            {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter second matrix:");
        for (int i = 0; i < r2; i++)
        {
            for (int j = 0; j < c2; j++) 
            {
                b[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < r1; i++)
        {
        	
            for (int j = 0; j < c2; j++)
            {
                for (int k = 0; k < c1; k++)
                {
                    prod[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        

        System.out.println("Product matrix:");
        for (int i = 0; i < r1; i++) 
        {
            for (int j = 0; j < c2; j++)
            {
                System.out.print(prod[i][j] + " ");
            }
            System.out.println();
        }

	}
}
