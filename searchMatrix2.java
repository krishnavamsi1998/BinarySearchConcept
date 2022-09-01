//left bottom approach , we can also so right top approach
//O(m+n)
// given each row is sorted and each col is sorted 
// but no row continuity

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int rows=matrix.length;
        int cols=matrix[0].length;
        int k=target;
        int i,j;
        i=rows-1;
        j=0;
        
        while(i>=0 && j<cols)
        {
            //move up
            if(k<matrix[i][j])
                i-=1;
            //move right
            else if(k>matrix[i][j])
                j+=1;
            // if equal
            else 
                return true;
        }
        return false;
        
    }
}
