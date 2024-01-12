package proekt_36;

public class Calculator {

    private int number1;
    private int number2;

    // Конструктор за поставување на вредности на броевите
    public Calculator(int num1, int num2) {
        this.number1 = num1;
        this.number2 = num2;
    }

    // Метод за собирање на броевите
    public int addNumbers() {
        return number1 + number2;
    }
}


