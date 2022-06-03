/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase02clientellc;

/**
 *
 * @author joseriveratencio
 */
public class Administrativo extends Profesor {
    private String sector;
    
    public Administrativo(String nombre, String apellidos, int edad, String 
            IdProfesor, String sector){
        super(nombre, apellidos, edad, IdProfesor);
        this.sector = sector;
    }
    
    @Override
    public void doSomething () { System.out.println("Soy Administrativo");   }
    
}
