public class Procesador {
    int velocidadGHz;
    int nucleos;
    String marca;
    String arquitectura;

    Procesador(int velocidadGHz, int nucleos, String marca, String arquitectura) {
        this.velocidadGHz = velocidadGHz;
        this.nucleos = nucleos;
        this.marca = marca;
        this.arquitectura = arquitectura;
    }

    public void arrancar() {
        System.out.println("Procesando informacion");
    }

    public void sobrecalentar() {
        System.out.println("¡Cuidado! El procesador se esta calentando");
    }

    public void ejecutarInstrucciones() {
        System.out.println("Procesador ejecutando instrucciones...");
    }

    public void mostrarInfo() {
        System.out.println("información procesada");
    }
 public void setVelocidadGHz(int velocidadGHz) {
        this.velocidadGHz = velocidadGHz;
    }

    public int getVelocidadGHz() {
        return velocidadGHz;
    }

    public void setNucleos(int nucleos) {
        this.nucleos = nucleos;
    }

    public int getNucleos() {
        return nucleos;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setArquitectura(String arquitectura) {
        this.arquitectura = arquitectura;
    }

    public String getArquitectura() {
        return arquitectura;
    }
}
