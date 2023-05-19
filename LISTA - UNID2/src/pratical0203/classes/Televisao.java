package pratical0203.classes;

public class Televisao {
    private int canal = 1;
    private int volume = 10;

    public Televisao() {
    }

    public Televisao(int canal, int volume) {
        this.canal = canal;
        this.volume = volume;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void MostraInfo() {
        System.out.println("\n--- Informações ---");
        System.out.println("Canal: " + getCanal());
        System.out.println("Volume: " + getVolume() + "\n");
    }
}
