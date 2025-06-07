public class Mascota{
       int numeroespecie;
       int edad;
       int porcentajesalud;
       String tamano;
       Mascota(int nombre, int numeroespecie, int edad, int porcentajesalud, string tamano){
              this.nombre=nombre;
              this.numeroespecie=numeroespecie;
              this.edad=edad;
              this.porcentajesalud=porcentajesalud;
              this.tamano=tamano;    
     }
      public void alimentar(){
             System.out.println("LA MASCOTA DEBE SER ALIMENTADA")
      }  
      public void jugar(){
             System.out.println("SE DEBE JUGAR TODOS LOS DIAS")
      }
      public void  setVender(Vende Vender);{
                   this.vender=vender;
      }
      public int getTamanio(){
             return tamanio;
      }
      public int getNombre(){
             return nombre;
      }
      public int getNumeroespecie(){
             return especie;
      }
      public int getPorcentajesalud(){
             return salud;
      }

}