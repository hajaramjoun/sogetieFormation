package Carrefour.customType;

import domainObjects.PersonneDetails;
import io.cucumber.java.DataTableType;

import java.util.Map;

public class CustomDataTableType {
  @DataTableType
  public PersonneDetails personneDetailsEntry(Map<String,String> entryMapList){
    return new PersonneDetails(entryMapList.get("login"),entryMapList.get("password"));
  }


}
