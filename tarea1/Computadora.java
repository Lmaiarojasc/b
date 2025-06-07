public class Computadora {
    int capacidadRAM;
    DiscoDuro disco;
    MemoriaRAM ram1;
    MemoriaRAM ram2;
    Procesador procesador;

    Computadora(int capacidadRAM, Procesador procesador, DiscoDuro disco) {
        this.capacidadRAM = capacidadRAM;
        this.procesador = procesador;
        this.disco = disco;
    }

    public void setMemorias(MemoriaRAM ram1, MemoriaRAM ram2) {
        this.ram1 = ram1;
        this.ram2 = ram2;
    }

    public void encender() {
        procesador.arrancar();
        disco.girar();
        ram1.cargar();
        ram2.cargar();
    }

    public void apagar() {
        System.out.println("Apagando computadora...");
    }

    public void mostrarEstado() {
        System.out.println("Computadora HP de 8GB de RAM y procesador");
    }

    public void ejecutarPrograma(String programa) {
        System.out.println("Ejecutando");
    }
    public void setCapacidadRAM(int capacidadRAM) {
        this.capacidadRAM = capacidadRAM;
    }

    public int getCapacidadRAM() {
        return capacidadRAM;
    }

    public void setDisco(DiscoDuro disco) {
        this.disco = disco;
    }

    public DiscoDuro getDisco() {
        return disco;
    }

    public void setProcesador(Procesador procesador) {
        this.procesador = procesador;
    }

    public Procesador getProcesador() {
        return procesador;
    }
}
