package org.example.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//this class defines all the databases configurations
public class Dbh {

    //this method retrieves the database connection
    public static Connection connect(String dname) {

        try {

            return DriverManager
                    .getConnection(
                            "jdbc:mysql://localhost:3306/" + dname + "",
                            "marciopedrocomba",
                            "Delfinapedro1"
                    );

        }catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

}
