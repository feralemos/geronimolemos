package mortalkombat;

public class KungLao extends Personagem {

    String jogarchapeu() {
        return "frente, frente, " + this.socoforte;
    }

    String redemoinho() {
        return "trás, trás, " + this.socofraco;
    }

    String chuteaereo() {
        return "frente, cima" + this.chuteforte;
    }

    String combo1() {
        return this.redemoinho() + this.socofraco;
    }

    String combo2() {
        return this.chuteaereo() + this.jogarchapeu();
    }

    String fatality() {
        return this.chuteforte + this.socoforte + this.socofraco;
    }

    String fatality2() {
        return this.chutefraco + this.socofraco + this.socofraco;
    }

}
