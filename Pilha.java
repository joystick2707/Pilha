import java.util.ArrayList;

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
            return valorRemovido;
        } else {
            System.out.println("Pilha vazia! Não há elementos para remover.");
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

    public ArrayList<Integer> valoresPilha() {
        ArrayList<Integer> valores = new ArrayList<>();
        for (int i = 0; i <= topo; i++) {
            valores.add(dados[i]);
        }
        return valores;
    }
}
