public class Filme {
    
    private int codigo; //criacao de uma variaveis do tipo int com o nome de codigo, sendo ele um vetor privado por padrao
    private String nome; //criacao de uma variavel do tipo/classe String com a nome de nome, sendo ele um vetor privado por padrao
    private double valor; //criando uma variavel do tipo double com a nome de valor, sendo ele um vetor privado por padrao
    private boolean disponivel; //criando uma variavel do tipo booleano com o nome de disponivel, sendo ele um vetor privado por padrao


    public int getCodigo(){  //criando um método para mostrar a varivel codigo do tipo int
        return codigo; // retorna o valor da variavel
    }

    public void setCodigo(int codigo){ //criando um método para mudar ou alterar uma variável com o nome de codigo do tipo int
        this.codigo = codigo; // troca o valor da variavel
    }

    public String getNome(){//criando um método para mostrar a varivel nome do tipo String
        return nome; // retorna o valor da variavel
    }

    public void setNome(String nome){ // criando um método para mudar o valor da variavel nome do tipo String
        this.nome = nome; // troca do valor da variavel
    }

    public double getValor(){ // criando um método para mostrar a variavel valor do tipo double
        return valor;// retorna o valor da variavel
    }

    public void setValor(double valor){ // criando um método para mudar o valor da variavel valor do tipo double
        this.valor = valor; // mudando o valor da variavel
    }

    public boolean getDisponivel(){ // criando um método para mostrar a variavel disponivel do tipo boolean
        return disponivel;// retorna o valor da variavel
    }

    public void setDisponivel(boolean disponivel){ // criando um método para mudar o valor da variavel disponivel do tipo boolean
        this.disponivel = disponivel; // mudando o valor da variavel
    }

    public void retirar(){ // criacao de um metodo para retirar um filme
        if(disponivel == true){ // se
            disponivel = false; // condicao
        }else{ // se nao
            throw new RuntimeException("Este filme nao está disponivel para a locação"); // condicao
        }
    }

    public void devolver(){ // criacao de um metodo para devolver o filme
        disponivel = true; // condicao
    }

    public void mostra(){
        System.out.println("Codigo do fime: " + this.codigo); // mostra o codigo do filme na tela
        System.out.println("Nome do filme: " + this.nome); // mostra o nome do filme na tela
        System.out.println("Valor: R$ " + this.valor); // mostra o valor do filme na tela
        System.out.println("Disponivel: " + this.disponivel); // mostra se esta disponivel ou nao o fime na tela
    }

}
