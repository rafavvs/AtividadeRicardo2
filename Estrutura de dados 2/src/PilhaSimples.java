public class PilhaSimples {
    Integer[] pilha;
    int topo;

    public PilhaSimples(int tamanho) {
        this.pilha = new Integer[tamanho];
        this.topo = -1;
    }

    public void empilhar(int numero) {
        if (!estaCheia()) {
            topo++;
            pilha[topo] = numero;
            System.out.println("O elemento " + numero + " foi empilhado com sucesso.");
        }
    }

    private boolean estaCheia() {
        if (topo == pilha.length - 1) {
            System.out.println("A pilha está cheia!");
            return true;
        }
        return false;
    }

    private boolean estaVazia() {
        if (topo == -1) {
            System.out.println("A pilha está vazia!");
            return true;
        }
        return false;
    }

    public void exibirPilha() {
        if (!estaVazia()) {
            for (int i = topo; i >= 0; i--) {
                System.out.println(pilha[i]);
            }
        }
    }

    public Integer desempilhar() {
        if (!estaVazia()) {
            Integer valor = pilha[topo];
            pilha[topo] = null;
            topo--;
            System.out.println("O elemento " + valor + " foi desempilhado com sucesso.");
            return valor;
        }
        return null;
    }
}