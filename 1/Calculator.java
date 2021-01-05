import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.function.Consumer;

public class Calculator {
    static Supplier<Calculator> instance = Calculator::new;

    public BinaryOperator<Integer> plus = (a, b) -> a + b;
    public BinaryOperator<Integer> sub = (a, b) -> a - b;
    public BinaryOperator<Integer> mul = (a, b) -> a * b;
    public BinaryOperator<Integer> div = (a, b) -> a / b;

    public UnaryOperator<Integer> pow = a -> a * a;
    public UnaryOperator<Integer> abs = a -> a < 0 ? -a : a;

    public Predicate<Integer> isPositive = a -> a > 0;

    public Consumer<Integer> println = System.out::println;
}
