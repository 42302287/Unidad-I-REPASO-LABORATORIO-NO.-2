/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labu1herenciapolimorfismo;

/**
 *
 * @author alopezorozco
 */
// TODO 15: Haz que Music herede de Media
public class Music extends Media {

    private String genre;

    // TODO 18: Crea el constructor con los parámetros title, creator y genre
    public Music(String creator, String title, String genre) {
        super(title, creator);
        this.genre = genre;
    }

    // TODO 16: Crea un campo privado de tipo String llamado genre (género)
    // TODO 17: Crea los getter y setter para el campo anterior
    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    // pasa los parámetros a la superclase utilizando super
    // y asigna el valor del parámetro genre al campo correspondiente utilizando
    // su setter
    // TODO 19: Es tiempo de aplicar el polimorfismo
    // Sobreescribe el métod play() haciendo que imprima el siguiente
    // mensaje:
    // System.out.println("Listening to " + getTitle() + " by " + getCreator() + " in the " + genre +" genre.");
    @Override
    public void play() {
        System.out.println("Listening to " + getTitle() + " by " + getCreator() + " in the " + genre + " genre.");
    }
    // No olvides especificar la notación @Override
}
