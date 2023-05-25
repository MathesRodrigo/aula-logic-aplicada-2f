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

        //Criar mais objetos
        Pessoa qualquer = new Pessoa();
        // Declarar objetos
        Pessoa rainha;
        //
        rainha = new Pessoa();
        //
        rainha.nome = "Tina";
        rainha.sobrenome = "Tunner";
        //Definiçao de comportamento
       System.out.println(rainha.falar("alto"));

    }
}