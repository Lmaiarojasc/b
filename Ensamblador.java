public class Ensamblador {
    public Computador comprarComputador(FabricaComputadores fabrica) {
        return fabrica.crearComputador(
            fabrica.crearProcesador(),
            fabrica.crearRAM(),
            fabrica.crearDisco(),
            fabrica.crearGrafica()
        );
    }
}
