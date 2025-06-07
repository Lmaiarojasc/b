public abstrac class SerVivo{
       int edad;
       String nombre;
       String reino;
       String nombreCientifico;
       SerVivo(int edad,String nombre, String reino, String nombreCientifico){
              this.edad=edad;
              this.nombre=nombre;
              this.reino=reino
              this.nombreCientifico=nombreCientifico;
       }
       public void cumplirAnos(){
             edad=edad+1;
       }
       public abstract void comunicar();
       public String getNombre()
}