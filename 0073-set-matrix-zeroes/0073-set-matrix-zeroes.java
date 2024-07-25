class Solution {
    public void setZeroes(int[][] matrix) {
        boolean[] zeroRows = new boolean[matrix.length];
        boolean[] zeroCols = new boolean[matrix[0].length];
        
        // Find rows and columns containing zeroes
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j] == 0) {
                    zeroRows[i] = true;
                    zeroCols[j] = true;
                }
            }
        }
        
        // Set rows to zero
        for(int i = 0; i < matrix.length; i++) {
            if(zeroRows[i]) {
                for(int j = 0; j < matrix[0].length; j++) {
                    matrix[i][j] = 0;
                }
            }
        }
        // Set columns to zero
        for(int j = 0; j < matrix[0].length; j++) {
            if(zeroCols[j]) {
                for(int i = 0; i < matrix.length; i++) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

}
/*
class Solution {
    public void setZeroes(int[][] matrix) {
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix.length;j++)
            {
                if(matrix[i][j]==0)
                {
                    for(int k=0;k<matrix.length;k++)
                    {
                        matrix[i][k]=0;
                        matrix[k][j]=0;
                    }
                }
            }
        }
    }
}*/