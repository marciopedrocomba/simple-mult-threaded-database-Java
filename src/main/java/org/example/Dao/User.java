package org.example.Dao;

import java.util.LinkedList;

//this class interacts with the CRUD of the User entity
public class User {

    public LinkedList<org.example.Model.User> find(String dbname) {
        var list = new LinkedList<org.example.Model.User>();

        try {


            var conn = Dbh.connect(dbname); //create the connection
            var stmt = conn.createStatement(); // create the statement instance

            //declare the sql statement
            String sql = "select * from users";
            var res = stmt.executeQuery(sql); // get all the data from the database

            while(res.next()) {
                list.add(
                        new org.example.Model.User(res.getInt("id"), res.getString("name"))
                );
            }

        }catch (Exception e) {

            e.printStackTrace();

        }

        return list;
    }

}
