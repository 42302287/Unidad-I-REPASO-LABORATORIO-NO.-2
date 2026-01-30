/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labu1herenciapolimorfismo;

/**
 *
 * @author alopezorozco
 */
public class Media {

    // TODO 1: Crea los campos titulo y autor de tipo String
    // y privados
    private String title;
    private String creator;

    // TODO 3: Crea el constructor para inicializar los campos
    public Media(String title, String creator) {
        this.title = title;
        this.creator = creator;
    }

    //getters and setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCreator() {
        return creator;
    }

    public void setcreator(String creator) {
        this.creator = creator;
    }
    // utiliza los métodos setter para establecer sus valores.
    // Recuerda poner este constructor después de la declaración de los campos
    // TODO 4: Crea un método llamado play(), público de tipo void
    public void play() {
        System.out.println("Playing: " + title + " by " + creator);
    }
    // este método tiene la siguiente instrucción.
    // System.out.println("Playing: " + title + " by " + creator);  
}
