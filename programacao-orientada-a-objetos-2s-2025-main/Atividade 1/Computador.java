public class Computador {
    private int memoriaRAM;
    private int SSD;
    private int nucleos;
    private float operacoesPorSegundo;

    public Computador(int memoriaRAM, int SSD, int nucleos, float operacoesPorSegundo) {
        this.memoriaRAM = memoriaRAM;
        this.SSD = SSD;
        this.nucleos = nucleos;
        this.operacoesPorSegundo = operacoesPorSegundo;
    }

    public int getMemoriaRAM() {
        return memoriaRAM;
    }

    public void setMemoriaRAM(int memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }

    public int getSSD() {
        return SSD;
    }

    public void setSSD(int SSD) {
        this.SSD = SSD;
    }

    public int getNucleos() {
        return nucleos;
    }

    public void setNucleos(int nucleos) {
        this.nucleos = nucleos;
    }

    public float getOperacoesPorSegundo() {
        return operacoesPorSegundo;
    }

    public void setOperacoesPorSegundo(float operacoesPorSegundo) {
        this.operacoesPorSegundo = operacoesPorSegundo;
    }

    public boolean alocarRAM(int memoriaAlocada) {
        if (memoriaAlocada <= this.memoriaRAM) {
            this.memoriaRAM -= memoriaAlocada;
            return true;
        }
        return false;
    }

    public void desalocarRAM(int memoriaAlocada) {
        this.memoriaRAM += memoriaAlocada;
    }

    public boolean alocarSSD(int SSDOcupado) {
        if (SSDOcupado <= this.SSD) {
            this.SSD -= SSDOcupado;
            return true;
        }
        return false;
    }
    
    public void desalocarSSD(int SSDOcupado) {
        this.SSD += SSDOcupado;
    }
}