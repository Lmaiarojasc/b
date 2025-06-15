public class FabricaLenovo extends FabricaComputadores {
    public Procesador crearProcesador() { return new ProcesadorAMD(); }
    public MemoriaRAM crearRAM() { return new MemoriaCorsair(); }
    public DiscoDuro crearDisco() { return new DiscoHDD(); }
    public TarjetaGrafica crearGrafica() { return new GraficaAMD(); }

    public Computador crearComputador(Procesador p, MemoriaRAM r, DiscoDuro d, TarjetaGrafica g) {
        return new Lenovo(p, r, d, g);
    }
}
