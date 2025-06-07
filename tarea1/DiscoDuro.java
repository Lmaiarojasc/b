public class DiscoDuro {
    int capacidad;
    String tipo;
    int rpm;
    String marca;

    DiscoDuro(int capacidad, String tipo, int rpm, String marca) {
        this.capacidad = capacidad;
        this.tipo = tipo;
        this.rpm = rpm;
        this.marca = marca;
    }

    public void girar() {
        System.out.println("Disco girando a rpm");
    }

    public void guardarDatos() {
        System.out.println("Guardando datos en disco...");
    }

    public void formatear() {
        System.out.println("Formateando disco duro");
    }

    public void mostrarInfo() {
        System.out.println("Disco completo");
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setRpm(int rpm) {
        this.rpm = rpm;
    }

    public int getRpm() {
        return rpm;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }
}