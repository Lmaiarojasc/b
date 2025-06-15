public class FabricaAsus extends FabricaComputadores {
    public Procesador crearProcesador() { return new ProcesadorIntel(); }
    public MemoriaRAM crearRAM() { return new MemoriaCorsair(); }
    public DiscoDuro crearDisco() { return new DiscoSSD(); }
    public TarjetaGrafica crearGrafica() { return new GraficaNVIDIA(); }

    public Computador crearComputador(Procesador p, MemoriaRAM r, DiscoDuro d, TarjetaGrafica g) {
        return new Asus(p, r, d, g);
    }
}
