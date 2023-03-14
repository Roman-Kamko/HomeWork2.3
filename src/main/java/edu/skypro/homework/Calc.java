package edu.skypro.homework;

import org.springframework.stereotype.Service;

@Service
public class Calc implements CalcFunctions {
    @Override
    public String greetings() {
        return "Добро пожаловать в калькулятор!";
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
        return a + " / " + b + " = " + (a / b);
    }
}
