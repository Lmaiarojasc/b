public class MemoriaRAM {
    int capacidad;
    int velocidad;
    String tipo;
    String fabricante;

    MemoriaRAM(int capacidad, int velocidad, String tipo, String fabricante) {
        this.capacidad = capacidad;
        this.velocidad = velocidad;
        this.tipo = tipo;
        this.fabricante = fabricante;
    }

    public void cargar() {
        System.out.println("Cargando datos en RAM");
    }

    public void limpiar() {
        System.out.println("Limpiando memoria RAM");
    }

    public void diagnosticar() {
        System.out.println("Diagnóstico de RAM completado");
    }

    public void mostrarInfo() {
        System.out.println("Proceso Completo");
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getFabricante() {
        return fabricante;
    }
}