package entities;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    private String nome;
    private String sobrenome;
    private LocalDate dataNasc;
    // List é uma interface e usamos o array list para instanciar ela
    // (Por ser uma interface, não podemos instanciar ele)
    private List colecao = new ArrayList<>();

    public Pessoa() {
    }

    public Pessoa(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public LocalDate getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(LocalDate dataNasc) {
        this.dataNasc = dataNasc;
    }

    public List<String> adicionarNomes(Pessoa p){
        int var = p.getNome().length();
        int idade = p.calcIdade();


        if (var >=5 &&idade >= 18){
            colecao.add(p.getNome());
            System.out.println(colecao);
        }
        return null;
   }

   public int calcIdade(){
        int idade = Period.between(this.dataNasc, LocalDate.of(2022, 8, 01))
                .getYears();
        return idade;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", dataNasc=" + dataNasc +
                '}';
    }


}
