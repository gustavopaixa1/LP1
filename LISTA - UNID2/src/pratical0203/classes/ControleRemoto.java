package pratical0203.classes;

public class ControleRemoto {

    public void aumentarVolume(Televisao tv) {
        if (tv.getVolume()  == 99) {
            System.out.println("A TV já está no volume máximo.\n");
        } else {
            tv.setVolume(tv.getVolume() + 1);
            System.out.println("Volume aumentado para: " + tv.getVolume() + "\n");
        }
    }

    public void diminuirVolume(Televisao tv) {
        if (tv.getVolume() < 1) {
            System.out.println("A TV já está no volume mínimo\n");
        } else {
            tv.setVolume(tv.getVolume() - 1);
            System.out.println("Volume diminuido para: " + tv.getVolume() + "\n");
        }
    }

    public void aumentarCanal(Televisao tv) {
        tv.setCanal((tv.getCanal() + 1));
        System.out.println("Canal atual: " + tv.getCanal() + "\n");
    }

    public void diminuirCanal(Televisao tv) {
        if (tv.getCanal() < 2) {
            System.out.println("Você já está no menor canal\n");
        } else {
            tv.setCanal((tv.getCanal() - 1));
            System.out.println("Canal atual: " + tv.getCanal() + "\n");
        }
    }

    public void alterarCanal(Televisao tv, int n) {
        if (n < 1){
            System.out.println("Canal inválido, por favor, digitar um canal maior que 0 \n");
        }
        else{
            tv.setCanal(n);
            System.out.println("Canal atual: " + tv.getCanal() + "\n");
        }
    }

    public void mostraInfo(Televisao tv) {
        tv.MostraInfo();
    }
}
