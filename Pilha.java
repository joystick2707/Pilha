//Trabalho de Bryan Strey, Victor Luis

public class Pilha {
    public int dados[];
    public int topo = -1;

    public Pilha(int tamanho) {
        this.dados = new int[tamanho];
        this.topo = -1;
    }

    public void insere(int valor){
        if(topo < dados.length - 1){
            topo ++;
            dados[topo] = valor;
            System.out.println("Valor inserido: " + valor);
        }
        else{
            System.out.println("Pilha cheia");
        }
    }

    public int remover() {
        if (topo >= 0) {
            int valorRemovido = dados[topo];
            topo--;
            System.out.println("Valor removido: " + valorRemovido);
            return valorRemovido;
        } else {
            System.out.println("Pilha vazia!");
            return -1;
        }
    }

    public int topo(){
        if (topo >= 0) {
            return dados[topo];
        }
        else{
            System.out.println("Pilha vazia");
            return -1;
        }
    }
}
