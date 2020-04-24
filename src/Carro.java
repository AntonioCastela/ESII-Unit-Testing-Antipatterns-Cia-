public class Carro {

    public String Marca;
    private String modelo;


    public Carro() {
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public double costChangeWheels(int rodas) {
        return rodas * 1.25;
    }


}