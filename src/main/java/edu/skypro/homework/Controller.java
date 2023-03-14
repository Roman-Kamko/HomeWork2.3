package edu.skypro.homework;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/calculator")
public class Controller {
    private final CalcFunctions calcFunctions;

    public Controller(CalcFunctions calcFunctions) {
        this.calcFunctions = calcFunctions;
    }

    @GetMapping
    public String greetings() {
        return calcFunctions.greetings();
    }

    @RequestMapping(value = "/plus")
    public String plus(@RequestParam int num1,
                       @RequestParam int num2) {
        return calcFunctions.plus(num1, num2);
    }
    @RequestMapping(value = "/minus")
    public String minus(@RequestParam int num1,
                        @RequestParam int num2) {
        return calcFunctions.minus(num1, num2);
    }
    @RequestMapping(value = "/multiply")
    public String multiply(@RequestParam int num1,
                           @RequestParam int num2) {
        return calcFunctions.multiply(num1, num2);
    }
    @RequestMapping(value = "/divide")
    public String divide(@RequestParam int num1,
                         @RequestParam int num2) {
        return calcFunctions.divide(num1, num2);
    }
}
