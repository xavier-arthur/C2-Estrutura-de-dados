public class FilaMain {

    public static void main(String[] args) {
        FilaString queue = new FilaString();

        queue.enqueue('a');
        queue.enqueue('b');
        queue.enqueue('c');
        queue.enqueue('d');

        System.out.println(queue);

        while (!queue.eVazio()) {
            System.out.println(queue.dequeue().getAtual());
        }
    }
    
}
