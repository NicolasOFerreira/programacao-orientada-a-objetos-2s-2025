package atividade1;

public class Programa {
    public Integer memoriaRAMAlocada;
    public Integer SSDOcupado;
    public Integer nucleos;
    public Integer quantidadeDeOperacoes;

    public Programa(Integer memoriaRAMAlocada, Integer SSDOcupado, Integer nucleos, Integer quantidadeDeOperacoes) {
        this.memoriaRAMAlocada = memoriaRAMAlocada;
        this.SSDOcupado = SSDOcupado;
        this.nucleos = nucleos;
        this.quantidadeDeOperacoes = quantidadeDeOperacoes;
    }

    public Integer getMemoriaRAMAlocada() {
        return this.memoriaRAMAlocada;
    }

    public void setMemoriaRAMAlocada(Integer memoriaRAMAlocada) {
        this.memoriaRAMAlocada = memoriaRAMAlocada;
    }

    public Integer getSSDOcupado() {
        return this.SSDOcupado;
    }

    public void setSSDOcupado(Integer SSDOcupado) {
        this.SSDOcupado = SSDOcupado;
    }

    public Integer getNucleos() {
        return this.nucleos;
    }

    public void setNucleos(Integer nucleos) {
        this.nucleos = nucleos;
    }

    public Integer getQuantidadeDeOperacoes() {
        return this.quantidadeDeOperacoes;
    }

    public void setQuantidadeDeOperacoes(Integer quantidadeDeOperacoes) {
        this.quantidadeDeOperacoes = quantidadeDeOperacoes;
    }
    
}
