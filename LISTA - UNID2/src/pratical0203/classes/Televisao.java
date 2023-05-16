package pratical0203.classes;

public class Televisao {
    int canal = 1;
    int volume = 10;

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

    @Override
    public String toString() {
        return "Televisao{" +
                "canal=" + canal +
                ", volume=" + volume +
                '}';
    }
}
