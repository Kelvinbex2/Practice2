package es.etg.psp.calculadora.resta;

import es.etg.psp.calculadora.Calculadora;

public class Resta implements Runnable {
    private static final int NUM_TOTAL = 2;
    private Calculadora calculadora;

    public Resta(Calculadora calculadora) {
        this.calculadora = calculadora;
    }

    @Override
    public void run() {
        for (int i = 0; i < NUM_TOTAL; i++) {
            try {
                calculadora.restar(Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}