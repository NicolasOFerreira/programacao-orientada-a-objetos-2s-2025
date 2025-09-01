package sistema_radar;

public class Radar {
    public String localizacao;
    public Integer limiteVelocidade;

    public void emitirNotificacao(String placa, Integer velocidadeObservada){
        System.out.println("Placa: "+placa);
        System.out.println("velocidade observada"+velocidadeObservada);
        System.out.println("localização: "+this.localizacao);
        System.out.println("velocidade da via: "+this.limiteVelocidade);
    }
    public void avaliarVelocidade(Carro carro){
        if(carro.velocidade > this.limiteVelocidade){
            emitirNotificacao(carro.placa,carro.velocidade);
        }
    }
}
