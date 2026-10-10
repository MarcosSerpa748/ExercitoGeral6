package org.example;

public class Main {
    static void main() {

        String[] nomes = {"Marcos","Cleiton","André","Josafá","Déborah"};

        for (int i = 0;i <nomes.length;i++){
            System.out.println(nomes[i]);
        }

        System.out.println();
        String[] nomesRealocados = Utilitarios.trocarPosicicaoERetornarArray(nomes,0,1);

        for (int i = 0; i <nomesRealocados.length;i++){
            System.out.println(nomesRealocados[i]);
        }

        System.out.println();
        Integer[] numeros = {21,3,76,13,99};

        for (int i = 0;i< numeros.length;i++){
            System.out.println(numeros[i]);
        }

        System.out.println();
        Integer[] numerosRealocados = Utilitarios.trocarPosicicaoERetornarArray(numeros,2,4);

        for (int i = 0;i<numerosRealocados.length;i++){
            System.out.println(numerosRealocados[i]);
        }
    }
}
