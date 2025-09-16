package atividade1;

public class SistemaOperacional {
    public Computador computador;
    public boolean executarPrograma;

    public boolean executarPrograma(Programa p){
        System.out.println("Executando o programa...");
    }

    public SistemaOperacional(Computador computador, boolean executarPrograma) {
        this.computador = computador;
        this.executarPrograma = executarPrograma;
    }

    public Computador getComputador() {
        return this.computador;
    }

    public void setComputador(Computador computador) {
        this.computador = computador;
    }

    public boolean isExecutarPrograma() {
        return this.executarPrograma;
    }

    public boolean getExecutarPrograma() {
        return this.executarPrograma;
    }

    public void setExecutarPrograma(boolean executarPrograma) {
        this.executarPrograma = executarPrograma;
    }
    
}
