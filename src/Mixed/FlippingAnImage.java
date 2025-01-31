package Mixed;


// solved with gredy solution (good solution is with bit manipulation)
public class FlippingAnImage {
    public static void main(String[] args) {
        int[][] image = {
                {0,1},
                {1,0},
        };

//        {1,1,0},
//        {1,0,1},
//        {0,0,0}

//        {1,1,0,0},
//        {1,0,0,1},
//        {0,1,1,1},
//        {1,0,1,0}

        int[][] flippedImage = flipImage(image);
        int[][] invertedImage = invertImage(flippedImage);
        for (int[] row : invertedImage) {
            for (int val : row) {
                System.out.print(val + ",");
            }
            System.out.println();
        }
    }

    static int[][] invertImage(int[][] flippedImage){

        for (int row = 0; row < flippedImage.length; row++){
            for(int col = 0; col < flippedImage[row].length; col++){
                if(flippedImage[row][col] == 1){
                    flippedImage[row][col] = 0;
                }else{
                    flippedImage[row][col] = 1;
                }
            }
        }

        return flippedImage;
    }

    static int[][] flipImage(int[][] image){

        for (int row = 0; row < image.length; row++){
            int left = 0;
            int right = image[row].length - 1;
            for(int col = 0; col < image[row].length; col++){
                if(left >= right){
                    break;
                }
                int temp = image[row][left];
                image[row][left] = image[row][right];
                image[row][right] = temp;
                left++;
                right--;
            }
        }

        return image;
    }
}
