/**
 *
 * @author Chitranshu Raj and Lavanya Khular
 */

import java.util.ArrayList;
import java.util.List;

public class Algorithm {
    int Starti;
    int Startj;
    public void MaxSubSquare(int Matrix[][]){
        List<List<Integer>> result_matrix = new ArrayList<List<Integer>>();
        int row_size=Matrix.length;
        int col_size=Matrix[0].length;
        
        // A matrix S is initialized to solve sub-problems. 
        int S[][]=new int[row_size][col_size];

        // Initializing first column of S matrix.
        for(int a=0;a<col_size;a++){
            S[0][a] = Matrix[0][a];
        }

        // Initializing first column of S matrix.
        for(int b=0;b<row_size;b++){
            S[b][0] = Matrix[b][0];
        }

        // Filling the S matrix. 
        // Decrementing columnn elements where the top, top-left and left to the 
        // respective element is 0.
        // Setting value=1 where column element=1.
        
        for(int m=1;m<row_size;m++){
            for(int n=1;n<col_size;n++){
                if(Matrix[m][n]==0){
                    /* 
                    The column elements in the top and top-left are compared
                    with the element left to the [m,n] element. 
                    The maximum value returned is decremented by 1.
                    */
                    S[m][n]= Math.max(S[m][n-1],Math.max(S[m-1][n-1],S[m-1][n]))-1;
                }
                else{ 
                    S[m][n]=1;
                }
            }
        }

        // Setting the init values of minS and its correspinding [i,j] respectively. 

        int minS=S[0][0];
        int i=0;
        int j=0;


        /* 
        Finding the minimum element to traverse the Matrix bottom up;
        Setting the coordinates as i and j, where the min element is located. 
        */
        
        for(int x=0;x<row_size;x++){
            for(int y=0;y<col_size;y++){
                if(minS>=S[x][y]){
                    minS=S[x][y];
                    i=x;
                    j=y;
                }
            }
        }

        /* 
        Traversing the S matrix bottom-up, such that a sub-square matrix with 
        only 0's can be pointed. 
        According to [i,j] values from the S matrix a result matrix is filled by
        getting the values from orginal matrix M. 
        */
        Starti=i+minS;
        Startj=j+minS;
        for(int e=i;e>=i+minS;e--){
            List<Integer> store=new ArrayList<Integer>();
            for(int f=j;f>=j+minS;f--){
                store.add(Matrix[e][f]);
            }
            result_matrix.add(store);
        }
        
        display_matrix(result_matrix);
    }
    
    private void display_matrix(List<List<Integer>> result){
        int k=result.size();
        System.out.println("The largest Sub-SquareMatrix is of size: "+k+" x "+k);
        System.out.println("The Starting Indices are: "+ Starti+","+Startj+"\n");
        for(int x=0;x<k;x++){
            for(int j:result.get(x)){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
