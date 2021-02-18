package org.example;

public class App 
{
    public static void main( String[] args ) {

        //get all the users from database test
        var users = org.example.Controller.User.getUsers("test");
        for(org.example.Model.User user : users) {
            System.out.println(user.getId() + " : " + user.getName());
        }

        System.out.println("\n*********************************\n"); // print a new Line

        //get all the users from database test2
        var users2 = org.example.Controller.User.getUsers("test2");
        for(org.example.Model.User user : users2) {
            System.out.println(user.getId() + " : " + user.getName());
        }

    }
}
