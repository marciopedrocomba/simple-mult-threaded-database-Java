package org.example.Controller;

import java.util.LinkedList;

//this class is the one that connects the Controller with the Model and Dao
public class User {

    //get All the users
    public static LinkedList<org.example.Model.User> getUsers(String dbname) {
        return new org.example.Dao.User().find(dbname);
    }

}
