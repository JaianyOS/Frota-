public class Moto extends Veiculo {
    private String tipoDeGuidao;
    private Motor motor;

    public Moto(String marca, String modelo, int ano, String tipoDeGuidao, Motor motor) {
        super(marca, modelo, ano);
        this.tipoDeGuidao = tipoDeGuidao;
        this.motor = motor;
    }

    public String getTipoDeGuidao() {
        return tipoDeGuidao;
    }

    @Override
    public String toString() {
        return super.toString() + ", Tipo de Guidão: " + tipoDeGuidao + ", " + motor.toString();
    }
}
