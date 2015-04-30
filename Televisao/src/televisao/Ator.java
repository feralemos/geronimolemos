package televisao;

public class Ator {

    private String nome;
    private String datadenascimento;
    private Integer numeronovelas;
    private String email;
    private Double salariomensal;
    private Double cacheevento;
    private String nomeartistico;
    private String cidade;
    private String endereco;
    private String bairro;
    private String estado;
    private Integer numeveneto;
    private Double ganhototal;
    private String opcao;
    private Integer telespectadores;
    private Integer pontoibope;
    private String emissoranome;
    private String emissoraendereco;
    private Boolean aberta;
    private Integer numeromerchant;
    private Double valormerchant;

    public Integer getNumeromerchant() {
        return numeromerchant;
    }

    public void setNumeromerchant(Integer numeromerchant) {
        this.numeromerchant = numeromerchant;
    }

    public Double getValormerchant() {
        return valormerchant;
    }

    public void setValormerchant(Double valormerchant) {
        this.valormerchant = valormerchant;
    }

    public String getEmissoranome() {
        return emissoranome;
    }

    public void setEmissoranome(String emissoranome) {
        this.emissoranome = emissoranome;
    }

    public String getEmissoraendereco() {
        return emissoraendereco;
    }

    public void setEmissoraendereco(String emissoraendereco) {
        this.emissoraendereco = emissoraendereco;
    }

    public Boolean isAberta() {
        return aberta;
    }

    public void setAberta(Boolean aberta) {
        this.aberta = aberta;
    }

    public Integer getTelespectadores() {
        return telespectadores;
    }

    public void setTelespectadores(Integer telespectadores) {
        this.telespectadores = telespectadores;
    }

    public Integer getPontoibope() {
        return pontoibope;
    }

    public void setPontoibope(Integer pontoibope) {
        this.pontoibope = pontoibope;
    }

    public String getOpcao() {
        return opcao;
    }

    public void setOpcao(String opcao) {
        this.opcao = opcao;
    }

    public Integer getNumeveneto() {
        return numeveneto;
    }

    public void setNumeveneto(Integer numeveneto) {
        this.numeveneto = numeveneto;
    }

    public Double getGanhototal() {
        return ganhototal;
    }

    public void setGanhototal(Double ganhototal) {
        this.ganhototal = ganhototal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDatadenascimento() {
        return datadenascimento;
    }

    public void setDatadenascimento(String datadenascimento) {
        this.datadenascimento = datadenascimento;
    }

    public Integer getNumeronovelas() {
        return numeronovelas;
    }

    public void setNumeronovelas(Integer numeronovelas) {
        this.numeronovelas = numeronovelas;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getSalariomensal() {
        return salariomensal;
    }

    public void setSalariomensal(Double salariomensal) {
        this.salariomensal = salariomensal;
    }

    public Double getCacheevento() {
        return cacheevento;
    }

    public void setCacheevento(Double cacheevento) {
        this.cacheevento = cacheevento;
    }

    public String getNomeartistico() {
        return nomeartistico;
    }

    public void setNomeartistico(String nomeartistico) {
        this.nomeartistico = nomeartistico;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    Ator() {
        this.nome = null;
        this.datadenascimento = null;
        this.numeronovelas = 0;
        this.email = null;
        this.salariomensal = 0.0;
        this.cacheevento = 0.0;
        this.nomeartistico = null;
        this.cidade = null;
        this.endereco = null;
        this.bairro = null;
        this.estado = null;
        this.numeveneto = 0;
        this.ganhototal = 0.0;
        this.opcao = null;
        this.emissoranome = null;
        this.emissoraendereco = null;
        this.aberta = false;
        this.numeromerchant = 0;
        this.valormerchant = 0.0;

    }

    String statusator() {
        if (this.numeronovelas <= 3 && this.salariomensal <= 5000) {
            return "Calouro";
        } else if (this.numeronovelas <= 6) {
            return "Revelação";
        } else if (this.numeronovelas <= 6 && this.salariomensal > 30000) {
            return "Jóia";
        } else if (this.numeronovelas > 9 && this.salariomensal < 30000) {
            return "Elenco de Apoio";
        } else if (this.salariomensal >= 30000 && this.salariomensal <= 100000) {
            return "Estrela";
        } else {
            return "Elenco regular";
        }
    }

    Double calcularganhos() {
        this.ganhototal = this.salariomensal + (this.numeveneto * this.cacheevento);
        return ganhototal;

    }

    String novela() {
        if (this.opcao.equals("1")) {
            return "LIVRE";
        } else if (this.opcao.equals("2")) {
            return "14 ANOS";
        } else if (this.opcao.equals("3")) {
            return "16 ANOS";
        } else if (this.opcao.equals("4")) {
            return "18 ANOS";
        } else {
            return "OPÇÃO INVÁLIDA";
        }
    }

    Integer audiencia() {
        this.pontoibope = this.telespectadores / 1000;
        return pontoibope;

    }

    Double apresentador() {
        this.ganhototal = this.salariomensal + (this.numeveneto * this.cacheevento) + (this.numeromerchant * this.valormerchant);
        return ganhototal;
    }

}
