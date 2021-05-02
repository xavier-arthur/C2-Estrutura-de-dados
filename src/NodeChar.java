public class NodeChar {

    private char atual;
    private NodeChar prox;

    NodeChar(char ch) {
        this.atual = ch;
        this.prox  = null;
    }

    public char getAtual() {
        return this.atual;
    }

    public void setAtual(char atual) {
        this.atual = atual;
    }

    public NodeChar getProx() {
        return this.prox;
    }

    public void setProx(NodeChar prox) {
        this.prox = prox;
    }
}