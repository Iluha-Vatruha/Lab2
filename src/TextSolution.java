public class TextSolution {
    private static final char[] vowels = {
            'E','e', 'U', 'u', 'O', 'o', 'A', 'a', 'I', 'i', 'Y', 'y'
    };
    private String operatedText;
    protected TextSolution(String text){
        operatedText = text;
    }

    protected String solutionText(String text){
        char[] operatedText = this.operatedText.toCharArray();
        for (int n = 0; n < operatedText.length; n++) {
            for (int i = 0; i < operatedText.length; i++) {
                for (int j = 0; j < 12; j++) {
                    if (operatedText[i] == vowels[j]) {
                        operatedText[i] = '-';
                    }
                }
            }
        }
        return new String(operatedText);
    }
}
