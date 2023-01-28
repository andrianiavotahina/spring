package com.example.demo.Function;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Conn_Encher{
    public Connection conn=null;
    private Statement espace;

    public Conn_Encher(){


        try{
            Class.forName("org.postgresql.Driver");
            //"jdbc:postgresql://host:port/database"
            this.conn=  DriverManager.getConnection("jdbc:postgresql://snuffleupagus.db.elephantsql.com:5432/tioxwyhf","tioxwyhf","ylLj--uUH8gutjATR4z4rXqX7sq33uJq");
            this.espace=this.conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }

    public Statement get_espace()
    {
        return this.espace;
    }
    public void close()
    {
        try {
            this.conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}