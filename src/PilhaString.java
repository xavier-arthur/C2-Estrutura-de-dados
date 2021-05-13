public class PilhaString {

    private NodeChar topo;
    private int nElem;

    PilhaString() {
        this.topo = null;
        this.nElem = 0;
    }

      /**
     * @return verdadeiro se a pilha estiver vazia
     */
    public boolean eVazio() {
        return this.nElem == 0;
        // 👍🏿
    }

    /**
     * adiciona um character no topo da pilha
     * @return void
     * @param ch: o caracter a ser adicionado
     */
    public void push(char ch) {
        NodeChar node = new NodeChar(ch);
        node.setProx(this.topo);
        this.topo = node;
        this.nElem++;
    }

    /**
     * Quebra a string passada em caracteres e as coloca em ordem da pilha
     * @param st: a string a ser quebrada
     */
    public void push(String st) {
        while (!st.isEmpty()) {
            this.push(st.charAt(0));
            st = st.substring(1);
        }
        // nao ha necessidade de incrementar o nElem nesse metodo ja que ele ira chamar
        // o metodo que trabalho char
    }

    /**
     * remove e retorna o objeto no topo
     * @return this.topo.getAtual()
     */
    public char pop() {
        var atual = this.topo.getAtual();            
        this.topo = this.topo.getProx();
        this.nElem--;
        return atual;
    }

    @Override
    public String toString() {
        var stringFinal = "";

        NodeChar node = this.topo;

        while (node != null) {
            stringFinal += String.format("%s\n", node.getAtual());
            node = node.getProx();
        }

        return stringFinal.replace("\n", "");
    }

    /**
     * @return uma string que representa a pilha em forma vertical
     * with newlines apos cada item
     */
    public String mostraPilha() {
        var stringFinal = "";

        NodeChar node = this.topo;

        while (node != null) {
            stringFinal += String.format("%s\n", node.getAtual());
            node = node.getProx();
        }

        return stringFinal;
    }

    /**
     * @return a pilha em string em uma versao nao-formatada (sem newlines)
     */
    public String toStringUnformatted() {
        NodeChar node = this.topo;
        var stringFinal = "";

        while (node != null) {
            stringFinal += node.getAtual();
            node = node.getProx();
        }
        return stringFinal;
    }
}