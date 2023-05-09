package alumnado;

public class Alumno {
    protected String nombre;
    protected String apellido;
    protected int edad;
    protected int id;
    private static int _id = 1;

    public Alumno() throws AlumnoException{
        throw new AlumnoException();
    }

    public Alumno(String nombre, String apellido, int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.id = _id++;
    }

    public int getId(){
        return id;
    }
    public static int getSiguienteId(){
        return _id;
    }

    public String getNombre(){
        return nombre;
    } 
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getApellido(){
        return apellido;
    }

    public void setApellido(String apellido){
        this.apellido = apellido;
    }

    public int getEdad(){
        return edad;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    @Override
    public String toString(){
        String resultado = "";
        return resultado += "(" + this.id + ") " + this.nombre + " " + this.apellido + " (" + this.edad + ")";
    }

}