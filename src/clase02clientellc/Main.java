/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase02clientellc;

/**
 *
 * @author joseriveratencio
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
             
//        Profesor profesor1 = new Profesor ("Juan", "Hernández García", 33, 
//                "ABCD");
//
//        profesor1.setDepartamento("Biologia");
//
//        profesor1.mostrarNombreApellidosYCarnet();
//        
//        profesor1.doSomething();
//        
//        profesor1.getDoSomethingPersona();
        Administrativo admin1 = new Administrativo("Juan", "Hernández García", 33, 
             "ABCD", "RH");
        
        admin1.doSomething();
        
        //admin1.mostrarNombreApellidosYCarnet();
       System.out.println(admin1.getNombre());
    }
}
