package services;

import java.util.List;

import entities.Bien;
import repositories.BienRepositories;

public class BienService {
    private BienRepositories bienRepository=new BienRepositories();
    
    public List<Bien> listerBien(){
        return bienRepository.selectAll();
     }

     public void ajouterBien(Bien bien){
        bienRepository.insert(bien);
       }
    
    
}
