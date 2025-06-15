public abstract class Computador {
    private Procesador procesador;
    private MemoriaRAM ram;
    private DiscoDuro disco;
    private TarjetaGrafica grafica;

    Computador(Procesador procesador, MemoriaRAM ram, DiscoDuro disco, TarjetaGrafica grafica) {
        this.procesador = procesador;
        this.ram = ram;
        this.disco = disco;
        this.grafica = grafica;
    }

    public abstract void ensamblar();

    public Procesador getProcesador() { return procesador; }
    public MemoriaRAM getRAM() { return ram; }
    public DiscoDuro getDisco() { return disco; }
    public TarjetaGrafica getGrafica() { return grafica; }
}
