public class Principal {
    public static void main(String[] args) {
        Procesador p1 = new Procesador(3, 4, "Intel", "x86");
        Procesador p2 = new Procesador(4, 8, "AMD", "x64");
        Procesador p3 = new Procesador(2, 2, "Celeron", "x86");
        Procesador p4 = new Procesador(5, 16, "Ryzen", "ARM");
        DiscoDuro d1 = new DiscoDuro(500, "HDD", 7200, "Seagate");
        DiscoDuro d2 = new DiscoDuro(1000, "SSD", 0, "Kingston");
        DiscoDuro d3 = new DiscoDuro(2000, "HDD", 5400, "Western Digital");
        DiscoDuro d4 = new DiscoDuro(256, "NVMe", 0, "Samsung");
        MemoriaRAM r1a = new MemoriaRAM(8, 2666, "DDR4", "Corsair");
        MemoriaRAM r1b = new MemoriaRAM(8, 2666, "DDR4", "Corsair");
        MemoriaRAM r2a = new MemoriaRAM(4, 2133, "DDR3", "ADATA");
        MemoriaRAM r2b = new MemoriaRAM(4, 2133, "DDR3", "ADATA");
        MemoriaRAM r3a = new MemoriaRAM(16, 3200, "DDR5", "Kingston");
        MemoriaRAM r3b = new MemoriaRAM(16, 3200, "DDR5", "Kingston");
        MemoriaRAM r4a = new MemoriaRAM(2, 1600, "DDR3", "Samsung");
        MemoriaRAM r4b = new MemoriaRAM(2, 1600, "DDR3", "Samsung");
       
           Computadora c1 = new Computadora(16, p1, d1);
             c1.setMemorias(r1a, r1b);
           Computadora c2 = new Computadora(8, p2, d2);
             c2.setMemorias(r2a, r2b);
           Computadora c3 = new Computadora(32, p3, d3);
             c3.setMemorias(r3a, r3b);
           Computadora c4 = new Computadora(4, p4, d4);
             c4.setMemorias(r4a, r4b);
               
            System.out.println("Compu UNO");
             c1.mostrarEstado();
             c1.encender();
             c1.ejecutarPrograma("Word");
             c1.apagar();
               
            System.out.println("COMPU DOS");
             c2.mostrarEstado();
             c2.encender();
             c2.ejecutarPrograma("Excel");
             c2.apagar();

            System.out.println("COMPU TRES");
              c3.mostrarEstado();
              c3.encender();
              c3.ejecutarPrograma("Photoshop");
              c3.apagar();

            System.out.println("COMPU CUATRO");
              c4.mostrarEstado();
              c4.encender();
              c4.ejecutarPrograma("Minecraft");
              c4.apagar();
    }
}