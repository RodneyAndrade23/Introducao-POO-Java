class Carro {

    String cor;
    String modelo;
    int CapacidadeTanque;

    Carro(){

    }
    Carro(String cor, String modelo, int CapacidadeTanque){
        this.cor = cor;
        this.modelo = modelo;
        this.CapacidadeTanque = CapacidadeTanque;
    }

    void setCor(String cor) {
        this.cor = cor;
    }

    String getCor() {
        return cor;
    }

    void setModelo(String modelo) {
        this.modelo = modelo;
    }

    String getModelo() {
        return modelo;
    }

    void setCapacidadeTanque(int capacidadeTanque) {
        this.CapacidadeTanque = capacidadeTanque;
    }

    int getCapacidadeTanque() {
        return CapacidadeTanque;
    }

    double totalValorTanque(double valorCombustivel) {
        return CapacidadeTanque * valorCombustivel;
    }
}