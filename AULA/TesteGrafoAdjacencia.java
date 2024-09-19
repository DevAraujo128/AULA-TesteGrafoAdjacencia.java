class GrafoAdjacencia{
    private int[][] matrizAdjacencia;
    private int numVertices;

    // Criando meu Construtor
    public GrafoAdjacencia(int num_Vertices) {
        this.numVertices = num_Vertices;
        this.matrizAdjacencia = new int[num_Vertices][num_Vertices];
    }

    // Define os valores de origem e destino
    public void adicionarAresta(int origem, int destino){
        this.matrizAdjacencia[origem][destino] = 1;
        this.matrizAdjacencia[destino][origem] = 1;
    }

    public void exibirMatriz(){
        System.out.println("Matriz de adjacencia");
        for(int i = 0; i < this.numVertices; i++){
            for(int j = 0; j < this.numVertices; j++){
                System.out.print(matrizAdjacencia[i][j] + " ");
            }
            System.out.println();
        }
    }
}

public  class TesteGrafoAdjacencia{
    public static void main(String[] args){
        GrafoAdjacencia grafo = new GrafoAdjacencia(4);
        grafo.adicionarAresta(0, 1);
        grafo.adicionarAresta(0, 2);
        grafo.adicionarAresta(1, 2);
        grafo.adicionarAresta(2, 3);

        grafo.exibirMatriz();
    }
}