package aula01;

public class Agenda {
    String pessoaNome;
    int pessoaIdade;
    float pessoaAltura;
    String[] pessoas;

    public Agenda(String pessoaNome, int pessoaIdade, float pessoaAltura, String[] pessoas) {
        this.pessoaNome = pessoaNome;
        this.pessoaIdade = pessoaIdade;
        this.pessoaAltura = pessoaAltura;
        this.pessoas = pessoas;
    }

    public String getPessoaNome() {
        return pessoaNome;
    }
    public void setPessoaNome(String pessoaNome) {
        this.pessoaNome = pessoaNome;
    }
    public int getPessoaIdade() {
        return pessoaIdade;
    }
    public void setPessoaIdade(int pessoaIdade) {
        this.pessoaIdade = pessoaIdade;
    }
    public float getPessoaAltura() {
        return pessoaAltura;
    }
    public void setPessoaAltura(float pessoaAltura) {
        this.pessoaAltura = pessoaAltura;
    }
    public String[] getPessoas() {
        return pessoas;
    }
    public void setPessoas(String[] pessoas) {
        this.pessoas = pessoas;
    }

    public void armazenaPessoa(String nome, int idade, float altura) {
        setPessoaNome(nome);
        setPessoaIdade(idade);
        setPessoaAltura(altura);
    }
}
