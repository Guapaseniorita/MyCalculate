public class Main {
    public static void main(String[] args) throws Exception {
        Calculate calculate = new Calculate();
        for (; ; ) {
            try {
                calculate.inputInfoOne();
                calculate.inputInfoTwo();
                calculate.inputInfoThree();
            } catch (Exception e) {
                System.out.println("Данные введены не верно");
            }
            double numberOne = calculate.getInputInfoOne();
            double numberTwo = calculate.getInputInfoThree();
            char symbol = calculate.getInputInfoTwo();
            switch (symbol) {
                case '+':
                    calculate.sum(numberOne, numberTwo, symbol);
                    break;
                case '-':
                    calculate.difference(numberOne, numberTwo, symbol);
                    break;
                case '*':
                    calculate.multiplication(numberOne, numberTwo, symbol);
                    break;
                case '/':
                    calculate.division(numberOne, numberTwo, symbol);
                    break;
                default:
            }
        }
    }
}
