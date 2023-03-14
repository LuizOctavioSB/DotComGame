import java.util.List;

public class JustAnotherCom extends DotCom {

    private List<String> locationCells;
    private int numOfHits = 0;
    private int numOfContracts = 2;
    private String contractName;

    public void setLocationCells(List<String> locs) {
        locationCells = locs;
    }

    public void setContractName(String name) {
        contractName = name;
    }

    public String checkYourself(String userInput) {
        String result = "miss";
        int index = locationCells.indexOf(userInput);
        if (index >= 0) {
            locationCells.remove(index);
            if (locationCells.isEmpty()) {
                result = "kill";
                System.out.println("Você cancelou o contrato com " + contractName);
                numOfContracts--;
                if (numOfContracts == 0) {
                    System.out.println("Você eliminou todos os contratos de " + getName());
                }
            } else {
                result = "hit";
            }
        }
        return result;
    }
}