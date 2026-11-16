public class Calculadora {

    public int suma(int num1, int num2) {
        return num1 + num2;
    }

    public int resta(int num1, int num2) {
        return num1 - num2;
    }

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        System.out.println("Calculadora Java");
        System.out.println("Suma: " + calculadora.suma(10, 5));
        System.out.println("Resta: " + calculadora.resta(10, 5));
    }
}
