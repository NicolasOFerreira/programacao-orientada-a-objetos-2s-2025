package sistema_radar;

public class Simulacao {
    public static void main(String[] args) {
        Carro caravan_6c = new Carro();
        caravan_6c.ano = 79;
        caravan_6c.modelo = "comodoro";
        caravan_6c.placa = "jik2908";
        caravan_6c.velocidade= 0;
        
        Radar radar = new Radar();
        radar.localizacao = "Pistão sul";
        radar.limiteVelocidade = 60;

         radar.avaliarVelocidade(caravan_6c);
        caravan_6c.acelerar();
        caravan_6c.acelerar();
        caravan_6c.acelerar();
        caravan_6c.acelerar();
        caravan_6c.acelerar();
        caravan_6c.acelerar();
        caravan_6c.acelerar();

        radar.avaliarVelocidade(caravan_6c);

    
    
    }

}
