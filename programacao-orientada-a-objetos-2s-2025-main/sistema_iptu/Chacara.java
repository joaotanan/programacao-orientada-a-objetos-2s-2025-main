package sistema_iptu;

public class Chacara extends imovel{
    private Boolean possuiPocoArtesiano;

    public Chacara(Double areaM2, Municipio municipio, Integer vagas,Boolean possuiPocoArtesiano){
        super(municipio, areaM2, vagas, possuiPocoArtesiano);
        
    }
