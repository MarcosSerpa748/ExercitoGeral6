package org.example;

public class Utilitarios{

    public static <T> T[] trocarPosicicaoERetornarArray(T[] array,Integer primeiraPosicao,Integer segundaPosicao){

        T[] arrayClonado = array.clone();

        arrayClonado[primeiraPosicao] = array[segundaPosicao];
        arrayClonado[segundaPosicao] = array[primeiraPosicao];
        return arrayClonado;
    }
}
