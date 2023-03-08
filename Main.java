//Faça um programa em Java que simule a seguinte conversa entre o computador e o usuário:
//        Computador: - Oi, sou Computalino. E você?
//        Usuário: - Asdrúbal
//        Computador: - Bonito nome, Asdrúbal!

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nome;
        System.out.println("Oi, sou Computalino. E você?");
        nome = scan.nextLine();
        System.out.println("bonito nome, "+nome);
    }
}