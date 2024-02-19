
import java.util.List;
import java.util.Scanner;

import entities.Bien;
import entities.Zone;
import services.BienService;
import services.ZoneService;


public class App {

    public static void main(String[] args) throws Exception {
        int choix;
        Scanner sc=new Scanner(System.in);
        ZoneService zoneService=new ZoneService();
        BienService bienService= new BienService();
        do{
            System.out.println("1-Créer une zone");
            System.out.println("2-Lister les zones");
            System.out.println("3-Ajouter un bien");
            System.out.println("4-Lister les biens");
            System.out.println("5-Quitter");
            choix=sc.nextInt();
             sc.nextLine();
             int prix;
            switch (choix) {
                 case 1:
                    System.out.println("Entrer un nom");
                     String nomZone=sc.nextLine(); 
                     Zone zone=new Zone();
                     zone.setNomZone(nomZone);
                      break;
                case 2:
                    List<Zone> zones= zoneService.listerZone();
                    for (Zone zn: zones) {
                     System.out.println("NomZone "+ zn.getNomZone());
                     System.out.println("=================================");

                }
                case 3:
                    System.out.println("Entrer une reference");
                    String reference=sc.nextLine(); 
                    System.out.println("Entrer une description");
                    String description=sc.nextLine(); 
                    System.out.println("Entrer un prix");
                    prix=sc.nextInt(); 
                    System.out.println("Entrer une date");
                    int date = sc.nextInt();
                    Bien bien=new Bien();
                      bien.setReference(reference);
                      bien.setDescription(description);
                      bien.setPrix(prix);
                      bien.setDateCreation(dateCreation);
                      bienService.ajouterBien(bien);
                      break;

                case 4:
                List<Bien> biens= bienService.listerBien();
                for (Bien bn: biens) {
                 System.out.println("reference "+ bn.getReference());
                 System.out.println("description "+ bn.getDescription());
                 System.out.println("prix "+ bn.getPrix());
                 System.out.println("date "+ bn.getDateCreation());
                 System.out.println("=================================");
                 }
                  break;
                  default:
                  break;
                }
        }while(choix !=5);
    }
}

