package mortalkombat;

public class Scorpion extends Personagem {

    String arpao() {
        return "trás, trás," + this.socoforte;

    }

    String teleportesocando() {
        return "baixo, trás," + this.socoforte;
    }

    String chaoemchamas() {
        return "baixo, trás," + this.socofraco;
    }

    String combo1() {
        return this.socoforte + this.chuteforte;
    }

    String combo2() {
        return this.chuteforte + this.agarra;
    }

    String fatality() {
        return "baixo, trás, frente" + this.socofraco;
    }

}
