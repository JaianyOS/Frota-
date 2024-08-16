public class Motor {
    private int potencia;
    private String tipo;

    public Motor(int potencia, String tipo) {
        this.potencia = potencia;
        this.tipo = tipo;
    }

    public int getPotencia() {
        return potencia;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "Motor [Potência: " + potencia + "cv, Tipo: " + tipo + "]";
    }
}
