import java.util.List;

public class DotCom {
  protected List<String> locationCells;
  protected String name;

  public String getName(){
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
  
  public void setLocationCells(List<String> cells) {
    this.locationCells = cells; 
  }

  public String checkYourself(String guess) {
    String result = "miss";
    for(String p : locationCells) {
      if (p.equals(guess)) {
        result = "hit";
        break;
      }
    }
    if (result == "hit") {
      locationCells.remove(guess);
    }
    if (locationCells.isEmpty()) {
      result = "kill";
    }
    return result;
  }
}