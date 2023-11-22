public class Main {
    public static void main(String[] args) {

        short[][] matrix = {
                {1, 2, 3},
                {2, 3, 4},
                {2, 2, 2}
        };

        String text = "Example";

        TextSolution TextSolution = new TextSolution(text);
        MatrixSolution MatrixSolution = new MatrixSolution(matrix);

        System.out.println("Среднее геометрическое значение:");
        System.out.println(MatrixSolution.geoMult());
        System.out.println("Сумма диагоналей:");
        System.out.println(MatrixSolution.dioSum());
        System.out.println("Самое часто встречаемое значение матрицы:");
        System.out.println(MatrixSolution.matrixPop());
        System.out.println("Обработанный текст:");
        System.out.println(TextSolution.solutionText(text));
    }
}