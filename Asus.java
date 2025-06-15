public class Asus extends Computador {
    Asus(Procesador p, MemoriaRAM r, DiscoDuro d, TarjetaGrafica g) {
        super(p, r, d, g);
        System.out.println("Acoplado el Disco duro.");
    }

    public void ensamblar() {
        System.out.println("Montando Asus");
        getProcesador().operar();
        getRAM().cargar();
        getDisco().leer();
        getGrafica().procesar();
    }
}
