package org.example.pojo;


public class Voiture {


    Modele modele;
    Motorisation motorisation;
    Integer nombrePorte;
    String immatriculation;

    public Voiture(Modele modele, Motorisation motorisation,
                   Integer nombrePorte, String immatriculation) {
        this.modele = modele;
        this.motorisation = motorisation;
        this.nombrePorte = nombrePorte;
        this.immatriculation = immatriculation;
    }


}
