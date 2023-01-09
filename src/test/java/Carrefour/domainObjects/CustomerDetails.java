package domainObjects;

public class CustomerDetails {
    String prenom;
    String nom;
    String Email;
     String password;

    public CustomerDetails(String prenom, String nom, String email, String password) {
        this.prenom = prenom;
        this.nom = nom;
        Email = email;
        this.password = password;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getNom() {
        return nom;
    }

    public String getEmail() {
        return Email;
    }

    public String getPassword() {
        return password;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
