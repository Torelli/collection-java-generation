package Exercicios;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        HashSet<Integer> numeros = new HashSet<Integer>();

        for(int i = 0; i < 10; i++) {
            System.out.println("Digite o " + (i + 1) + "º número");
            numeros.add(input.nextInt());
        }

        System.out.println("Listar dados do set: ");
        Iterator<Integer> iNumeros = numeros.iterator();

        while(iNumeros.hasNext()) {
            System.out.println(iNumeros.next());
        }
    }

}
