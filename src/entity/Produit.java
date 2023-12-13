package entity;

public class Produit {

    private String ref;
    private String libelle;
    private  Double quantite;
    private Integer prix;

    public String getRef() {
        return ref;
    }

    public String getLibelle() {
        return libelle;
    }

    public Double getQuantite() {
        return quantite;
    }

    public Integer getPrix() {
        return prix;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public void setQuantite(Double quantite) {
        this.quantite = quantite;
    }

    public void setPrix(Integer prix) {
        this.prix = prix;
    }
}
