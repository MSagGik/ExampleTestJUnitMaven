public class MyMath {
    public static double divide(int number1, int number2) {
        if(number2 == 0) // исключение деления на ноль
            throw new ArithmeticException("Can't divide by zero");
        return number1 / number2;
    }
}
