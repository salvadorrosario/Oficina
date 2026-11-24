public class Oficina {
    public static void main(String[] args) {

        Carro c1 = new Carro("Toyota", 12.90);
        Carro c2 = new Carro("Mercedes", 15.50);
        Carro c3 = new Carro("Ferrari", 8.75);


        Carro[] carros = { c1, c2, c3 };

        // 3. Percorrer o array e mostrar os dados de cada livro
        for (int i = 0; i < carros.length; i++) {
            carros[i].mostrarInfo();
        }

        // Desafio extra: preço total
        double total = 0;
        for (Carro l : carros) {
            total += l.getPreco();
        }
        System.out.println("Preço total: " + total + " €");
    }
}