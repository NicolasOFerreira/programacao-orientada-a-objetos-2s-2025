package sistema_iptu;

public class Apartamento extends Imovel{
    private boolean possuiElevador;
   
    public Apartamento(Municipio municipio, double areaM2, Integer vagas, boolean possuiElevador) {
        super(municipio, areaM2, vagas);
    }

    public boolean isPossuiElevador() {
        return this.possuiElevador;
    }

    public boolean getPossuiElevador() {
        return this.possuiElevador;
    }

    public void setPossuiElevador(boolean possuiElevador) {
        this.possuiElevador = possuiElevador;
    }
    
}
