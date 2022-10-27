package aula01;

import java.util.Scanner;

public class Elevador {
    byte andarAtual;
    byte andaresQuantidade;
    byte passageirosCapacidade;
    byte passageirosQuantidadeAtual;
    byte terreo;

    public Elevador ()
    {
        this.andarAtual = 0;
        this.andaresQuantidade = 0;
        this.passageirosCapacidade = 0;
        this.passageirosQuantidadeAtual = 0;
        this.terreo = terreo;
    }

    public void setAndarAtual(byte andarAtual) {
        this.andarAtual = andarAtual;
    }

    public void setAndaresQuantidade(byte andaresQuantidade) {
        this.andaresQuantidade = andaresQuantidade;
    }

    public void setPassageirosCapacidade(byte passageirosCapacidade) {
        this.passageirosCapacidade = passageirosCapacidade;
    }

    public void setPassageirosQuantidadeAtual(byte passageirosQuantidadeAtual) {
        this.passageirosQuantidadeAtual = passageirosQuantidadeAtual;
    }

    public byte getAndarAtual() {
        return andarAtual;
    }

    public byte getAndaresQuantidade() {
        return andaresQuantidade;
    }

    public byte getPassageirosCapacidade() {
        return passageirosCapacidade;
    }

    public byte getPassageirosQuantidadeAtual() {
        return passageirosQuantidadeAtual;
    }

    public byte getTerreo() {
        return terreo;
    }

    public void setTerreo(byte terreo) {
        this.terreo = terreo;
    }

    public void inicializar(byte passageirosCapacidade, byte andaresQuantidade) {
        setPassageirosCapacidade(passageirosCapacidade);
        setAndaresQuantidade(andaresQuantidade);
    }

    public void entrar() {
        byte passageirosQuantidadeAtual = getPassageirosQuantidadeAtual();
        byte passageirosCapacidade = getPassageirosCapacidade();

        if(passageirosQuantidadeAtual <= passageirosCapacidade) {
            setPassageirosQuantidadeAtual(++passageirosQuantidadeAtual);
        }
    }

    public void sair() {
        byte passageirosQuantidadeAtual = getPassageirosQuantidadeAtual();

        if(passageirosQuantidadeAtual > 0) {
            setPassageirosQuantidadeAtual(--passageirosQuantidadeAtual);
        }
    }

    public void subir() {
        byte andaresQuantidade = getAndaresQuantidade();
        byte andarAtual = getAndarAtual();

        if(andaresQuantidade > andarAtual) {
            setAndarAtual(++andarAtual);
        }
    }

    public void descer() {
        byte terreo = getTerreo();
        byte andarAtual = getAndarAtual();

        if(andarAtual > terreo) {
            setAndarAtual(--andarAtual);
        }
    }
}
