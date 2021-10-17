package entities;

public class EmpregadoTerceirizado extends Empregado {

    private Double cobrancaAdicional;

    public EmpregadoTerceirizado(String nome, Integer horas, Double valorPorHora, Double cobrancaAdicional) {
        super(nome, horas, valorPorHora);
        this.cobrancaAdicional = cobrancaAdicional;
    }

    public Double getCobrancaAdicional() {
        return cobrancaAdicional;
    }

    public void setCobrancaAdicional(Double cobrancaAdicional) {
        this.cobrancaAdicional = cobrancaAdicional;
    }

    @Override
    public Double pagamento() {
        return super.pagamento() + 1.1 * this.cobrancaAdicional;
    }

}
