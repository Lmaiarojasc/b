public abstract class FabricaComputadores {
    public abstract Procesador crearProcesador();
    public abstract MemoriaRAM crearRAM();
    public abstract DiscoDuro crearDisco();
    public abstract TarjetaGrafica crearGrafica();
    public abstract Computador crearComputador(Procesador p, MemoriaRAM r, DiscoDuro d, TarjetaGrafica g);
}
