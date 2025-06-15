public class HP extends Computador {
    HP(Procesador p, MemoriaRAM r, DiscoDuro d, TarjetaGrafica g) {
        super(p, r, d, g);
        System.out.println("Se ensambló un HP correctamente.");
    }

    public void ensamblar() {
        System.out.println("Ensamblando HP...");
        getProcesador().operar();
        getRAM().cargar();
        getDisco().leer();
        getGrafica().procesar();
    }
}
