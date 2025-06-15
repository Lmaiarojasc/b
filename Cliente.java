import java.util.Scanner;

public class Cliente {
    public static void main(String args[]) {
        Computador pc;
        Ensamblador vendedor = new Ensamblador();
        Scanner lectura = new Scanner(System.in);
        System.out.println("Seleccione fabricante: 1. HP, 2. Lenovo, 3. Asus");
        int opcion = lectura.nextInt();

        if(opcion == 1) {
            pc = vendedor.comprarComputador(new FabricaHP());
        } else if(opcion == 2) {
            pc = vendedor.comprarComputador(new FabricaLenovo());
        } else {
            pc = vendedor.comprarComputador(new FabricaAsus());
        }

        pc.ensamblar();
    }
}
