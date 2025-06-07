public class HumanoPensante{
       private int edad;
       String nombre;
       char sexo;
       int energia;
       HumanoPensante(int edad, String nombre, char sexo, int energia){
             this.edad=edad;
             this.nombre=nombre;
             this.sexo=sexo;
             this.energia=energia;
       }
       public void envejecer(){
              edad=edad+1;
              System.out.println(Envejeci 1 año mi nueva edad es:"+edad)
       }
       public void perderEnergia(){
              energia=energia-1;
       }
       public void comer(){
              energia=energia+10;
              System.out.println("Estoy en el metodo comer normal");
       }
       public void comer(int cantidadNueva){
              enerigia=energia+cantidadNueva
               System.out.println("Estoy en el metodo comer sobrecargado");
       }
       public void setNombre(String nombre){
              this.nombre=nombre;
       }
       public String getNombre(){
              return nombre;
       }
}