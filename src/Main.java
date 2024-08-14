import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String nomeCompleto;
        int idade;
        double altura;
        int filhos;
        try (Scanner scan = new Scanner(System.in)) {

            System.out.println("Digite seu nome completo: ");
            nomeCompleto = scan.next();
            System.out.println("Você tem quantos anos? ");
            idade = scan.nextInt();
            System.out.println("Qual sua altura? ");
            altura = scan.nextDouble();
            System.out.println("Tem quantos filhos? ");
            filhos = scan.nextInt();
        }
        System.out.println("Olá " + nomeCompleto + " você tem " + idade + " anos, e sua altura é de " + altura + " de altura e tem " + filhos + " filhos. ");
        System.out.println("Obrigado por participar da nossa pesquisa. ");


    }
}
