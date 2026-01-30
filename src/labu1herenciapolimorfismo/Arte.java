/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labu1herenciapolimorfismo;

/**
 *
 * @author adria
 */
public class Arte extends Media {

    private double costo;

    public Arte(String creator, String title, double costo) {
        super(title, creator);
        this.costo = costo;
    } 

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    @Override
    public void play() {
        System.out.println("Reading " + getTitle() + " by " + getCreator() + " with " + getCosto() + " costo: %.2f%n");
    }

}
