import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        PilhaString stack = new PilhaString();
        String input;
        int opcao;

        System.out.printf("insira uma sequência de caracteres:");
        input = scan.nextLine();
        stack.push(input); 

        System.out.println("Escolha:");

        do {
            System.out.printf("1 - Imprimir texto na ordem reversa\n"
            + "2 - Verificar Palindromo\n"
            + "0 - Sair\n\n"
            + "Insira: ");
            opcao = scan.nextInt();

            switch(opcao) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    System.out.printf("\n%s\n\n", stack);
                    break;
                case 2:
                    if (stack.toString().replace("\n", "").equals(input)) {
                        System.out.println("São palindromos");
                    } else {
                        System.out.println("nao sao palindromos");
                    }
                    break;
            }
        } while (opcao > 0);

        scan.close();
        // so pro compilador parar de mostrar warning
    }
}
