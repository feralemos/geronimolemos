package mortalkombat;

public class Reptile extends Personagem {

    String invisivel() {
        return "baixo, cima," + this.chuteforte;
    }

    String bolarapida() {
        return "atrás, frente," + this.socoforte;
    }

    String bolalenta() {
        return "atrás, frente," + this.socofraco;
    }

    String acido() {
        return "baixo, atrás," + this.chuteforte;
    }

    String combo1() {
        return this.socoforte + this.chuteforte;
    }

    String combo2() {
        return this.chuteforte + this.agarra;
    }

    String fatality() {
        return "baixo, frente" + this.chuteforte + this.socoforte;
    }

}
