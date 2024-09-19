package fr.pgah;

import java.util.Scanner;

public class App {

  public static void main(String[] args) {
    // 0. Initialisation du Scanner
    Scanner clavier = new Scanner(System.in); // initialisation du Scanner clavier

    // 1. Récupérer salaire horaire
    System.out.println("Entrez votre salaire horaire : ");
    int salaireHoraire = clavier.nextInt();

    // 2. Récupérer nb heures travaillées
    System.out.println("Entrez vos heures travaillées : ");
    int nbHeuresTravaillees = clavier.nextInt();

    // 3. Multiplier
    int resultat = salaireHoraire * nbHeuresTravaillees + 100;

    // 4. Afficher
    System.out.println("Le salaire brut est : " + resultat);
  }
}
