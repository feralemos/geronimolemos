package mortalkombat;

public class SubZero extends Personagem {

    String boladegelo() {
        return "baixo, frente," + this.socoforte;
    }

    String deslizao() {
        return "baixo, atrás," + this.chutefraco;
    }

    String teleporte() {
        return "baixo, atrás," + this.socofraco;
    }

    String combo1() {
        return this.socoforte + this.chuteforte;
    }

    String combo2() {
        return this.chuteforte + this.agarra;
    }

    String fatality() {
        return this.chuteforte + this.chutefraco + "baixo" + this.socoforte;
    }

}
