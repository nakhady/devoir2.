package services;

import java.util.List;

import entities.Zone;
import repositories.ZoneRepositories;

public class ZoneService {
    private ZoneRepositories zoneRepository=new ZoneRepositories();
    
  public List<Zone> listerZone(){
      return zoneRepository.selectAll();
   }
    
}
