package caixa.eletronico;

import javax.swing.JOptionPane;

public class CaixaEletronico {

    public static void main(String[] args) {
        
        Conta c = new Conta();
        int opcao = 0;
       
     

        while (opcao != 7) {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("SELECIONE A OPERAÇÃO DESEJADA: \n"
                    + "1- Criar conta\n"
                    + "2 - DEPOSITO\n"
                    + "3 - SALDO\n"
                    + "4 - SAQUE\n"
                    + "5 - Retornar saldo \n"
                    + "6 - Fechar conta \n"
                    + "7 - Fechando o app \n"
                    + "8 - Resumo da conta"));

            switch (opcao) {
                case 1: {
                    String nome, agencia, numero;
                    nome = JOptionPane.showInputDialog("Nome do Correntista:");
                    agencia = JOptionPane.showInputDialog("Número da agência:");
                    numero = JOptionPane.showInputDialog("Número da conta:");

                    c.abrir(nome, agencia, numero);
                    JOptionPane.showMessageDialog(null, "Conta aberta com sucesso");

                    break;

                }
                case 2: {
                    Double valor = Double.parseDouble(JOptionPane.showInputDialog("RS depósito"));
                    Boolean ret = c.deposito(valor);
                    if (ret == true) {
                        JOptionPane.showMessageDialog(null, "Depósito OK ");
                    } else {
                        JOptionPane.showMessageDialog(null, "Não foi possível realizar o depósito");
                    }
                    break;

                }

                case 3: {
                    JOptionPane.showMessageDialog(null, "Você tem na sua conta.." + c.getsaldo());

                    break;
                }
                case 4: {
                    Double valor = Double.parseDouble(JOptionPane.showInputDialog("RS Saque"));
                    Boolean ret = c.saque(valor);
                    if (ret = true && c.saque(valor)) {
                        JOptionPane.showMessageDialog(null, "Saque OK e seu saldo é.." + c.getsaldo());
                    } else {
                        JOptionPane.showMessageDialog(null, "Não foi possível realizar o saque");
                    }
                    break;

                }

                case 5: {
                    JOptionPane.showMessageDialog(null, "O seu saldo atual é:" + c.getsaldo());
                    break;

                }

                case 6: {
                    Boolean fechou = c.fecharconta();
                    JOptionPane.showMessageDialog(null, "Sua conta foi encerrada com sucesso");

                    break;
                }

                case 7: {
                    JOptionPane.showMessageDialog(null, "Fechando o aplicativo");
                    break;

                }

                case 8: {
               //     Boolean ret2 = c.ativa;
                //    if (ret2 == true) {
                        JOptionPane.showMessageDialog(null, "O nome do correntista é:" + c.getnomecorrentista() + "\nO numero da conta é:" + c.getmumeroconta() + "\n O número da agência é:" + c.getagencia());
                        
                  //  } else {
                        //JOptionPane.showMessageDialog(null, "Você não possui uma conta");
                        break;

                    }

                

                default: {
                    JOptionPane.showMessageDialog(null, "Opção inválida");

                }
            }

        }

    }

}
