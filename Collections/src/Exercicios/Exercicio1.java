package Exercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<String> cores = new ArrayList<String>();

       for(int i = 0; i < 5; i++) {
           System.out.println("Digite a cor " + (i + 1));
           cores.add(input.nextLine());
       }

        System.out.println("Listar todas as cores");
        System.out.println(cores);

        System.out.println("Ordenar as cores");
        Collections.sort(cores);
        System.out.println(cores);
    }

}
