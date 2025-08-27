public class simulacao{
    public static void main(String[] args) {
        Carro opala = new Carro();
        opala.velocidade = 0;
        opala.placa = "ACLR300";
        opala.modelo = "Comodoro";
        opala.ano = 76;

        Radar radar = new Radar();
        radar.modelo = "pardal";
        radar.limitevelocidade = 60;
        radar.localizacao = "pistao sul";

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