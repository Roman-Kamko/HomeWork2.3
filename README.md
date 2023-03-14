# 2.3. Введение в Maven и Spring Boot

***

### Задача: написать простую версию калькулятора.

***

### Шаг 1

Создать Spring Boot проект calculator.

### Шаг 2

Подключить модуль Spring Web при создании.

### Шаг 3

Написать 5 методов, которые при вызове из браузера делают следующее:

1. Метод по адресу ___/calculator___ должен вернуть приветствие “Добро пожаловать в калькулятор".

2. Метод по адресу ___/calculator/plus?num1=5&num2=5___ должен сложить num1 и num2 и вернуть результат в формате “5 + 5 = 10”.

3. Метод по адресу ___/calculator/minus?num1=5&num2=5___ должен вычесть из num1 num2 и вернуть результат в формате “5 − 5 = 0”.

4. Метод по адресу ___/calculator/multiply?num1=5&num2=5___ должен умножить num1 на num2 и вернуть результат в формате “5 * 5 = 25”.

5. Метод по адресу __/calculator/divide?num1=5&num2=5__ должен разделить num1 на num2 и вернуть результат в формате “5 / 5 = 1”.

### При выполнении задания важно учесть:

*/calculator повторяется. Рекомендуется использовать @RequestMapping на уровне контроллера.

*Деление на 0 в Java выкидывает ошибку.

*Если какой-то из двух параметров (или оба) не поданы, нужно вернуть ошибку.

*Контроллер не должен вычислять результат, а только делегировать его вычисление сервису. После получения от него результата контроллер должен сформировать строку и вернуть пользователю в браузер.
