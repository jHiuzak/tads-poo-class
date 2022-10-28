/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula01;

public class Aula01
{  
    public static void main(String[] args)
    {
        // Elevador
        Elevador elevador = new Elevador();

        elevador.inicializar(5, 10);

        for(int i = 0; i < 2; i++) {
            elevador.entrar(); // 2 pessoas
        }

        for(int i = 0; i < 5; i++) {
            elevador.subir(); // 5º andar
        }

        elevador.sair(); // 1 pessoa

        elevador.descer(); // 4º andar

        for(int i = 0; i < 5; i++) {
            elevador.entrar(); // 6 pessoas
        }

        for(int i = 0; i < 10; i++) {
            elevador.subir(); // 10º andar
        }

        for(int i = 0; i < 10; i++) {
            elevador.descer(); // térreo
        }

        for(int i = 0; i < 6; i++) {
            elevador.sair(); // 0 pessoas
        }

        for(int i = 0; i < 6; i++) {
            elevador.entrar(); // 5 pessoas
        }

        
        // Agenda
        Agenda agenda = new Agenda();

        agenda.armazenaPessoa("Giovanni", 21, 1.74f);

        agenda.armazenaPessoa("Antonio", 19, 1.7f);

        agenda.armazenaPessoa("Monize", 20, 1.6f);

        agenda.armazenaPessoa("Franciele", 20, 1.6f);

        agenda.removePessoa("Antonio");

        agenda.buscaPessoa("Giovanni"); // 0

        agenda.imprimePessoa(1); // Monize

        agenda.imprimeAgenda();

        
        System.out.println("test");
    }  
}  