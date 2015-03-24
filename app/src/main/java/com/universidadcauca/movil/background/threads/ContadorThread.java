package com.universidadcauca.movil.background.threads;

/**
 * Created by DarioFernando on 24/03/2015.
 */
public class ContadorThread extends Thread {

    boolean isRunning;
    int cont;

    @Override
    public void run() {
        isRunning = true;
        cont=0;
        while(isRunning){
            try {
                Thread.sleep(1000);
                cont++;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void stopContador(){
        isRunning = false;
    }
}
