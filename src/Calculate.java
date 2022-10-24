import java.util.Scanner;

public class Calculate {
    public double numberOne = 0;
    public double numberTwo = 0;
    public char symbol;
    public double inputInfoOne() {
        System.out.println("Введите первое число");
        Scanner in = new Scanner(System.in);
        numberOne = in.nextDouble();
        return numberOne;
    }
    public double getInputInfoOne(){
        return numberOne;
    }
    public char inputInfoTwo() {
        System.out.println("Введите знак +, -, * или /");
        Scanner in = new Scanner(System.in);
        symbol = in.next().charAt(0);
        return symbol;
    }
    public char getInputInfoTwo(){
        return symbol;
    }
    public double inputInfoThree(){
        System.out.println("Введите второе число");
        Scanner in = new Scanner(System.in);
        numberTwo = in.nextDouble();
        return numberTwo;
    }
    public double getInputInfoThree(){
        return numberTwo;
    }

    public void sum (double a, double b, char c){
        double result = a + b;
        System.out.printf("%.2f %c %.2f %c %.2f", a, c, b, '=',  result);
    }
    public void difference(double a, double b, char c){
        double result  = a - b;
        System.out.printf("%.2f %c %.2f %c %.2f", a, c, b, '=',  result);
    }
    public void multiplication(double a, double b, char c){
        double result =  a*b;
        System.out.printf("%.2f %c %.2f %c %.2f", a, c, b, '=',  result);
    }
    public void  division(double a, double b, char c){
        double result = a/b;
        System.out.printf("%.2f %c %.2f %c %.2f", a, c, b, '=',  result);
    }


}
