package org.example.dao.impl;

import org.example.dao.MotorisationDao;
import org.example.database.DatabaseConnection;
import org.example.pojo.Motorisation;
import org.example.pojo.TypeCarburant;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class MotorisationDaoImpl implements MotorisationDao {

    private Connection connection;

    public MotorisationDaoImpl(){
        connection = DatabaseConnection.getConnection();
        try {
            createTable();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    private void createTable() throws SQLException {
            String query = "CREATE TABLE IF NOT EXISTS motorisation (typeCarburant VARCHAR(255),nombreChevaux INT NUMBER)";

            Statement statement = connection.createStatement();
            statement.execute(query);
    }

    @Override
    public List<Motorisation> getAllMotorisation() {
        return null;
        //return motorisations;
    }

    @Override
    public List<Motorisation> getAllMotorisationByCarburant(TypeCarburant carburant) {
        return null;
    /*  return motorisations.stream()
                .filter(motorisation -> motorisation.getTypeCarburant()
                        .equals(carburant))
                .collect(Collectors.toList());
    */
    }

    @Override
    public void saveMotorisation(Motorisation motorisation) {
        try{
            String query = "insert into motorisation(typeCarburant,nombreChevaux) values" +
                    "(?,?)";
            PreparedStatement ps = connection.prepareStatement(query);

            ps.setString(1,motorisation.getTypeCarburant().toString());
            ps.setInt(2,motorisation.getNombreChevaux());

            ps.execute();

        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public void deleteMotorisationByCarburant(TypeCarburant carburant) {
        /* motorisations.removeIf(motorisation -> motorisation.getTypeCarburant()
                .equals(carburant));
         */
    }
}