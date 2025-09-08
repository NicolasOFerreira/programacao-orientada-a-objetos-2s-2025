package sistema_radar;

public class Radar {
    private String localizacao;
    private Integer limiteVelocidade;

  
  //método construtor
    public Radar(String localizacao, Integer limiteVelocidade){

        this.localizacao= "localizacao";
        this.limiteVelocidade= "limiteVelocidade";
    }


    public String getLocalizacao(){
        return this.localizacao;
    }

    public Integer getLimiteVelocidade(){
        return this.limiteVelocidade;
    }

    public void emitirNotificacao(String placa, Integer velocidadeObservada){
        System.out.println("Placa: "+getPlaca());
        System.out.println("velocidade observada"+velocidadeObservada);
        System.out.println("localização: "+getLocalizacao());
        System.out.println("velocidade da via: "+getLimiteVelocidade());
    }
    public void avaliarVelocidade(Carro carro){
        if(carro.getVelocidade() > getLimiteVelocidade()){
            emitirNotificacao(carro.placa,carro.getVelocidade());
        }
    }
}
