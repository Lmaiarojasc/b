public class FabricaHP extends FabricaComputadores {
    public Procesador crearProcesador() { return new ProcesadorIntel(); }
    public MemoriaRAM crearRAM() { return new MemoriaKingston(); }
    public DiscoDuro crearDisco() { return new DiscoSSD(); }
    public TarjetaGrafica crearGrafica() { return new GraficaNVIDIA(); }

    public Computador crearComputador(Procesador p, MemoriaRAM r, DiscoDuro d, TarjetaGrafica g) {
        return new HP(p, r, d, g);
    }
}
