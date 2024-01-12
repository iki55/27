package proekt_36;

public class Main {
	
    public static void main(String[] args) {
        // Дефинирање на два броја
        int firstNumber = 5;
        int secondNumber = 10;

        // Креирање инстанца од класата Calculator
        Calculator calculator = new Calculator(firstNumber, secondNumber);

        // Печатење на резултатот од собирањето
        System.out.println("Сумата на броевите е: " + calculator.addNumbers());
    }
}

