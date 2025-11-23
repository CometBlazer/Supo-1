public class Test {

    public static int lowestCommon(long a, long b){
        for(int pos = 0; pos < 16; pos++){
            long mask = 1L;

            if(((a & mask) != 0) && ((b & mask) != 0)){
                return pos;
            }

            a >>= 1;
            b >>= 1;

            if(a == 0 || b == 0){
                break;
            }
        }
        return -1;
    }

    public static float[][] createUnitMatrix(int n){
        float[][] matrix = new float[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i == j){
                    matrix[i][j] = 1.0f;
                } else {
                    matrix[i][j] = 0.0f;
                }
            }
        }
        return matrix;
    }

    public static float[][] transposeMatrix(float[][] matrix){
        int rows = matrix.length;
        int cols = matrix[0].length;
        for(int i = 0; i < rows; i++){
            for(int j = i + 1; j < cols; j++){
                float temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        return matrix;
    }

    public static void modify(int[] arr) {
        System.out.println("Inside modify(), arr reference = " + arr);
        arr[0] = 99;     // modifies the array through the copy of the reference
    }

    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println("Lowest common set bit position of 18 and 20: " + lowestCommon(14, 25));

        float[][] unitMatrix = createUnitMatrix(3);
        System.out.println("3x3 Unit Matrix:");
        for(float[] row : unitMatrix){
            for(float val : row){
                System.out.print(val + " ");
            }
            System.out.println();
        }
        float[][] transposed = transposeMatrix(new float[][]{
            {1.0f, 2.0f, 3.0f},
            {4.0f, 5.0f, 6.0f},
            {7.0f, 8.0f, 9.0f}
        });
        System.out.println("3x3 Transposed Matrix:");
        for(float[] row : transposed){
            for(float val : row){
                System.out.print(val + " ");
            }
            System.out.println();
        }

        int[] test = {1, 2, 3};

        System.out.println("In main(), test reference = " + test);
        System.out.println("Before modify: " + test[0]);

        modify(test);

        System.out.println("After modify: " + test[0]);
    }
}
