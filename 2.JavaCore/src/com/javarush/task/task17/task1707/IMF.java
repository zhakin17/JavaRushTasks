package com.javarush.task.task17.task1707;


public class IMF {

    private static IMF imf = new IMF();

    public static IMF getFund() {
        synchronized (imf){
            if (imf == null) return imf = new IMF();
            return imf;
        }

    }

    private IMF() {
    }
}
