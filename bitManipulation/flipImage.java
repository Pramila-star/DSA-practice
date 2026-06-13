package bitManipulation;

public class flipImage {
    static int[][] flipAndInvertImage(int[][] image) {
        for(int[] row : image){
            //reverse this array
            for( int i = 0; i< (image[0].length + 1)/2; i++) {
               // swap
               int temp = row[i] ^ 1;
               row[i] = row[image[0].length - i - 1] ^ 1;
               row[image[0].length - i - 1] = temp;
            }
        }
        return image;
    }

    public static void main(String args[]) {
        int[][] image = {{1, 1, 0},
                         {1, 0, 1},
                         {0, 0, 0}};

        int[][] ans = flipAndInvertImage(image);

        for (int[] row : ans) {

            for (int val : row) {
                System.out.print(val + " ");
            }

            System.out.println();
        }

    }
}
