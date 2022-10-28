package aula01;

import java.util.ArrayList;

public class Agenda {
    public ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();

    public void armazenaPessoa(String nome, int idade, float altura) {
        if(pessoas.size() < 3) {
            Pessoa pessoa = new Pessoa(nome, idade, altura);
            pessoas.add(pessoa);
        }        
    }

    public void removePessoa(String nome) {
        for(Pessoa pessoa : pessoas) {
            String pessoaNome = pessoa.getNome();
            if(pessoaNome == nome) {
                pessoas.remove(pessoa);
                break;
            }
        }
    }

    public void buscaPessoa(String nome) {
        for(Pessoa pessoa : pessoas) {
            String pessoaNome = pessoa.getNome();
            if(pessoaNome == nome) {
                int pessoaIndex = pessoas.indexOf(pessoa);
                System.out.println("O index de " + nome + " é: " + pessoaIndex);
                break;
            }
        }
    }

    public void imprimeAgenda() {
        for(Pessoa pessoa : pessoas) {
            System.out.println("\n" + pessoa.getNome());
            System.out.println(pessoa.getIdade());
            System.out.println(pessoa.getAltura() + "\n");
        }
    }

    public void imprimePessoa(int index) {
        Pessoa pessoa = pessoas.get(index);
        System.out.println("A pessoa de index" + index + " é: " + pessoa.getNome());
    }
}
