/**
 *
 * @author Chitranshu Raj
 */

import java.util.Random;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;

public class Test {
    private static Random rand=new Random();
    
    public static void matrix10x10(){
        int[][] matrix1 = new int[10][10];
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                int random_bool=rand.nextInt(2);
                matrix1[i][j]=random_bool;
            }
            // Remove Comments if you want to display matrix
            //System.out.println(Arrays.toString(matrix1[i]));
        }
        System.out.println();
        Algorithm a=new Algorithm();
        a.MaxSubSquare(matrix1);
    }
    
    public static void matrix10x100(){
        int[][] matrix2 = new int[10][100];
        for(int i=0;i<10;i++){
            for(int j=0;j<100;j++){
                int random_bool=rand.nextInt(2);
                matrix2[i][j]=random_bool;
            }
            // Remove Comments below if you want to display matrix
            //System.out.println(Arrays.toString(matrix2[i]));
        }
        System.out.println();
        Algorithm a=new Algorithm();
        a.MaxSubSquare(matrix2);
    }
    
    public static void matrix10x1000(){
        int[][] matrix3 = new int[10][1000];
        for(int i=0;i<10;i++){
            for(int j=0;j<1000;j++){
                int random_bool=rand.nextInt(2);
                matrix3[i][j]=random_bool;
            }
            // Remove Comments below if you want to display matrix
            //System.out.println(Arrays.toString(matrix3[i]));
        }
        System.out.println();
        Algorithm a=new Algorithm();
        a.MaxSubSquare(matrix3);
    }
    
    public static void matrix100x1000(){
        int[][] matrix4 = new int[100][1000];
        for(int i=0;i<100;i++){
            for(int j=0;j<1000;j++){
                int random_bool=rand.nextInt(2);
                matrix4[i][j]=random_bool;
            }
            // Remove Comments below if you want to display matrix
            //System.out.println(Arrays.toString(matrix4[i]));
        }
        System.out.println();
        Algorithm a=new Algorithm();
        a.MaxSubSquare(matrix4);
    }
    
    public static void matrix1000x1000(){
        int[][] matrix5 = new int[1000][1000];
        for(int i=0;i<1000;i++){
            for(int j=0;j<1000;j++){
                int random_bool=rand.nextInt(2);
                matrix5[i][j]=random_bool;
            }
            // Remove Comments below if you want to display matrix
            //System.out.println(Arrays.toString(matrix5[i]));
        }
        System.out.println();
        Algorithm a=new Algorithm();
        a.MaxSubSquare(matrix5);
    }
    
    public static void main(String []args){
        
        int choice;
        Scanner sc=new Scanner(System.in);
        long start_time;
        long end_time;
        System.out.println("| Choose the type of matrix |"+"\n"+"1.Matrix 10x10"
        + "\n"+ "2.Matrix 10x100" +"\n" + "3.Matrix 10x1000" + "\n" + 
        "4.Matrix 100x1000" + "\n" + "5.Matrix 1000x1000");
        System.out.print("Enter your choice: ");
        choice=sc.nextInt();
        System.out.println();
        
        start_time=System.nanoTime();
        System.out.println("| A Binary Matrix has been Randomly Generated |"+"\n");
        switch(choice){
            case 1:
                matrix10x10();
                break;
            case 2:
                matrix10x100();
                break;
            case 3:
                matrix10x1000();
                break;
            case 4:
                matrix100x1000();
                break;
            case 5:
                matrix1000x1000();
                break;
            default:
                break;
        }  
        end_time=System.nanoTime();
        System.out.println("\n"+"Processing Time(nanoseconds): "+(end_time-start_time)
        + "\n" + "Processing Time(milliseconds): "+(end_time-start_time)/1000000);
        System.out.println("Used Memory: " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) + " bytes");
    }
}
