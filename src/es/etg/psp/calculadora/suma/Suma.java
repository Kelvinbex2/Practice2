package es.etg.psp.calculadora.suma;

import es.etg.psp.calculadora.Calculadora;

public class Suma implements Runnable {
    private static final int NUM_TOTAL = 4;
        private Calculadora calculadora;
    
        public Suma(Calculadora calculadora) {
            this.calculadora = calculadora;
        }
    
        @Override
        public void run() {
           for (int i = 0; i < NUM_TOTAL; i++) {
            try {
                calculadora.sumar(Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
           
       }
    }
    
}
