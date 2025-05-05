package basic_java;
import java.util.Scanner;

// 2 D array  input output

public class twodarray {
    public static void main(String[] args) {
        
        Scanner inp=new Scanner(System.in);
        System.out.print("enter row size :");
        int row=inp.nextInt();
        System.out.print("enter col size :");
        int col=inp.nextInt();

        int array[][]=new int [row][col];

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print("enter array value index : "+i+j +" : ");
                array[i][j]=inp.nextInt();
            }
        }

        System.out.println("show 2d array data");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
             
                System.out.println(array[i][j] +" : "+i+j);
            }
        }

    }
    
}
