public class Main {
    public static void main(String[] args) {
        Pilha pilha = new Pilha(5);

        pilha.insere(10);
        pilha.insere(20);
        pilha.insere(30);

        System.out.println("Topo da pilha: " + pilha.topo());

        System.out.println("Valores da pilha: " + pilha.valoresPilha());
        
        pilha.remover();

        System.out.println("Topo da pilha após pop: " + pilha.topo());
    }
}
