package pratical0203.classes;

public class ControleRemoto {

    public void aumentarVolume(Televisao tv) {
        tv.setVolume(tv.getVolume() + 1);
        if (tv.getVolume() > 100) {
            System.out.println("A TV já está no volume máximo.\n");
            tv.setVolume(tv.getVolume() - 1);
        } else {
            System.out.println("Volume aumentado para: " + tv.getVolume() + "\n");
        }
    }

    public void diminuirVolume(Televisao tv) {
        tv.setVolume(tv.getVolume() - 1);

        if (tv.getVolume() < 0) {
            System.out.println("A TV já está no volume mínimo\n");
            tv.setVolume(tv.getVolume() + 1);
        } else {
            System.out.println("Volume diminuido para: " + tv.getVolume() + "\n");
        }
    }

    public void aumentarCanal(Televisao tv) {
        tv.setCanal((tv.getCanal() + 1));
        System.out.println("Canal atual: " + tv.getCanal() + "\n");
    }

    public void diminuirCanal(Televisao tv) {
        tv.setCanal((tv.getCanal() - 1));
        if (tv.getCanal() < 1) {
            System.out.println("Você já está no menor canal\n");
            tv.setCanal((tv.getCanal() + 1));
        } else {
            System.out.println("Canal atual: " + tv.getCanal() + "\n");
        }
    }

    public void mostraInfo(Televisao tv) {
        System.out.println("\n--- Informações ---");
        System.out.println("Canal: " + tv.getCanal());
        System.out.println("Volume: " + tv.getVolume() + "\n");
    }

    public void alterarCanal(Televisao tv, int n) {
        int canalOriginal = tv.getCanal();
        tv.setCanal(n);
        if (tv.getCanal()<1){
            System.out.println("Canal inválido, por favor, digitar um canal maior que 0");
            tv.setCanal(canalOriginal);
        }
        System.out.println("Canal atual: " + tv.getCanal() + "\n");
    }
}
