public class CalculadoraTest {

    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        assert calculadora.suma(2, 3) == 5;
        assert calculadora.suma(10, 5) == 15;
        assert calculadora.suma(-2, 2) == 0;

        assert calculadora.resta(5, 3) == 2;
        assert calculadora.resta(10, 5) == 5;
        assert calculadora.resta(2, 5) == -3;

        System.out.println("Todos los tests se han superado correctamente.");
    }
}
