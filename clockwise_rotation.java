public class clockwise_rotation {
    public static void rotateLayer(int[][] matrix,int start,int end){
        if(start>=end){
            return;
        }

        //rotate this layer
        for(int i=0;i<end-start;i++){
            int top = matrix[start][start+i]; // for top element

            //left->top
            matrix[start][start+i]= matrix[end-i][start];

            //botton->left
            matrix[end-i][start]= matrix[end][end-i];

            //right->botttom
            matrix[end][end-i]= matrix[start+i][end];

            //top->right
            matrix[start+i][end]=top;

            

            
        }
        rotateLayer(matrix,start+1,end-1);
    }

    public static void rotate(int[][] matrix){
        rotateLayer(matrix,0,matrix.length-1);
    }
    public static void main(String args[]){
        int[][] matrix =  {{1,2,3,4},
                           {5,6,7,8},
                           {9,10,11,12},
                           {13,14,15,16}};
        rotate(matrix);

        // print rotated matrix
        for(int i =0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
    
}
