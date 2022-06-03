/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase02clientellc;

/**
 *
 * @author joseriveratencio
 */
public class Profesor extends Persona {

    private String IdProfesor;
    
    private String departamento;


    public Profesor (String nombre, String apellidos, int edad, String 
            IdProfesor) {

        super(nombre, apellidos, edad);

        this.IdProfesor = IdProfesor;   
    } //Cierre del constructor

    //Métodos específicos de la subclase

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    

    public void setIdProfesor (String IdProfesor) { this.IdProfesor = IdProfesor;   }

    public String getIdProfesor () { return IdProfesor;   }

    public void mostrarNombreApellidosYCarnet() {

        // nombre = "Paco"; Si tratáramos de acceder directamente a un campo privado de la superclase, salta un error

        // Sí podemos acceder a variables de instancia a través de los métodos de acceso públicos de la superclase

        System.out.println ("Profesor de nombre: " + super.getNombre() + " " +  super.getApellidos() +

         " con Id de profesor: " + this.IdProfesor ); 
    }
    
    @Override
    public void doSomething () { System.out.println("Soy Profesor");   }
    
    public void getDoSomethingPersona(){
        super.doSomething();
    }

} 
