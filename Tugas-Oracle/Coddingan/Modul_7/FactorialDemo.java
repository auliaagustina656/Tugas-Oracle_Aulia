package Modul_7;

public class FactorialDemo {
    public int num = 10;

    public int getFactorial() {
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }

    @Override
    public String toString() {
        StringBuilder deret = new StringBuilder();
        for (int i = 1; i <= num; i++) {
            deret.append(i);
            if (i < num) {
                deret.append(" * ");
            }
        }
        return "Factorial: " + num + "! = " + deret.toString() + " = " + getFactorial();
    }

    public static void main(String[] args) {
        FactorialDemo obj = new FactorialDemo();
        System.out.println(obj.toString());
    }
}