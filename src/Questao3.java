import java.util.Scanner;

public class Questao3 {

    public static void main(String args[]) {

        Scanner     scan  = new Scanner(System.in);
        PilhaString stack = new PilhaString();
        FilaString  queue = new FilaString();
        String      input;

        System.out.printf("Insira a sequencia: ");
        input = scan.nextLine();

        for (char ch : input.toCharArray()) {
            if (Character.isDigit(ch)) {
                stack.push(ch);
            } else {
                queue.enqueue(ch);
            }
        }

        System.out.printf("%s%s\n", 
            queue.toStringUnformatted(),
            stack.toStringUnformatted()
        );

        // TRIVIAL
    }
}
