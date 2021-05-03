public class FilaString {

    private int nElem;
    private NodeChar head, tail;

    public FilaString() {
        this.nElem = 0;
        this.tail = null;
        this.head = null;
    }

    /**
     * @return o ultimo elemento na fila
     */
    public NodeChar tail() {
        return this.tail;
        // 💯
    }

    /**
     * @return o primeiro elemento da fila
     */
    public NodeChar head() {
        return this.head;
        // ⚡
    }

    /**
     * coloca um elemento no final da fila
     * @param ch: o caracter a ser adicionado
     */
    public void enqueue(char ch) {
        NodeChar node = new NodeChar(ch);

        if (this.eVazio()) {
            this.head = node;
        } else {
           this.tail.setProx(node); 
        } this.tail = node; this.nElem++;

        // 😏
    }

    public void enqueue(String st) {
        while (!st.isEmpty()) {
            this.enqueue(st.charAt(0));
            st = st.substring(1);
        }

        // 🏃
    }

    /**
     * remove o elemento do comço da fila
     * @return o elemento removido
     */
    public NodeChar dequeue() {
        NodeChar node = this.head;
        this.head = this.head.getProx();
        this.nElem--;
        return node;
        // 🍔 
    }

    public boolean eVazio() {
        return this.nElem == 0;
        // 🙅
    }

    public int tamanho() {
        return this.nElem;
        // 🤷‍♂️
    }

    /**
     * @return a pilha em string em uma versao nao-formatada (sem newlines)
     */
    public String toStringUnformatted() {
        NodeChar node = this.head;
        var stringFinal = "";

        while (node != null) {
            stringFinal += node.getAtual();
            node = node.getProx();
        }
        return stringFinal;
    }

    @Override
    public String toString() {
        NodeChar node = this.head;
        var stringFinal = "";

        while (node != null) {
            stringFinal += String.format("| %s |", node.getAtual());
            node = node.getProx();
        }
        stringFinal += "\n";
        
        return stringFinal;
    }
}