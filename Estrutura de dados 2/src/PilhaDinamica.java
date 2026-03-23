public class PilhaDinamica {
    No topo;

    public PilhaDinamica() {
        this.topo = null;
    }

    public void empilhar(int numero) {
        No novo = new No(numero);
        novo.setProx(topo);
        topo = novo;
        System.out.println("Número " + numero + " adicionado na pilha.");
    }

    public void exibir() {
        if (!estaVazio()) {
            No aux = topo;
            while (aux != null) {
                System.out.println(aux.getConteudo());
                aux = aux.getProx();
            }
        }
    }

    private boolean estaVazio() {
        if (topo == null) {
            System.out.println("A Pilha está vazia.");
            return true;
        }
        return false;
    }

    public Integer desempilhar() {
        if (!estaVazio()) {
            Integer valor = topo.getConteudo();
            System.out.println("Número " + valor + " removido da pilha.");
            topo = topo.getProx();
            return valor;
        }
        return null;
    }
}