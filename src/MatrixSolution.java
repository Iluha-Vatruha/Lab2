public class MatrixSolution {
    private short[][] matrixElements;
    protected MatrixSolution(short[][] matrix) {
        this.matrixElements = matrix;
    }

    protected int geoMult(){
        int n = 1;
        for (int i = 0; i < matrixElements.length; i++) {
            for (int j = 0; j < matrixElements[i].length; j++) {
                n *= matrixElements[i][j];
            }
        }
        n /= matrixElements.length * matrixElements.length;
        return n;
    }
    protected int dioSum() {
        int n = matrixElements.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += matrixElements[i][i];
            sum += matrixElements[i][n - 1 - i];
        }
        if (n % 2 == 1) {
            sum -= matrixElements[n / 2][n / 2];
        }
        return sum;
    }
    protected int matrixPop() {
        int[] array = new int[2 * 32768];
        for (int i = 0; i < matrixElements.length; i++) {
            for (int j = 0; j < matrixElements[i].length; j++) {
                array[matrixElements[i][j] + 32768] += 1;
            }
        }
        int max_value = 0;
        int max_count = 0;
        for (int i = 0; i < array.length; i++) {
            if (max_count < array[i]) {
                max_value = i - 32768;
                max_count = array[i];
            }
        }
        return max_value;
    }
}
