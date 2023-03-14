package edu.skypro.homework;

import org.springframework.stereotype.Service;

@Service
public class Calc implements CalcFunctions {
    @Override
    public String greetings() {
        return """
                <h2>Добро пожаловать в калькулятор!</h2>
                Пример использования: divide?num1=X&num2=X<br>
                где divide - действие, X - любое целое число.<br>
                <h4>Доступные команды:</h4>
                <ul>
                    <li>plus - сложить;</li>
                    <li>minus - вычесть;</li>
                    <li>multiply - умножить;</li>
                    <li>divide - разделить;</li>
                </ul>
               """;
    }

    @Override
    public String plus(int a, int b) {
        return a + " + " + b + " = " + (a + b);
    }

    @Override
    public String minus(int a, int b) {
        return a + " - " + b + " = " + (a - b);
    }

    @Override
    public String multiply(int a, int b) {
        return a + " * " + b + " = " + (a * b);
    }

    @Override
    public String divide(int a, int b) {
        if (b == 0) {
            return "Деление на ноль не определено";
        }
        return a + " / " + b + " = " + (double) a / b;
    }
}
