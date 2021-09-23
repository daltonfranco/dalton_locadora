public class Filme {// criação da classe publica Fime, abrindo com a chave
    
    private int codigo; //criacao de um vetor do tipo int com o nome de codigo, sendo ele um vetor privado por padrao
    private String nome; //criacao de um vetor do tipo/classe String com a nome de nome, sendo ele um vetor privado por padrao
    private double valor; //criando um vetor do tipo double com a nome de valor, sendo ele um vetor privado por padrao
    private boolean disponivel; //criando um vetor do tipo booleano com o nome de disponivel, sendo ele um vetor privado por padrao


    public int getCodigo(){  //criando um método para mostrar a varivel codigo do tipo int, abrindo com a chave
        return codigo; // retorna o valor do vetor
    }// fechando método com a chave

    public void setCodigo(int codigo){ //criando um método para mudar ou alterar uma variável com o nome de codigo do tipo int, abrindo com a chave
        this.codigo = codigo; // troca o valor da variavel
    }// fechando método com a chave

    public String getNome(){//criando um método para mostrar a varivel nome do tipo String, abrindo com a chave
        return nome; // retorna o valor do vetor
    }// fechando método com a chave

    public void setNome(String nome){ // criando um método para mudar o valor da variavel nome do tipo String, abrindo com a chave
        this.nome = nome; // troca do valor da variavel
    }// fechando método com a chave

    public double getValor(){ // criando um método para mostrar a variavel valor do tipo double, abrindo com a chave
        return valor;// retorna o valor do vetor
    }// fechando método com a chave

    public void setValor(double valor){ // criando um método para mudar o valor da variavel valor do tipo double, abrindo com a chave
        this.valor = valor; // mudando o valor da variavel
    }// fechando método com a chave

    public boolean getDisponivel(){ // criando um método para mostrar a variavel disponivel do tipo boolean, abrindo com a chave
        return disponivel;// retorna o valor do vetor
    }// fechando método com a chave

    public void setDisponivel(boolean disponivel){ // criando um método para mudar o valor da variavel disponivel do tipo boolean, abrindo com a chave
        this.disponivel = disponivel; // retorna o valor do vetor
    }// fechando método com a chave

    public void retirar(){ // criacao de um metodo para retirar um filme, abrindo com a chave
        if(disponivel == true){ // se, abrindo com a chave
            disponivel = false; // condicao
        }else{ // Fechando se com a chave, condisao senao abrindo com a chave
            throw new RuntimeException("Este filme nao está disponivel para a locação"); // condicao
        }// fechando senao com a chave
    }// fechando método com a chave

    public void devolver(){ // criacao de um metodo para devolver o filme, abrindo com a chave
        disponivel = true; // condicao
    }// fechando método com a chave

    public void mostra(){// criando o metodo publico mostrar, abrindo com a chave
        System.out.println("Codigo do fime: " + this.codigo); // mostra o codigo do filme na tela
        System.out.println("Nome do filme: " + this.nome); // mostra o nome do filme na tela
        System.out.println("Valor: R$ " + this.valor); // mostra o valor do filme na tela
        System.out.println("Disponivel: " + this.disponivel); // mostra se esta disponivel ou nao o fime na tela
    }//fechando o método com a chave

}// fechando a classe com a chave
