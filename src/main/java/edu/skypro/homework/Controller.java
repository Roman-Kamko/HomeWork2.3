package edu.skypro.homework;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    private final CalcFunctions calcFunctions;

    public Controller(CalcFunctions calcFunctions) {
        this.calcFunctions = calcFunctions;
    }

    @GetMapping(path = "/calculator")
    public String calculatorGreeting() {
        return calcFunctions.greetings();
    }

    @GetMapping(path = "/calculator/plus")
    public String plus(@RequestParam("num1") int num1,
                       @RequestParam("num2") int num2) {
        return calcFunctions.plus(num1, num2);
    }
    @GetMapping(path = "/calculator/minus")
    public String minus(@RequestParam("num1") int num1,
                        @RequestParam("num2") int num2) {
        return calcFunctions.minus(num1, num2);
    }
    @GetMapping(path = "/calculator/multiply")
    public String multiply(@RequestParam("num1") int num1,
                           @RequestParam("num2") int num2) {
        return calcFunctions.multiply(num1, num2);
    }
    @GetMapping(path = "/calculator/divide")
    public String divide(@RequestParam("num1") int num1,
                         @RequestParam("num2") int num2) {
        return calcFunctions.divide(num1, num2);
    }
}
