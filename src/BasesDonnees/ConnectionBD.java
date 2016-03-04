/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BasesDonnees;

import java.sql.*;

/**
 *
 * @author Julien
 */
public class ConnectionBD {

    private Connection connexion;

    public void connecter() throws InstantiationException, IllegalAccessException {
        try {

            Class.forName(InfosDataBase.driver);

        } catch (ClassNotFoundException e) {
            System.out.println("Problème driver ODBC");
        }

        try {
            connexion = DriverManager.getConnection(InfosDataBase.database, InfosDataBase.login, InfosDataBase.password);
            System.out.println("Connexion établie");

        } catch (SQLException e) {
            System.out.println("Impossible de se connecter à la base");
            System.err.println(e);
        }
    }

    public Connection getConnexion() {
        return connexion;
    }

    public void setConnexion(Connection connexion) {
        this.connexion = connexion;
    }

    public ResultSet resultatRequete(String requete) throws SQLException {
        ResultSet resultats;
        Statement stmt = connexion.createStatement();
        resultats = stmt.executeQuery(requete);
        return resultats;
    }

    public PreparedStatement creerPreparedStatement(String requete) throws SQLException {
        PreparedStatement stmt = connexion.prepareStatement(requete);

        return stmt;
    }

    public void fermerConnexionDataBase() throws SQLException {
        connexion.close();
    }
}
