package atividade1;

public class Main {
    public static void main(String[] args) {
        
        Computador pc = new Computador(8000, 20000, 8, 2000f);
    
        SistemaOperacional win = new SistemaOperacional(pc);

        Programa p1 = new Programa(2000, 500, 2, 10000);
        Programa p2 = new Programa(3000, 26000, 2, 20000);
        Programa p3 = new Programa(16000, 1000, 2, 30000);
    
        win.executarPrograma(p1);
        win.executarPrograma(p2);
        win.executarPrograma(p3);
    
    
    }
    
}
