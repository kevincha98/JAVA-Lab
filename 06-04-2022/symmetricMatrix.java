import java.util.Scanner;

public class symmetricMatrix {
    public void Display(int [][] arr,int row,int col){
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        int [][] mat = new int[3][3];
        int [][] trans=new int[3][3];
        int row,col;

        symmetricMatrix obj=new symmetricMatrix();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the rows and columns of the matrix");
        row=s.nextInt();
        col=s.nextInt();
        System.out.println("Enter the elements of the matrix");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                mat[i][j]=s.nextInt();
            }
        }
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                trans[j][i]=mat[i][j];

            }   
    
        }
        System.out.println("Entered matrix");
        obj.Display(mat,row,col);
        System.out.println("Transpose of the matrix");
        obj.Display(trans,row,col);
        
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(mat[i][j]!=trans[i][j]){
                    System.out.println("Matrix is not symmetric");
                    System.exit(0);
                }
            }
        }
        System.out.println("The given matrix is symmetric");

    }
}