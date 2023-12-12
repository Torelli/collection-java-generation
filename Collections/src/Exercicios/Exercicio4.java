package Exercicios;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num;
        boolean encontrado = false;

        HashSet<Integer> numeros = new HashSet<Integer>();
        numeros.add(2);
        numeros.add(5);
        numeros.add(1);
        numeros.add(3);
        numeros.add(4);
        numeros.add(9);
        numeros.add(7);
        numeros.add(8);
        numeros.add(10);
        numeros.add(6);

        System.out.println("Digite o número que você deseja encontrar: ");
        num = input.nextInt();

        Iterator<Integer> iNumeros = numeros.iterator();

        while (iNumeros.hasNext()) {
            if(iNumeros.next() == num) {
                encontrado = true;
            }
        }

        if(encontrado) {
            System.out.println("O número " + num + " foi encontrado!");
        } else {
            System.out.println("O número " + num + " não foi encontrado!");
        }
    }
}
