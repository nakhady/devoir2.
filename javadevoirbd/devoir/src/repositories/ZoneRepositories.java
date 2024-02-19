package repositories;

import java.util.ArrayList;
import java.util.List;

import entities.Zone;

public class ZoneRepositories {
    private List<Zone> tZones=new ArrayList<>();
    //select
    public  List<Zone> selectAll(){
       return tZones;
    }
    
}
