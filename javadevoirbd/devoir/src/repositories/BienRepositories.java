package repositories;

import java.util.ArrayList;
import java.util.List;

import entities.Bien;

public class BienRepositories {
    private List<Bien> tBiens=new ArrayList<>();
    //select
    
    public  List<Bien> selectAll(){
       return tBiens;
    }

    public  void insert(Bien bien){
        tBiens.add(bien);
     }
    
    
}
