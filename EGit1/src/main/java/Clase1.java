
public class Clase1 {
    private String mensaje;
    private Clase3 clase3=new Clase3(5,6);
    public void setMensaje(String mensaje){
        this.mensaje=mensaje;
    }
    public String getMensaje(){
        return this.mensaje+clase3.suma();
    }
}
