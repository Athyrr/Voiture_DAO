package org.example.dao;

import org.example.pojo.Motorisation;
import org.example.pojo.TypeCarburant;

import java.util.List;

public interface MotorisationDao {

    List<Motorisation> getAllMotorisation();

    List<Motorisation> getAllMotorisationByCarburant(TypeCarburant carburant);

    void saveMotorisation(Motorisation motorisation);

    void deleteMotorisationByCarburant(TypeCarburant carburant);
}