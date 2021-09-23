public class Programa { // criacao da classe publica Programa, abrindo com a chave
    public static void main(String[] args){ // criacao do método publico, estático e vazio main (principal), com o Tipo String e com o vetor args, abrindo com a chave
        Filme f = new Filme(); // importando a classe Filme para dentro do metodo main, criando um objeto com o nome de "f" e construindo com o tipo Filme com o comando new

        f.setCodigo(987); // objeto f acessando o método setCodigo da sua classe, atribuindo um valor

        f.setNome("O rei leao");// objeto f acessando o método setNome da sua classe, atribuindo um valor

        f.setValor(5.00); // objeto f acessando o método setValor da sua classe, atribuindo um valor

        f.devolver(); // objeto f acessando o método devolver

        f.mostra();// objeto f acessando o método mostrar

        f.retirar();// objeto f acessando o método retirar da sua classe

        f.mostra();// objeto f acessando o método mostrar

        try { // tentar, estrutura de erro, abrindo com a chave
            f.retirar(); // condicao (retirar o filme)
        }catch (RuntimeException e) { // Fecnado do pegar com a chave, pegar, abrindo com a chave
            System.out.println(e.getMessage()); // condicao (mostra uma mensagem na tela)
        }// fechando a estrutura de erro com a chave
    }//fechando o metodo main com a chave
}// fechando a classe com a chave
