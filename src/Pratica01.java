public class VetorOrdenado {
    private String[] valores;
    private int capacidade;
    private int tamanho;

    public VetorOrdenado(int capacidade) {
        this.capacidade = capacidade;
        this.valores = new String[capacidade];
        this.tamanho = 0;
    }


    public boolean inserir(String valor) {
        if (tamanho == capacidade) {
            System.out.println("Vetor cheio");
            return false;
        }

        int posicao = 0;
        while (posicao < tamanho && valores[posicao].compareTo(valor) < 0) {
            posicao++;
        }

        for (int i = tamanho; i > posicao; i--) {
            valores[i] = valores[i - 1];
        }

        valores[posicao] = valor;
        tamanho++;
        return true;
    }


    public void imprime() {
        for (int i = 0; i < tamanho; i++) {
            System.out.print(valores[i] + " ");
        }
        System.out.println();
    }


    public int pesquisaLinear(String valor) {
        for (int i = 0; i < tamanho; i++) {
            if (valores[i].equals(valor)) {
                return i;
            }
        }
        return -1;
    }


    public boolean excluir(String valor) {
        int posicao = pesquisaLinear(valor);
        if (posicao == -1) {
            System.out.println("Elemento não encontrado: " + valor);
            return false;
        }

        for (int i = posicao; i < tamanho - 1; i++) {
            valores[i] = valores[i + 1];
        }
        tamanho--;
        return true;
    }


    public static void main(String[] args) {
        VetorOrdenado vetorOrdenado = new VetorOrdenado(7);

        vetorOrdenado.inserir("R");
        vetorOrdenado.inserir("O");
        vetorOrdenado.inserir("D");
        vetorOrdenado.inserir("R");
        vetorOrdenado.inserir("I");
        vetorOrdenado.inserir("G");
        vetorOrdenado.inserir("O");

        vetorOrdenado.imprime(); // Deve mostrar ordenado

        int pesquisa1 = vetorOrdenado.pesquisaLinear("R");
        int pesquisa2 = vetorOrdenado.pesquisaLinear("D");
        int pesquisa3 = vetorOrdenado.pesquisaLinear("G");

        System.out.println("Pesquisa R -> posição: " + pesquisa1);
        System.out.println("Pesquisa D -> posição: " + pesquisa2);
        System.out.println("Pesquisa G -> posição: " + pesquisa3);

        vetorOrdenado.excluir("R");
        vetorOrdenado.excluir("D");
        vetorOrdenado.excluir("G");

        vetorOrdenado.imprime();
    }
}
