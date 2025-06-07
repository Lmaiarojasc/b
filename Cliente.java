public astrac class Cliente{
       int cedula;
       int telefono;
       String saldo;
       String tamano
       Cliente(int cedula, int telefono, string saldo,){
              this.nombre=nombre;
              this.cedula=cedula;
              this.telefono=telefono;
              this.saldo=saldo; 
       }
       public void compra(){
              System.out.println("COMPRE UN CACHORRO")
       } 
       public void recomendar(){
              System.out.println("ES EL MEJOR LUGAR")
       }
       public abstract void recomendar();
       public int getSaldo(){
             return saldo;
       }
       public int getNombre(){
             return nombre;
       }
       public int getCedula(){
             return cedula;
       }

}