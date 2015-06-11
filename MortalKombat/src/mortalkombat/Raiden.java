package mortalkombat;

public class Raiden extends Personagem {

    String supreman() {
        return "frente, frente," + this.socofraco;
    }

    String boladeraio() {
        return "baixo, frente, " + this.socoforte;
    }

    String shocker() {
        return "frente, frente, " + this.socoforte;
    }

    String combo1() {
        return this.boladeraio() + this.shocker();
    }

    String combo2() {
        return this.supreman() + this.socoforte;
    }

    String fatality1() {
        return "frente, cima, baixo, trás" + this.chuteforte + this.socoforte;
    }

    String fatality2() {
        return "frentte, baixo, trás, " + this.chutefraco + this.socoforte;
    }

}
