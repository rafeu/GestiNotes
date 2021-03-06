/**
 * 28/09/2016
 * @author raphael
 */
class Cours {
//variables
    private String nom;
    private Professeur prof;
    private Double valeurCours;
    private Double note=-1.;
//Constructeurs
    Cours(){
        this("cours",.2);
    }
    Cours(String nom,Double valeurCours){
        setNom(nom);
        setProf(new Professeur());
        setValeurCours(valeurCours);
    }
    Cours(String nom,Double valeurCours,Double note){
        this(nom, valeurCours);
        setNote(note);
    }
    Cours(String nom,String nomProf,Double valeurCours){
        this (nom,valeurCours);
        setProf(new Professeur(nomProf));
    }
//Accesseur-Mutateurs (GET-SET)
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    
    public Professeur getProf() {
        return prof;
    }
    public void setProf(Professeur prof) {
        this.prof = prof;
    }

    public Double getValeurCours() {
        return valeurCours;
    }
    public void setValeurCours(Double valeurCours) {
        this.valeurCours = valeurCours;
    }
    
    public Double getNote() {
        return note;
    }
    public void setNote(Double note) {
        this.note = note;
    }
    
//méthodes autres
    


    
}
