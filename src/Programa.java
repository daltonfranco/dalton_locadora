public class Programa { // criacao da classe Programa
    public static void main(String[] args){ // criacao do método main (principal) do programa
        Filme f = new Filme(); // importando a classe Filme para dentro do metodo main, criando um objeto com o nome de "f" e construindo com o tipo Filme com o comando new

        f.setCodigo(987); // trocando o codigo do filme

        f.setNome("O rei leao"); // trocando o nome do filme

        f.setValor(5.00); // trocando o valor do filme

        f.devolver(); // devolvendo o filme

        f.mostra(); // mostrando tudo sobre o filme do objeto "f" (no caso esta disponivel pois foi devolvido, com um valor e um nome que foi estabelecido)

        f.retirar(); // retirando o filme da locadora

        f.mostra(); // mostrando tudo sobre o filme do objeto "f" (no caso esta indisponivel, pois foi returado)

        try { // tentar
            f.retirar(); // condicao (retirar o filme)
        }catch (RuntimeException e) { // pegar 
            System.out.println(e.getMessage()); // condicao (mostra uma mensagem na tela)
        }
    }
}
