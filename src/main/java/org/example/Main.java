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

    }
}
