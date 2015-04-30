package caixa.eletronico;

public class Conta {

    private String agencia;
    private String numeroconta;
    private String nomecorrentista;
    private Double saldo;
    private Boolean ativa;
    
    public String getagencia(){
        return this.agencia;
    }
    
    public String getmumeroconta(){
        return this.numeroconta;
    }
    
    public String getnomecorrentista(){
        return this.nomecorrentista;
    }
    public Double getsaldo(){
        return this.saldo;
    }
    
    public void setagencia(String agencia){
        this.agencia = agencia;
    }
    public void setnumeroconya(String vnumeroconta){
        this.numeroconta = vnumeroconta;
    }
    
    public void setnomecorrentista(String venomecorrentista){
        this.nomecorrentista = venomecorrentista;
    }
    
    public Conta(){
        agencia = null;
        numeroconta = null;
        nomecorrentista = null;
        saldo = null;
        ativa = false;
    }

    public void abrir(String vnome, String vagencia, String vnumero) {
        agencia = vagencia;
        numeroconta = vnumero;
        nomecorrentista = vnome;
        saldo = 0.0;
        ativa = true;
    }

    public Boolean saque(Double valortransacao) {
        if (ativa == true && saldo >= valortransacao) {
            saldo = saldo - valortransacao;
            return true;
        } else {
            return false;
        }
    }

    public Boolean deposito(Double valor) {
        if (ativa == true) {
            saldo = saldo + valor;
            return true;
        } else {
            return false;
        }
    }

    public Boolean fecharconta() {
        Boolean fechar;
        if (saldo == 0) {
            ativa = false;
            fechar = true;
        } else {
            fechar = false;
            return fechar;
        }
        return fechar;

    }

    public Double retornar() {
        return saldo;
    }
}
