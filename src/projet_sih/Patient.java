/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_sih;

/**
 *
 * @author Julien
 */
public class Patient {
    private String nom;
    private String prenom;
    private DateExamen date_nai;
    private boolean sexe;
    private int identifiant;

    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @return the prenom
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * @param prenom the prenom to set
     */
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    /**
     * @return the date_nai
     */
    public DateExamen getDate_nai() {
        return date_nai;
    }

    /**
     * @param date_nai the date_nai to set
     */
    public void setDate_nai(DateExamen date_nai) {
        this.date_nai = date_nai;
    }

    /**
     * @return the sexe
     */
    public boolean isSexe() {
        return sexe;
    }

    /**
     * @param sexe the sexe to set
     */
    public void setSexe(boolean sexe) {
        this.sexe = sexe;
    }

    /**
     * @return the identifiant
     */
    public int getIdentifiant() {
        return identifiant;
    }

    /**
     * @param identifiant the identifiant to set
     */
    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }

    /**
     *  @param date_nai the date_nai to set
     */
    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.48763714-05C3-A8ED-BEC0-0F40E2E62F20]
    // </editor-fold> 
    public void setDate_nai (Date date_nai) {
    }
}
