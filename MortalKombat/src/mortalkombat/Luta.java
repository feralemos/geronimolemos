package mortalkombat;

public class Luta {

    private String cenario;
    private Personagem personagem1;
    private Personagem personagem2;
    private Integer dano;
    private Integer danocombo;
    private Integer danoespecial;

    public Integer getDanoespecial() {
        return danoespecial;
    }

    public void setDanoespecial(Integer danoespecial) {
        this.danoespecial = danoespecial;
    }

    public String getCenario() {
        return cenario;
    }

    public void setCenario(String cenario) {
        this.cenario = cenario;
    }

    public Personagem getPersonagem1() {
        return personagem1;
    }

    public void setPersonagem1(Personagem personagem1) {
        this.personagem1 = personagem1;
    }

    public Personagem getPersonagem2() {
        return personagem2;
    }

    public void setPersonagem2(Personagem personagem2) {
        this.personagem2 = personagem2;
    }

    public Integer getDano() {
        return dano;
    }

    public void setDano(Integer dano) {
        this.dano = dano;
    }

    public Integer getDanocombo() {
        return danocombo;
    }

    public void setDanocombo(Integer danocombo) {
        this.danocombo = danocombo;
    }

    public Luta() {
        this.cenario = "Goro's Lair";
        this.dano = 5;
        this.danocombo = 40;
        this.danoespecial = 20;
        this.personagem1 = new Personagem();
        this.personagem2 = new Personagem();
    }

    public void acertagolpe(String lutador) {
        if (lutador.equals("p1")) {
            this.personagem2.setVida(this.personagem2.getVida() - this.dano);
        } else {
            this.personagem1.setVida(this.personagem1.getVida() - this.dano);
        }
    }

    public void acertaespecial(String lutador) {
        if (lutador.equals("p1")) {
            this.personagem2.setVida(this.personagem2.getVida() - this.danoespecial);
        } else {
            this.personagem1.setVida(this.personagem1.getVida() - this.danoespecial);
        }

    }

    public void acertacombo(String lutador) {

        if (lutador.equals("p1")) {
            this.personagem2.setVida(this.personagem2.getVida() - this.danocombo);
        } else {
            this.personagem1.setVida(this.personagem1.getVida() - this.danocombo);
        }

    }

    public void acertacombo2(String lutador) {

        if (lutador.equals("p1")) {
            this.personagem2.setVida(this.personagem2.getVida() - this.danocombo);
        } else {
            this.personagem1.setVida(this.personagem1.getVida() - this.danocombo);
        }

    }

}
