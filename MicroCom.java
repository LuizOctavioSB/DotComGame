import java.util.ArrayList;

public class MicroCom extends DotCom {

    private int hits;
    private String contract;
    private int contractValue;

    public MicroCom() {
        super();
        setName("MicroCom");
        setLocationCells(new ArrayList<String>(4));
        setContractValue(100);
    }

    public void setContract(String contract) {
        this.contract = contract;
    }

    public String getContract() {
        return this.contract;
    }

    public void setContractValue(int contractValue) {
        this.contractValue = contractValue;
    }

    public int getContractValue() {
        return this.contractValue;
    }

    public void setHits(int hits) {
        this.hits = hits;
    }

    public int getHits() {
        return this.hits;
    }

    @Override
    public String checkYourself(String userInput) {
        String result = "miss";
        int index = locationCells.indexOf(userInput);
        if (index >= 0) {
            locationCells.remove(index);
            if (locationCells.isEmpty()) {
                result = "kill";
                System.out.println("MicroCom afundou, contratante " + contract + " perdeu!");
            } else {
                result = "hit";
                System.out.println("Você acertou a MicroCom!");
                System.out.println("Por favor, não atire mais, contratante " + contract + " vai perder o contrato em " + (contractValue - hits) + " tiros.");
            }
        }
        return result;
    }
}