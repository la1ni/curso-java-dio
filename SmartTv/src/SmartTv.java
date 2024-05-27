public class SmartTv {
    boolean ligada = false;
    int volume = 25;
    int canal = 1;

    public void ligar(){
        ligada = true;
    }
    public void desligar() {
        ligada = false;
    }
    public void aumentarVolume(){
        volume = ++volume;
    }
    public void reduzirVolume(){
        volume = --volume;
    }
    public void aumentarCanal(){
        canal = ++canal;
    }
    public void reduzirCanal(){
        canal = --canal;
    }
    public void setCanal(int canal) {
        this.canal = canal;
    }
}
