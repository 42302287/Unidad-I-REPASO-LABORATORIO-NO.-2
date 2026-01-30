/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labu1herenciapolimorfismo;

import java.util.ArrayList;

/**
 *
 * @author alopezorozco
 */
public class MediaLibrary {

    // TODO 20: Agrega aquí un campo de tipo ArrayList
    private ArrayList<Media> medios;
    // El nombre del campo será de tipo Media
    // Código a escribir: private ArrayList<Media> medios;
    // Importa el paquete java.util.ArrayList;

    // TODO 21: Escribe el constructor de la clase e inicializa
    public MediaLibrary() {
        this.medios = medios;
        medios = new ArrayList<>();
    }
    // el ArrayList creado anteriormente
    // Escribe este código en el constructor: medios = new ArrayList<>();
    // Nota: el constructor no recibe parámetros

    // TODO 22: Ahora crea un método que se llame addLibrary
    public void addLibrary(Media mediaItem) {
        medios.add(mediaItem);
    }
    // Este método añadira elementos a la librería MediaLibrary
    // el método es de tipo void
    // recibe un parámetro de tipo Media
    // el nombre del parámetro es mediaItem
    // para adicionar elementos al ArrayList escribe
    // el nombre del campo de tipo arraylist y usa el método add
    // código dentro del método: medios.add(mediaItem);

    public void playAllItems() {
        if (medios.isEmpty()) {
            System.out.println("No hay medios en la lista");
        } else {
            for (Media media : medios) {
                media.play();
            }
        }
    }
    // TODO 23: Ahora crearemos un método que nos permita
    // poner en play o reproducción todos nuestros elementos
    // declara un método de tipo void que se llame playAllItems
    // Este método no recibe parámetros
    // Pondremos primero un condicional para saber si
    // nuestra colección tiene elementos
    // si los tiene entonces los recorre con un foreach y llama al método play
    // Escribe el siguietne código dentro del método
    /* 
       if (medios.isEmpty()){
         System.out.println("No hay medios en la lista");
       }else{
         for(Media media : medios){
             media.play();
         }    
       }
     */

}
