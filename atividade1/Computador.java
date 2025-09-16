package atividade1;

public class Computador {
    public Integer memoriaRAM;
    public Integer SSD;
    public Integer nucleos;
    public float operacoesPorSegundo;

    public Computador(Integer memoriaRAM, Integer SSD, Integer nucleos, float operacoesPorSegundo) {
        this.memoriaRAM = memoriaRAM;
        this.SSD = SSD;
        this.nucleos = nucleos;
        this.operacoesPorSegundo = operacoesPorSegundo;
    }

    public Integer getMemoriaRAM() {
        return this.memoriaRAM;
    }

    public void setMemoriaRAM(Integer memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }

    public Integer getSSD() {
        return this.SSD;
    }

    public void setSSD(Integer SSD) {
        this.SSD = SSD;
    }

    public Integer getNucleos() {
        return this.nucleos;
    }

    public void setNucleos(Integer nucleos) {
        this.nucleos = nucleos;
    }

    public float getOperacoesPorSegundo() {
        return this.operacoesPorSegundo;
    }

    public void setOperacoesPorSegundo(float operacoesPorSegundo) {
        this.operacoesPorSegundo = operacoesPorSegundo;
    }

    
}
