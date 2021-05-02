# LargestSubMatrix-with-all-0s

# Problem Statement
Given an m * n boolean matrix B, find its largest square submatrix (k * k matrix) whose elements are all zeros. Describe a dynamic programming algorithm for solving this problem.

# Implementation 
We have been given the problem to find a Sub-Square Matrix k x k inside a randomly generated Boolean Matrix B with size m x n which contains all 0s. In the algorithm, I have initialized a Sub-Problem matrix S which will store the solution for each recursive sub-problem. 
The sub-problem matrix S is filled with values from first row and first column of matrix B, respectively, while rest of the elements of S are left vacant. The algorithm computes the maximum of left, top, and top-left value corresponding to the column element E from matrix S, if E = 0 in Boolean matrix B. The maximum value is then decremented by 1 and is stored at the same position in matrix S where E is stored in matrix B. If the column element E = 1 in Boolean matrix B, then 1 is stored at the same position where E=1 is encountered in matrix B. The recursion continues until the Sub-Problem matrix S is filled. 
The sub-square matrix with all 0s in B would be represented as a sub-square matrix with elements less than or equal to 0. The position of the minimum element in S is recorded, and matrix B is traversed bottom-up to return the sub-square matrix with size k x k containing all 0s. 

# Graph Analysis 

![image](https://user-images.githubusercontent.com/56484260/116825832-ee67fd00-ab5e-11eb-9e22-bc796b1afd70.png)

Matrices 10 x 10, 10 x 100, 10 x 1000, 100 x 1000, and 1000 x 1000 are represented as 1,2,3,4 and 5, respectively. 
We can see that the running times for matrices are increasing slowly when the size of matrix is in the lower order, i.e. when the matrix is 10 x 10, 10 x 100 and 10 x 1000 respectively; however, there is a sharp increase in the running time when the size of matrix becomes 100 x 1000 and 1000 x 1000, which goes on to prove that the Time Complexity is indeed O(m * n), as the values of m and n increase. 
The memory utilization for matrices in the lower order is almost same as we can observe from the graph. The matrix 10 x 10, 10 x 100 and 10 x 1000 have the same memory utilization. There is a slight increase in memory utilization between matrix 10 x 1000 and 100 x 1000, but we can see a large memory utilization for matrix 1000 x 1000. This goes in to prove that the space complexity, depends on the size of parent matrix B and the larger the size of the matrix, the greater the space is required. 


