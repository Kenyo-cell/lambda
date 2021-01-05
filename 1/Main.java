public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        calc.println.accept(calc.mul.apply(5, 2));
        calc.println.accept(calc.abs.apply(-7));
        /*
        b substraction is zero and next c = a / b is division by zero exception
        int a = calc.plus.apply(1, 2);
        int b = calc.sub.apply(1, 1);
        int c = calc.div.apply(a, b);
        calc.println.accept(c);
        */
    }
}