import java.util.Scanner;

//Faça um programa em Java que receba a idade de uma pessoa
//expressa em anos, meses e dias, calcule e informe quantos dias
//a pessoa já viveu. Considere que todos os meses têm 30 dias. 
public class CalculadoraIdade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int anos, meses, dias, totalDias;
        System.out.println("informe quantos anos você tem");
        anos = scan.nextInt();

        System.out.println("informe quantos anos você tem");
        meses = scan.nextInt();

        System.out.println("informe quantos anos você tem");
        dias = scan.nextInt();

        totalDias = anos * 365 * meses * 30 * dias;
        System.out.printf("você já viveu: " + totalDias);
    }
}
