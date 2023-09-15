/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.sql.ResultSetMetaData;


public class DbCon {

    private String connectionUrl;
    private Connection con;

    public DbCon(String bd) {
        connectionUrl
                = "jdbc:sqlserver://localhost:1433;"
                + "databaseName=" + bd + ";"
                + "user=abc;"
                + "password=abcde;"
                + "encrypt=true;"
                + "trustServerCertificate=true;"
                + "loginTimeout=30;";
        try {
            con = DriverManager.getConnection(connectionUrl);
            System.out.println("Connection Established");
        } catch (Exception ex) {
            System.out.println("Error");
            ex.printStackTrace();
        }
    }

    public String getConnectionUrl() {
        return connectionUrl;
    }

    public void setConnectionUrl(String connectionUrl) {
        this.connectionUrl = connectionUrl;
    }

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }

    public ResultSet getTable(String table) {
        ResultSet rs = null;
        try {
            PreparedStatement ps = con.prepareStatement("Select * from " + table);
            rs = ps.executeQuery();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }

    public void deleteElement(String table, Object id) {
        String id_table = "";
        switch (table) {
            case "Tienda":
                id_table = "id_tienda";
                break;
            case "Cliente":
                id_table = "id_cliente";
                break;
            case "Producto":
                id_table = "UPC";
                break;
            case "Vendedor":
                id_table = "id_vendedor";
                break;
            case "Factura":
                id_table = "numero";
                break;
        }
        try {
            PreparedStatement ps = con.prepareStatement("Delete from " + table + " where " + id_table + " = " + id);
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateElement(String table, Object id, ArrayList<Object> atributes) {
        String id_table = "";
        switch (table) {
            case "Tienda":
                id_table = "id_tienda";
                break;
            case "Cliente":
                id_table = "id_cliente";
                break;
            case "Producto":
                id_table = "UPC";
                break;
            case "Vendedor":
                id_table = "id_vendedor";
                break;
            case "Factura":
                id_table = "numero";
                break;
        }

        String params = "";
        try {
            ResultSet rs = getTable(table);
            ResultSetMetaData metaData = rs.getMetaData();
            for (int i = 2; i <= metaData.getColumnCount(); i++) {
                params += (" " + metaData.getColumnName(i)+" = "+ atributes.get(i-2)+",");
            }
            params = params.substring(0, params.length()-1);
            PreparedStatement ps = con.prepareStatement("Update " + table + " Set" + params + " where " + id_table + " = "+ id);
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}