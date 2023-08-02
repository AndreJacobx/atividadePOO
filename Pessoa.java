/*
* "Crie uma classe Java (versão 17) Pessoa com os atributos Nome, Data de Nascimento e Idade.
Crie no mínimo três Construtores e métodos (getters e setters).
Crie um repositório público (preferencialmente GitHub) e adicione o link na resposta."*/

public class Pessoa {

    private String Nome;
    private String DataNasc;
    private int Idade;

    public Pessoa(String nome,String DataNasc, int Idade) {
        this.Nome = nome;
        this.DataNasc = DataNasc;
        this.Idade = Idade;
    }

    // getters
    public String getNome(){
        return Nome;
    }

    public String getDataNasc(){
        return DataNasc;
    }

    public int getIdade(){
        return Idade;
    }

    //setters
    public void setNome(String nome){
        this.Nome = Nome;
    }

    public void setDataNasc(String DataNasc){
        this.DataNasc = DataNasc;
    }

    public void setIdade(int Idade){
        this.Idade = Idade;
    }

    //métodos
    public void mostrarPessoa(){
        System.out.println("Olá " + Nome + " você nasceu em " + DataNasc + " e tem " + Idade + " anos.");
    }

    public void dobraIdade(){
        System.out.println("O dobro da sua idade é: " + Idade*2);
    }

    public void metadeIdade(){
        System.out.println("A metade da sua idade é: " + Idade/2);
    }
}
