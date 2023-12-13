package dao;

import entity.Produit;

import java.util.Scanner;

public class ProduitImpl implements IProduit {
    @Override
    public Produit saisie() {
        Produit p = new Produit();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Donner la reference : ");
        p.setRef(scanner.nextLine());

        System.out.println("Donner le libelle : ");
        p.setLibelle(scanner.nextLine());

        do {
            System.out.println("Donner la quantite : ");
            p.setQuantite(scanner.nextDouble());
        }while(p.getQuantite() <= 0);

        do {
            System.out.println("Donner le prix : ");
            p.setPrix(scanner.nextInt());
        }while(p.getPrix() <= 0);

        return p;
    }

    @Override
    public void affiche(Produit p) {

        System.out.println("Infos Produit : ");
        System.out.println("Ref : " + p.getRef());
        System.out.println("Libelle : " + p.getLibelle());
        System.out.println("Quantite : " + p.getQuantite());
        System.out.println("Prix : " + p.getPrix());


    }
}
