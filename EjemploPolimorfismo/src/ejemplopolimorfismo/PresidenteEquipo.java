/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplopolimorfismo;

/**
 *
 * @author reroes
 */
public class PresidenteEquipo extends PersonaEquipo{

    public PresidenteEquipo(int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
    }
    
    @Override
    public void entrenamiento(){
        System.out.printf("%d %s %s Presidente: supervisa a los futbolistas y al entrenador",super.getId(),super.getNombre(),super.getApellidos()); 
    }
}
