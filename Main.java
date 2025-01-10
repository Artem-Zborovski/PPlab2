import java.util.Scanner;
import java.util.Formatter;

public class Main {
    
    public static double taylorLog(double x, int terms) {
        double result = 0.0;
        double term = x;
        for (int n = 1; n <= terms; n++) {
            result -= term / n; 
            term *= x;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите значение x (в диапазоне -1 < x < 1): ");
        double x = scanner.nextDouble();
         if (x <= -1 || x >= 1) {
            System.out.println("Ошибка: x должен быть в диапазоне -1 < x < 1");
            return;
        }
        System.out.print("Введите количество членов ряда k (целое число): ");
        int terms = scanner.nextInt();
        
        double taylorResult = taylorLog(x, terms);
        double mathLogResult = Math.log(1 - x);
        
        Formatter formatter = new Formatter();
        formatter.format("Terms разных форматах: %d (десятичный), %#o (в восьмеричном), %#x (в шестнадцатеричном)\n", terms, terms, terms);
        int w=10;
        System.out.printf("Taylor (через printf): %+0"+w+"."+ (terms + 1) + "f%n", taylorResult);
        System.out.printf("Math.log (через printf): %+0"+w +"."+ (terms + 1) + "f%n", mathLogResult);
        formatter.format("Taylor : %+0"+w+"."+ (terms + 1) + "f%n", taylorResult);
        formatter.format("Math.log : %+0"+w +"."+ (terms + 1) + "f%n", mathLogResult);

        System.out.print(formatter);
        formatter.close();
        
    }
}
