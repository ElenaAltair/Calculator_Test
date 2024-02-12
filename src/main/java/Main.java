public class Main {


    public static void main(String[] args) {
        /*
    В классе Main в методе main() создайте экземпляр класса Calculator
    через вызов статической переменной instance
     */
        Calculator calc = Calculator.instance.get();

    /*
    Произведите несколько математических операций над числами
     */
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        int c = calc.devide.apply(a, b);


        //И выведите в консоль результат
        //В данном примере происходит арифметическая ошибка из-за деления на ноль. Всё что нужно, это обработать ошибку.
        calc.println.accept(c);

    }
}