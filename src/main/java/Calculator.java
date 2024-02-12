import java.util.function.*;

public class Calculator {
    /*
    Создайте класс Calculator.
    В нем создайте статическую переменную типа Supplier.
    Это функциональный интерфейс, реализующий метод get().
    С помощью данной переменной можно будет получить экземпляр класса Calculator.
    Реализуйте ссылку на вызов конструктора класса Calculator() { }
     */
    static Supplier<Calculator> instance = Calculator::new;

    /*
    Далее добавьте несколько переменных типа BinaryOperator
    для математических операций над двумя числами.
    Типизируйте их как Integer
     */
    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
    BinaryOperator<Integer> devide = (x, y) -> (y != 0) ? x / y : 0;


    /*
    Добавьте несколько переменных типа UnaryOperator
    для произведения математических операций над одним числом
     */
    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;

    /*
    Добавьте переменную типа Predicate для определения положительное ли число
     */
    Predicate<Integer> isPositive = x -> x > 0;

    /*
    Добавьте переменную типа Consumer для вывода числа в консоль.
    Используйте для этого ссылку на статический метод println()
     */
    Consumer<Integer> println = System.out::println;


}