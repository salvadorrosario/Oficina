public class Carro {

    private String nome;
    private double preco;

    public Carro(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public double getPreco() {

        return preco;
    }

    public void mostrarInfo() {

        System.out.println("Nome: " + nome + " | Preço: " + preco + " €");
    }
}






