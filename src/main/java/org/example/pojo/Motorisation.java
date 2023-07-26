package org.example.pojo;

public class Motorisation {
    TypeCarburant typeCarburant;
    Integer nombreChevaux;

    public Motorisation(TypeCarburant typeCarburant, Integer nombreChevaux){
        this.typeCarburant = typeCarburant;
        this.nombreChevaux= nombreChevaux;
    }


    public TypeCarburant getTypeCarburant() {
        return typeCarburant;
    }

    public void setTypeCarburant(TypeCarburant typeCarburant) {
        this.typeCarburant = typeCarburant;
    }

    public Integer getNombreChevaux() {
        return nombreChevaux;
    }

    public void setNombreChevaux(Integer nombreChevaux) {
        this.nombreChevaux = nombreChevaux;
    }

    @Override
    public String toString() {
        return "Motorisation{" +
                "typeCarburant=" + typeCarburant +
                ", nombreChevaux=" + nombreChevaux +
                '}';
    }


}
