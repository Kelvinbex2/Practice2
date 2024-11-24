package es.etg.psp.calculadora;

public class Calculadora {
    private static final String MSG_SUMAR = "Sumado %d  numero";
    private static final String MSG_RESTAR = "Restando %d numero";
    private static final String ESPACIO = " ";
    private static final String MSG_TOTAL = "Total: ";
    public final static int TAMANIO = 4;
    public final static int TAMANIO_RESTAR = 0;
    private final static int NUM=1;

    private int operacion = 0;
   

    public int getOperacion() {
        return operacion;
    }

    public void setOperacion(int operacion) {
        this.operacion = operacion;
    }

    public synchronized void sumar(String id) throws InterruptedException {
        if (operacion >= TAMANIO) {
            wait();
        }

        
        operacion++;
        System.out.println(System.lineSeparator() + id + ESPACIO + String.format(MSG_SUMAR, NUM)
                + System.lineSeparator() + MSG_TOTAL + getOperacion());

        notify();
    }

    public synchronized void restar(String id) throws InterruptedException {
        if (operacion == TAMANIO_RESTAR) {
            this.wait();
        }

        operacion--;
        System.out.println(System.lineSeparator() + id + ESPACIO + String.format(MSG_RESTAR, NUM)
                + System.lineSeparator() + MSG_TOTAL + getOperacion());
        this.notify();
    }
}
