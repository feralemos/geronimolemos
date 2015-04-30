package televisao;

import javax.swing.JOptionPane;

public class Televisao {

    public static void main(String[] args) {
        Ator a = new Ator();
        int opcao = 0;

        while (opcao != 5) {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("SELECIONE A OPERAÇÃO DESEJADA: \n"
                    + "1 - Atividade ATOR\n"
                    + "2 - Atividade NOVELA\n"
                    + "3 - Atividade EMISSORA\n"
                    + "4 - Atividade APRESENTADOR\n"
                    + "5 - SAIR"));
            switch (opcao) {
                case 1: {

                    a.setNome(JOptionPane.showInputDialog("Informe o seu nome:"));
                    a.setNomeartistico(JOptionPane.showInputDialog("Informe o seu nome artístico:"));
                    a.setDatadenascimento(JOptionPane.showInputDialog("Informe a sua data de nascimento:"));
                    a.setEmail(JOptionPane.showInputDialog("Informe o seu e-mail:"));
                    a.setNumeronovelas(Integer.parseInt(JOptionPane.showInputDialog("Informe o número de novelas trabalhadas")));
                    a.setSalariomensal(Double.parseDouble(JOptionPane.showInputDialog("Informe o seu salário mensal:")));
                    a.setNumeveneto(Integer.parseInt(JOptionPane.showInputDialog("Informe o número de eventos particpados este mês:")));
                    a.setCacheevento(Double.parseDouble(JOptionPane.showInputDialog("Informe o cache recebido por evento")));

                    JOptionPane.showMessageDialog(null, "Nome :" + a.getNome() + "\n Nome Artístico :" + a.getNomeartistico()
                            + "\n Data de nascimento :" + a.getDatadenascimento() + "\n E-mail :" + a.getEmail() + "\nNúmero de trabalhos em novelas :" + a.getNumeronovelas()
                            + "\n Status :" + a.statusator() + "\nGanho total no mês :" + a.calcularganhos());
                    break;
                }

                case 2: {
                    a.setNome(JOptionPane.showInputDialog("Informe o nome da novela"));
                    a.setTelespectadores(Integer.parseInt(JOptionPane.showInputDialog("Informe o número de telespectadores que assistiram a novela")));
                    a.setOpcao(JOptionPane.showInputDialog("De acordo com o conteúdo da novela, escolha a opção que se aplica melhor ao programa:"
                            + "\n 1- Violência(NÃO) - Sexo (NÃO) - Drogas (NÃO) \n 2- Violência (SIM) - Sexo (NÃO) - Drogas (NÃO)"
                            + "\n 3- Violência (SIM) - Sexo(SIM/NÃO) - Drogas (SIM) \n 4- Violência (SIM) - Sexo (SIM) - Drogas (SIM)"));

                    JOptionPane.showMessageDialog(null, "Nome do programa:" + a.getNome() + "\nA classificação do programa é :" + a.novela() + "\n Pontos do IBOPE:" + a.audiencia());
                    break;

                }

                case 3: {
                    a.setEmissoranome(JOptionPane.showInputDialog("Informe o nome da emissora"));
                    a.setEmissoraendereco(JOptionPane.showInputDialog("Informe o endereço da emissora"));
                    String abertafechada = JOptionPane.showInputDialog("Aberta ou fechada(SIM/NÃO)");

                    if (abertafechada.equals("SIM")) {
                        a.setAberta(true);
                    } else {
                        a.setAberta(false);
                    }

                    String exibe;
                    if (a.isAberta() == true) {
                        exibe = "ABERTA";
                    } else {
                        exibe = "FECHADA";
                    }

                    JOptionPane.showMessageDialog(null, "Dados da emissora: \n"
                            + "Nome:" + a.getEmissoranome() + "\n"
                            + "Endereço:" + a.getEmissoraendereco() + "\n"
                            + "Aberta ou fechada:" + exibe);
                    break;
                }

                case 4: {
                    a.setSalariomensal(Double.parseDouble(JOptionPane.showInputDialog("Informe o seu salário mensal:")));
                    a.setNumeveneto(Integer.parseInt(JOptionPane.showInputDialog("Informe o número de eventos particpados este mês:")));
                    a.setCacheevento(Double.parseDouble(JOptionPane.showInputDialog("Informe o cache recebido por evento")));
                    a.setNumeromerchant(Integer.parseInt(JOptionPane.showInputDialog("Informe o número de trabalhos publicitário feitos")));
                    a.setValormerchant(Double.parseDouble(JOptionPane.showInputDialog("Informe o valor cobrado pelos eventos publicitário")));

                    JOptionPane.showMessageDialog(null, "O salário total do apresentador é:" + a.apresentador());
                    break;
                }
                
                case 5:{
                    JOptionPane.showMessageDialog(null,"Até mais ver");
                    break;
                }
                
                default:{
                    JOptionPane.showMessageDialog(null,"Opção inválida!!!");
                    
                }
            }

        }
    }
}
