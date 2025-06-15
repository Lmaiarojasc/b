public class Lenovo extends Computador {
    Lenovo(Procesador p, MemoriaRAM r, DiscoDuro d, TarjetaGrafica g) {
        super(p, r, d, g);
        System.out.println("Lenovo renovado.");
    }

    public void ensamblar() {
        System.out.println("Lenovo Armado");
        getProcesador().operar();
        getRAM().cargar();
        getDisco().leer();
        getGrafica().procesar();
    }
}
