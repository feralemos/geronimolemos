package mortalkombat;

import javax.swing.JOptionPane;

public class MortalKombat {

    public static void main(String[] args) {

        Reptile p1 = new Reptile();
        SubZero p3 = new SubZero();
        Scorpion p2 = new Scorpion();
        Raiden p4 = new Raiden();
        Kitana p5 = new Kitana();
        KungLao p6 = new KungLao();
        Luta luta1 = new Luta();
//Movimentos Reptille
        p1.setSocoforte("quadrado");
        p1.setChuteforte("bolinha");
        p1.setChutefraco("triângulo");
        p1.setSocofraco("X");
        p1.setAgarra("r1");
        p1.setDefesa("r2");
//Movimentos SubZeros
        p3.setSocoforte("quadrado");
        p3.setChuteforte("bolinha");
        p3.setChutefraco("triângulo");
        p3.setSocofraco("X");
        p3.setAgarra("r1");
        p3.setDefesa("r2");

//Movimentos Scorpion        
        p2.setSocoforte("quadrado");
        p2.setChuteforte("bolinha");
        p2.setChutefraco("triângulo");
        p2.setSocofraco("X");
        p2.setAgarra("r1");
        p2.setDefesa("r2");

// Movimentos Raiden
        p4.setSocoforte("y");
        p4.setChuteforte("d");
        p4.setChutefraco("x");
        p4.setSocofraco("b");
        p4.setAgarra("rt1");
        p4.setDefesa("rt2");

// Movimentos Kitana
        p5.setSocoforte("y");
        p5.setChuteforte("d");
        p5.setChutefraco("x");
        p5.setSocofraco("b");
        p5.setAgarra("rt1");
        p5.setDefesa("rt2");

// Movimentos Kung Lao
        p6.setSocoforte("y");
        p6.setChuteforte("d");
        p6.setChutefraco("x");
        p6.setSocofraco("b");
        p6.setAgarra("rt1");
        p6.setDefesa("rt2");

        int opc = 0;

        while (opc != 3) {
            opc = Integer.parseInt(JOptionPane.showInputDialog("******ESCOLHA O CONSOLE QUE DESEJA JOGAR***** \n"
                    + "1-PS3 \n"
                    + "2-XBOX 360 \n"
                    + "3-SAIR"));

            switch (opc) {
                case 1: {
                    int opcaopersonagem = 0;
                    while (opcaopersonagem != 8) {

                        opcaopersonagem = Integer.parseInt(JOptionPane.showInputDialog("Escolha o personagem que você deseja jogar: \n"
                                + "1-Reptille VS Scorpion \n"
                                + "2- Reptille VS Reptille \n"
                                + "3- Reptille VS SubZero \n"
                                + "4- SubZero VS Scorpion \n"
                                + "5- SubZero VS SubZero \n"
                                + "6- Scorpion VS Scorpion \n"
                                + "7- Comandos especiais dos personagens \n"
                                + "8- Sair"));

                        switch (opcaopersonagem) {
                            case 1: {
                                luta1.setCenario("Casa de sangue");
                                luta1.setPersonagem1(p1);
                                luta1.setPersonagem2(p2);
                                p1.setVida(100);
                                p2.setVida(100);

                                luta1.acertagolpe("p1");
                                JOptionPane.showMessageDialog(null, "\nCenário" + luta1.getCenario()
                                        + "Reptille acerta golpe básico: \n" + p1.socoforte + "\n"
                                        + "\n Personagem 1:" + luta1.getPersonagem1().getVida()
                                        + "\n Personagem 2:" + luta1.getPersonagem2().getVida());

                                luta1.acertaespecial("p1");
                                JOptionPane.showMessageDialog(null, "Reptille acerta bola ácida (lenta):\n" + p1.bolalenta()
                                        + "\n Reptille 1:" + luta1.getPersonagem1().getVida()
                                        + "\n Scorpion 2:" + luta1.getPersonagem2().getVida());

                                luta1.acertacombo("p2");
                                JOptionPane.showMessageDialog(null, "Scorpion acerta combo: \n " + p2.combo1()
                                        + "\n Reptille 1:" + luta1.getPersonagem1().getVida()
                                        + "\n Scorpion 2:" + luta1.getPersonagem2().getVida());
                                break;
                            }

                            case 2: {
                                Luta luta2 = new Luta();

                                luta2.setCenario("Estação do metrô");
                                luta2.setPersonagem1(p1);
                                luta2.setPersonagem1(p1);
                                p1.setVida(100);

                                luta2.acertaespecial("p1");
                                JOptionPane.showMessageDialog(null, "\n Cenário:" + luta2.getCenario()
                                        + "Reptille acerta ácido:\n" + p1.acido()
                                        + "\n Reptille 1:" + luta2.getPersonagem1().getVida()
                                        + "\n Reptille 2:" + luta2.getPersonagem2().getVida());

                                luta2.acertaespecial("p2");
                                JOptionPane.showMessageDialog(null, "Reptille (2) acerta bola ácida (lenta): \n" + p1.bolalenta()
                                        + "\n Reptille 1:" + luta2.getPersonagem1().getVida()
                                        + "\n Reptille 2:" + luta2.getPersonagem2().getVida());
                                luta2.acertacombo2("p1");
                                JOptionPane.showMessageDialog(null, "Reptille acerta combo" + p1.combo2());
                                break;
                            }

                            case 3: {
                                Luta luta3 = new Luta();
                                luta3.setCenario("Sala do Imperador");
                                p1.setVida(100);
                                p3.setVida(100);
                                luta3.setPersonagem1(p1);
                                luta3.setPersonagem2(p3);

                                luta3.acertaespecial("p1");
                                JOptionPane.showMessageDialog(null, "\n Cenário:" + luta3.getCenario()
                                        + "Reptille acerta ácido:\n" + p1.acido()
                                        + "\n Reptille:" + luta3.getPersonagem1().getVida()
                                        + "\n SubZero 2:" + luta3.getPersonagem2().getVida());
                                luta3.acertaespecial("p1");
                                JOptionPane.showMessageDialog(null, "Reptille acerta bola ácida (rápida):\n" + p1.bolarapida()
                                        + "\n Reptille :" + luta3.getPersonagem1().getVida()
                                        + "\n SubZero:" + luta3.getPersonagem2().getVida());
                                luta3.acertaespecial("p2");
                                JOptionPane.showMessageDialog(null, "SubZero acerta bola de gelo:" + p3.boladegelo() + "\n"
                                        + " Reptille:" + luta3.getPersonagem1().getVida() + "\n"
                                        + " SubZero:" + luta3.getPersonagem2().getVida());

                                break;
                            }

                            case 4: {
                                Luta luta4 = new Luta();
                                luta4.setCenario("Sala do ácido");
                                luta4.setPersonagem1(p1);
                                luta4.setPersonagem2(p3);
                                p1.setVida(100);
                                p3.setVida(100);

                                luta4.acertaespecial("p1");
                                JOptionPane.showMessageDialog(null, "\nCenário:" + luta4.getCenario()
                                        + "Scorpion acerta arpão:\n" + p2.arpao()
                                        + "\n Scorpion:" + luta4.getPersonagem1().getVida()
                                        + "\n SubZero 2:" + luta4.getPersonagem2().getVida());
                                luta4.acertaespecial("p1");
                                JOptionPane.showMessageDialog(null, "Scorpion acerta teleporte com soco:\n" + p2.teleportesocando()
                                        + "\n Scorpion :" + luta4.getPersonagem1().getVida()
                                        + "\n SubZero:" + luta4.getPersonagem2().getVida());

                                luta1.acertaespecial("p2");
                                JOptionPane.showMessageDialog(null, "SubZero acerta bola de gelo:" + p3.boladegelo() + "\n"
                                        + " Scorpion:" + luta4.getPersonagem1().getVida() + "\n"
                                        + " SubZero:" + luta4.getPersonagem2().getVida());
                                break;

                            }

                            case 5: {
                                Luta luta5 = new Luta();
                                luta5.setCenario("Inferno de Scorpion");
                                luta5.setPersonagem1(p3);
                                luta5.setPersonagem1(p3);
                                p3.setVida(100);

                                luta5.acertaespecial("p1");
                                JOptionPane.showMessageDialog(null, "\nCenário:" + luta5.getCenario()
                                        + "SubZero acerta bola de gelo:\n" + p3.boladegelo()
                                        + "\n SubZero 1:" + luta5.getPersonagem1().getVida()
                                        + "\n SubZero 2:" + luta5.getPersonagem2().getVida());

                                luta5.acertaespecial("p1");
                                JOptionPane.showMessageDialog(null, " SubZero acerta combo: \n" + p3.combo2()
                                        + " SubZero 1:" + luta5.getPersonagem1().getVida()
                                        + "\n SubZero 2:" + luta5.getPersonagem2().getVida());

                                luta5.acertaespecial("p2");
                                JOptionPane.showMessageDialog(null, " SubZero (2) acerta bola de gelo: \n" + p3.boladegelo()
                                        + " SubZero 1:" + luta5.getPersonagem1().getVida()
                                        + "\n SubZero 2:" + luta5.getPersonagem2().getVida());
                                break;

                            }

                            case 6: {
                                Luta luta6 = new Luta();
                                luta6.setCenario("Topo do prédio");
                                luta6.setPersonagem1(p2);
                                luta6.setPersonagem1(p2);
                                p2.setVida(100);

                                luta6.acertaespecial("p1");
                                JOptionPane.showMessageDialog(null, "\nCenário:" + luta6.getCenario()
                                        + "Scorpion acerta arpão:\n" + p2.arpao()
                                        + "\n Scorpion 1:" + luta6.getPersonagem1().getVida()
                                        + "\n Scorpion 2:" + luta6.getPersonagem2().getVida());

                                luta6.acertaespecial("p1");
                                JOptionPane.showMessageDialog(null, " Scorpion acerta combo: \n" + p2.combo2()
                                        + "\nScorpion 1:" + luta6.getPersonagem1().getVida()
                                        + "\n Scorpion 2:" + luta6.getPersonagem2().getVida());

                                luta1.acertaespecial("p2");
                                JOptionPane.showMessageDialog(null, " Scorpion (2) acerta combo: \n" + p2.combo1()
                                        + "\n Scorpion 1:" + luta6.getPersonagem1().getVida()
                                        + "\n Scorpion 2:" + luta6.getPersonagem2().getVida());
                                break;

                            }

                            case 7: {
                                JOptionPane.showMessageDialog(null, "********Movimentos especiais(Reptille)********* \n"
                                        + "Ácido" + p1.acido() + "\n"
                                        + "Bola ácida (lenta)" + p1.bolalenta() + "\n"
                                        + "Bola ácida (rápida)" + p1.bolarapida());

                                JOptionPane.showMessageDialog(null, "********Movimentos especiais(SubZero)********* \n"
                                        + "Bola de gelo" + p3.boladegelo() + "\n"
                                        + "Deslizão:" + p3.deslizao() + "\n"
                                        + "Teleporte:" + p3.teleporte());

                                JOptionPane.showMessageDialog(null, "********Movimentos especiais(Scorpion)********* \n"
                                        + "Arpão:" + p2.arpao() + "\n"
                                        + "Teleporte com soco:" + p2.teleportesocando() + "\n"
                                        + "Chão em chamas:" + p2.chaoemchamas());

                                break;

                            }
                            case 8:{
                                JOptionPane.showMessageDialog(null, "Adeus");
                                break;
                            }

                            default: {
                                JOptionPane.showMessageDialog(null, "Opção inválida");
                                break;

                            }

                        }
                    }
                    break;

                }

                case 2: {
                    int opcaopersonagem1 = 0;

                    while (opcaopersonagem1 != 3) {

                        opcaopersonagem1 = Integer.parseInt(JOptionPane.showInputDialog("Escolha o personagem que você deseja jogar: \n"
                                + "1-Reptille VS Kitana \n"
                                + "2-Kung Lao VS Raiden  \n"
                                + "3- Sair"));

                        switch (opcaopersonagem1) {
                            case 1: {
                                Luta luta7 = new Luta();
                                luta7.setCenario("Inferno de Scorpion \n");
                                luta7.setPersonagem1(p1);
                                luta7.setPersonagem2(p2);

                                luta7.acertagolpe("p1");

                                luta7.acertaespecial("p1");
                                JOptionPane.showMessageDialog(null, "\n Cenário:" + luta7.getCenario()
                                        + "Kitana acerta leques voadores:\n" + p5.jogarleque()
                                        + "\n Kitana:" + luta7.getPersonagem1().getVida() + "\n"
                                        + "\n Reptille:" + luta7.getPersonagem2().getVida());

                                luta7.acertaespecial("p1");

                                luta7.acertaespecial("p1");
                                JOptionPane.showMessageDialog(null, "\n Cenário:" + luta7.getCenario()
                                        + "Kitana acerta chute aéreo:\n" + p5.chuteaereo() + "\n"
                                        + "\n Kitana:" + luta7.getPersonagem1().getVida() + "\n"
                                        + "\n Reptille" + luta7.getPersonagem2().getVida());

                                luta1.acertacombo("p2");

                                luta1.acertaespecial("p1");
                                JOptionPane.showMessageDialog(null, "\n Cenário:" + luta7.getCenario()
                                        + "\nReptille acerta combo:\n" + p1.combo2()
                                        + "\n Kitana:" + luta7.getPersonagem1().getVida() + "\n"
                                        + "\n Reptille" + luta7.getPersonagem2().getVida());
                                break;
                            }

                            case 2: {
                                Luta luta8 = new Luta();
                                luta8.setCenario("Inferno de Scorpion \n");
                                luta8.setPersonagem1(p1);
                                luta8.setPersonagem2(p2);

                                luta8.acertagolpe("p1");
                                JOptionPane.showMessageDialog(null, "\n Cenário:" + luta8.getCenario() + "\n"
                                        + "\nRaiden acerta golpe me Kung Lao" + p4.chuteforte + "\n"
                                        + "\nRaiden:" + luta8.getPersonagem1().getVida() + "\n"
                                        + "\nKung Lao" + luta8.getPersonagem2().getVida() + "\n");

                                luta1.acertaespecial("p1");
                                JOptionPane.showMessageDialog(null, "\n Cenário:" + luta8.getCenario() + "\n"
                                        + "\nRaiden acerta SUPERMAN em Kung Lao" + p4.supreman() + "\n"
                                        + "\nRaiden:" + luta8.getPersonagem1().getVida() + "\n"
                                        + "\nKung Lao" + luta8.getPersonagem2().getVida() + "\n");

                                luta1.acertacombo2("p1");
                                JOptionPane.showMessageDialog(null, "\n Cenário:" + luta8.getCenario() + "\n"
                                        + "\nRaiden acerta combo em Kung Lao" + p4.combo2() + "\n"
                                        + "\nRaiden:" + luta8.getPersonagem1().getVida() + "\n"
                                        + "\nKung Lao" + luta8.getPersonagem2().getVida() + "\n");

                                luta1.acertacombo2("p2");
                                JOptionPane.showMessageDialog(null, "\n Cenário:" + luta8.getCenario() + "\n"
                                        + "\nKung Laou acerta combo em Raiden" + p6.combo2() + "\n"
                                        + "\nRaiden:" + luta8.getPersonagem1().getVida() + "\n"
                                        + "\nKung Lao" + luta8.getPersonagem2().getVida() + "\n");
                                break;
                            }

                            case 3: {
                                JOptionPane.showMessageDialog(null, "Adeus");
                                break;

                            }
                            default: {
                                JOptionPane.showMessageDialog(null, "Opção inválida");
                                break;
                            }
                        }
                    }

                }
                break;

            }

        }

    }

}
