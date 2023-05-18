public class Main {
    public static void main(String[] args) {
          // aula de Orientação á Objetos
          // Declarar objetos
        Pessoa adao;
        // instanciar objetos
        adao = new Pessoa();
        Pessoa eva = new Pessoa();
        // Definição do formato
        adao.nome = "Adão";
        adao.sobrenome = "silvia";
        eva.nome = "Eva";
        eva.sobrenome = "silvia";
        // Acionar comportamento
        adao.falar();
        eva.falar();

    }
}