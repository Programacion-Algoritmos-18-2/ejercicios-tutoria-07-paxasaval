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
public class RelacionadorPublico extends PersonaEquipo {

    public RelacionadorPublico(int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
    }
    
    @Override
    public void entrenamiento(){
        System.out.printf("%d %s %s Relacionador Publico (da a conocer el entrenamiento",super.getId(),super.getNombre(),super.getApellidos());
    }
}
