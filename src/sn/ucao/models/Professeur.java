package sn.ucao.models;

public class Professeur extends Personne {

    private String fonction;
    private String niveauEtude;

    public String getFonction() {
        return fonction;
    }

    public void setFonction(String fonction) {
        this.fonction = fonction;
    }

    public String getNiveauEtude() {
        return niveauEtude;
    }

    public void setNiveauEtude(String niveauEtude) {
        this.niveauEtude = niveauEtude;
    }

    public Professeur(String fonction) {
        this.fonction = fonction;
    }

    public Professeur(String matricule, String nom, String prenom, String telephone, String email, String fonction) {
        super(matricule, nom, prenom, telephone, email);
        this.fonction = fonction;
    }

}
