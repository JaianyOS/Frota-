public class App {
    public static void main(String[] args) {
        Motor motorCarro = new Motor(200, "Gasolina");
        Carro carro = new Carro("Fiat", "Uno", 2020, 4, motorCarro);
        System.out.println(carro.toString());

        Motor motorMoto = new Motor(50, "Elétrico");
        Moto moto = new Moto("Harley-Davidson", "Street 750", 2021, "Esportivo", motorMoto);
        System.out.println(moto.toString());
    }
}
