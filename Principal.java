class Carro { // Criação da Classe Carro
    String marca; // Inicialização das Instancias
    String modelo;
    int ano;


    public Carro(String marca, String modelo, int ano) { // Construtor da classe Carro, para garantir a o preenchimento dos dados
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public void exibirInfo() { // Método para exibir as informções da Instancia criada
        System.out.printf("Marca: %s\n", marca);
        System.out.printf("Modelo: %s\n", modelo);
        System.out.printf("Ano: %s\n", ano);

    }
}

public class Principal { // Classe Principal
    public static void main (String[] args) {
        Carro novoCarro = new Carro("Toyota", "Corolla", 2023); // Criação da instancia nova do objeto carro, ja preenchendo os argumentos
        novoCarro.exibirInfo(); // Chamamento do metodo de exibir info da classe Carro
    }
}

// Bruno Curcio, Gabriel Martins, Vinicius Mello
