public class Carro extends Veiculo {
    private int numeroDePortas;
    private Motor motor;

    public Carro(String marca, String modelo, int ano, int numeroDePortas, Motor motor) {
        super(marca, modelo, ano);
        this.numeroDePortas = numeroDePortas;
        this.motor = motor;
    }

    public int getNumeroDePortas() {
        return numeroDePortas;
    }

    @Override
    public String toString() {
        return super.toString() + ", Número de Portas: " + numeroDePortas + ", " + motor.toString();
    }
}
