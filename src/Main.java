public class Main {
    public static void main(String[] args) {

        // Teste Pilha Simples
        System.out.println("--- TESTANDO PILHA SIMPLES ---");

        PilhaSimples ps = new PilhaSimples(5);

        ps.empilhar(10);
        ps.empilhar(20);
        ps.empilhar(30);

        System.out.println("\nPilha:");
        ps.exibirPilha();

        ps.desempilhar();

        System.out.println("\nApós remover:");
        ps.exibirPilha();


        // Teste Pilha Dinâmica
        System.out.println("\n--- TESTANDO PILHA DINÂMICA ---");

        PilhaDinamica pd = new PilhaDinamica();

        pd.empilhar(100);
        pd.empilhar(200);
        pd.empilhar(300);

        System.out.println("\nPilha:");
        pd.exibir();

        pd.desempilhar();

        System.out.println("\nApós remover:");
        pd.exibir();
    }
}