package org.example.pojo;

import java.util.ArrayList;
import java.util.List;

//Public = Tout le monde peut instancier l'objet
//Class = modèle d'objet : Objet (Garage)
public class Garage {

    //Attributs : Propriétés de l'objet
    //Attributs d'un objet sont des objets : Integer et non int
    //Propriétés de mon garage :

    /**
     * Encapsulation :
     * private : seule la classe courante a accès à l'info
     * public : tout le monde a accès à l'info
     * protected : seules les classes filles et la classe courante ont accès à l'info
     */
    private String nom;
    private String adresse;
    private Integer nombreDePlace;
    private List<Voiture> voitureList;


    //Alt + INSER pour creer rapidement un constructeur

    //Constructeur : permet de dire : comment construire le garage ?
    //Créé un objet à partir d'un modèle
    public Garage (){
        //constructeur par defaut
    }


    //Constructeur (public Garage) alimente les attributs (nom, adresse etc)
    // de l'objet (class Garage)
    public Garage (String nom, String adresse, Integer nombreDePlace){
        //this.variable fait reference à l'attribut de "class", portant ce nom
        this.nom = nom;
        this.adresse = adresse;
        this.nombreDePlace = nombreDePlace;
        voitureList = new ArrayList<>();

    }

    /**
     *Polymorphisme : redefinir des méthodes deja existantes
     */
    public String toString() {
        return "Garage : " + nom + " | adresse : " + adresse + " | nombre de place : "
                + nombreDePlace;
    }



    //getter et setter
    // accesseur et mutateur
    //recupère une donnée private | get : recupère et set : modifie
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public Integer getNombreDePlace() {
        return nombreDePlace;
    }

    public void setNombreDePlace(Integer nombreDePlace) {
        this.nombreDePlace = nombreDePlace;
    }

    public List<Voiture> getVoitureList() {
        return voitureList;
    }

    public void setVoitureList(List<Voiture> voitureList) {
        this.voitureList = voitureList;
    }
}
