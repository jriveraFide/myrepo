/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase02clientellc;

/**
 *
 * @author joseriveratencio
 */
public class Persona {

    private String nombre;

    private String apellidos;

    private int edad;

    //Constructor
    public Persona(){}
    
    public Persona (String nombre, String apellidos, int edad) {

        this.nombre = nombre;

        this.apellidos = apellidos;

        this.edad = edad;                   
    }

    //Métodos

    public String getNombre () { return nombre;  }

    public String getApellidos () { return apellidos;  }

    public int getEdad () { return edad;   }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void doSomething () { System.out.println("Soy Persona");   }

} 
