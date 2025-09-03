package sistema_radar;

public class simulacao{
    public static void main(String[] args) {
        Carro opala = new Carro(placa:"ACLR300", velocidade:0, ano:70, modelo:"Comodoro");

        Radar radar = new Radar();
        radar.modelo = "pardal";
        radar.limitevelocidade = 60;
        radar.localizacao = "Pistao sul";

        radar.avaliarvelocidade(opala);

        opala.acelerar();
        opala.acelerar();
        opala.acelerar();
        opala.acelerar();
        opala.acelerar();
        opala.acelerar();
        opala.acelerar();
        opala.acelerar();
        opala.acelerar();
        opala.acelerar();
        opala.acelerar();
        opala.acelerar();

        radar.avaliarvelocidade(opala);

        opala.acelerar();
        radar.avaliarvelocidade(opala);

        opala.frear();
        radar.avaliarvelocidade(opala);
    }
}