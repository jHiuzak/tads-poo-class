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
        Data dataNasc = new Data(11, 6, 2001);
        Endereco endereco = new Endereco("Rua do Outono Alaranjado", 1270, "Vila do Bordo", "Canela", "RS", "23300-000");
        Contato contato = new Contato("4002-8922", "(84) 9 4002-8922", "roberto.pera@pixar.com");
        Pessoa pessoa = new Pessoa("Giovanni", dataNasc, endereco, contato);
        System.out.println("");
    }  
}  