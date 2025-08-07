import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome");
        String nome = scanner.nextLine();

        System.out.println("Digite sua idade");
        int idade = scanner.nextInt();

        System.out.println("Nome: " + nome + " Idade: " + idade);

        scanner.close();


        }
    }
