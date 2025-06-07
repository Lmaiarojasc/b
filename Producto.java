public astrac class Producto{
       int nombre;
       int precio;
       int categoria;
       String stock;
       Producto(int nombre, int precio, int categoria, string stock){
              this.nombre=nombre;
              this.precio=precio;
              this.categoria=categoria;
              this.stock=stock; 
  }
       public void rebastecer(){
              System.out.println("NECESITO MAS")
       } 
       public void vender(){
              System.out.println("ESO MAS DINERO")
       }
       public abstract void cambiarprecio();
       public int getStock(){
             return stock;
       }
       public int getNombre(){
             return nombre;
       }
       public int getPrecio(){
             return precio;
       }
       public int getCategoria(){
             return categoria;
       }
}