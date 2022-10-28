package aula01;

import java.util.Scanner;

public class Elevador {
    private int andarAtual;
    private int andaresQuantidade;
    private int passageirosCapacidade;
    private int passageirosQuantidadeAtual;
    private int terreo;

    public Elevador ()
    {
        this.andarAtual = 0;
        this.andaresQuantidade = 0;
        this.passageirosCapacidade = 0;
        this.passageirosQuantidadeAtual = 0;
        this.terreo = terreo;
    }

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    public void setAndaresQuantidade(int andaresQuantidade) {
        this.andaresQuantidade = andaresQuantidade;
    }

    public void setPassageirosCapacidade(int passageirosCapacidade) {
        this.passageirosCapacidade = passageirosCapacidade;
    }

    public void setPassageirosQuantidadeAtual(int passageirosQuantidadeAtual) {
        this.passageirosQuantidadeAtual = passageirosQuantidadeAtual;
    }

    public int getAndarAtual() {
        return andarAtual;
    }

    public int getAndaresQuantidade() {
        return andaresQuantidade;
    }

    public int getPassageirosCapacidade() {
        return passageirosCapacidade;
    }

    public int getPassageirosQuantidadeAtual() {
        return passageirosQuantidadeAtual;
    }

    public int getTerreo() {
        return terreo;
    }

    public void setTerreo(int terreo) {
        this.terreo = terreo;
    }

    public void inicializar(int passageirosCapacidade, int andaresQuantidade) {
        setPassageirosCapacidade(passageirosCapacidade);
        setAndaresQuantidade(andaresQuantidade);
    }

    public void entrar() {
        int passageirosQuantidadeAtual = getPassageirosQuantidadeAtual();
        int passageirosCapacidade = getPassageirosCapacidade();

        if(passageirosQuantidadeAtual < passageirosCapacidade) {
            setPassageirosQuantidadeAtual(++passageirosQuantidadeAtual);
        }
    }

    public void sair() {
        int passageirosQuantidadeAtual = getPassageirosQuantidadeAtual();

        if(passageirosQuantidadeAtual > 0) {
            setPassageirosQuantidadeAtual(--passageirosQuantidadeAtual);
        }
    }

    public void subir() {
        int andaresQuantidade = getAndaresQuantidade();
        int andarAtual = getAndarAtual();

        if(andaresQuantidade > andarAtual) {
            setAndarAtual(++andarAtual);
        }
    }

    public void descer() {
        int terreo = getTerreo();
        int andarAtual = getAndarAtual();

        if(andarAtual > terreo) {
            setAndarAtual(--andarAtual);
        }
    }
}
