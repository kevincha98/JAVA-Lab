import java.util.Scanner;

public class matrixAddition {
    public void Display(int [][] arr,int row,int col){
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        int[][] mat1=new int[5][5];
        int[][] mat2=new int[5][5];
        int[][] mat3=new int[5][5];
        int rows1, cols1, rows2, cols2;

        matrixAddition obj=new matrixAddition();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of matrix 1");
        rows1=s.nextInt();
        cols1=s.nextInt();
        System.out.println("Enter the elements of matrix 1");
        for(int i=0;i<rows1;i++)
        {
            for(int j=0;j<cols1;j++)
            {
                mat1[i][j]=s.nextInt();
            }
        }
        System.out.println("Enter the number of rows and columns of matrix 2");
        rows2=s.nextInt();
        cols2=s.nextInt();
        System.out.println("Enter the elements of matrix 2");
        for(int i=0;i<rows2;i++)
        {
            for(int j=0;j<cols2;j++)
            {
                mat2[i][j]=s.nextInt();
            }
        }

        

        if(rows1==rows2 && cols1==cols2)
        {
            for(int i=0;i<rows1;i++)
            {
                for(int j=0;j<cols1;j++)
                {
                    mat3[i][j]=mat1[i][j]+mat2[i][j];
                }
            }

            System.out.println("1st matrix");
            obj.Display(mat1,rows1,cols1);
            System.out.println("2nd matrix");
            obj.Display(mat2,rows2,cols2);
            System.out.println("Addition of matrix");
            obj.Display(mat3,rows1,cols1);
        }
        else
        {
            System.out.println("The matrices cannot be added");
        }

    }
}