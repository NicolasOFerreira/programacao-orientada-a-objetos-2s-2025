package sistema_iptu;

public class Chacara extends Imovel{
    private boolean possuiPocoArtesiano;

    public Chacara(Municipio municipio, double areaM2, Integer vagas, boolean possuiPocoArtesiano) {
        super(municipio, areaM2, vagas);
    }

    public boolean isPossuiPocoArtesiano() {
        return this.possuiPocoArtesiano;
    }

    public boolean getPossuiPocoArtesiano() {
        return this.possuiPocoArtesiano;
    }

    public void setPossuiPocoArtesiano(boolean possuiPocoArtesiano) {
        this.possuiPocoArtesiano = possuiPocoArtesiano;
    }

}
