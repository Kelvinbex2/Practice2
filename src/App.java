import es.etg.psp.calculadora.Calculadora;
import es.etg.psp.calculadora.resta.Resta;
import es.etg.psp.calculadora.suma.Suma;

public class App {
    public static void main(String[] args) throws Exception {
        Calculadora calc = new Calculadora();

        Thread sum = new Thread(new Suma(calc));
        sum.start();

        Thread res = new Thread(new Resta(calc));
        res.start();
    }
}
