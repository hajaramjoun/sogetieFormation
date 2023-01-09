package Carrefour.customType;

import domainObjects.CustomerDetails;
import domainObjects.PersonneDetails;
import io.cucumber.java.DataTableType;

import java.util.Map;

public class CustomCarrefourDataTableType {
  @DataTableType
  public CustomerDetails personneDetailsEntry(Map<String,String> entryMapList){
    return new CustomerDetails(entryMapList.get("prenom"),entryMapList.get("nom"),entryMapList.get("email"),entryMapList.get("password"));
  }


}
