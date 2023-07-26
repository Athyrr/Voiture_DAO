package org.example;


import org.example.dao.MotorisationDao;
import org.example.dao.impl.MotorisationDaoImpl;
import org.example.exception.InvalidPlaceGarageException;
import org.example.pojo.Garage;
import org.example.pojo.Hangar;
import org.example.pojo.Motorisation;
import org.example.pojo.TypeCarburant;


import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main( String[] args ) throws InvalidPlaceGarageException {
        System.out.println("");

        MotorisationDao motorisationDao = new MotorisationDaoImpl();
        //Création d'un moteur
        motorisationDao.saveMotorisation(new Motorisation(TypeCarburant.Diesel,150));
        motorisationDao.saveMotorisation(new Motorisation(TypeCarburant.Essence,90));


        //Récuperation des moteurs
        System.out.println(motorisationDao.getAllMotorisation());

        //Suppréssion des moteurs diesel
        motorisationDao.deleteMotorisationByCarburant(TypeCarburant.Diesel);

        //Récuperation des moteur
        System.out.println(motorisationDao.getAllMotorisation());


        //monGarage est une instance de Garage
        //monGarage est une version de Garage créée à partir d'une class
        Garage monGarage = createGarage();
        System.out.println(monGarage);

        Garage monHangar = new Hangar("Hangar","rue du prince",5);
        System.out.println(monHangar);

    }

    public static Garage createGarage () throws InvalidPlaceGarageException{
        Scanner scan = new Scanner(System.in);

        System.out.print("Entrez le nom d'un garage : ");
        String nomGarage = scan.nextLine();

        System.out.print("Entrez une adresse : ");
        String adresseGarage = scan.nextLine();

        int nbPlaceGarage = 0;
        boolean verif = false;

        while (!verif){ //!verif == true | verif == false
            try {
                System.out.print("Entrez le nombre de place : ");
                nbPlaceGarage = scan.nextInt();

                if (nbPlaceGarage<=0){
                    throw new InvalidPlaceGarageException(" Must have more than 0 places");
                }

                verif = true;

            }catch (InputMismatchException exception){
                System.out.println("Erreur de syntaxe");
                scan.next(); //nettoie le cache car bug

            }
        }
        return new Garage(nomGarage,adresseGarage,nbPlaceGarage);
    }



}
