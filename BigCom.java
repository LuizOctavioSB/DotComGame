import java.util.ArrayList;
import java.util.List;

public class BigCom extends DotCom {

    private int hitCount;
    private List<String> locationCells;
    private String[] filials = {"Filial A", "Filial B", "Filial C", "Filial D", "Filial E", "Filial F"};

    public BigCom() {
        locationCells = new ArrayList<>();
        hitCount = 0;
    }

    @Override
    public void setLocationCells(List<String> loc) {
        locationCells = loc;
    }

    @Override
    public String checkYourself(String userInput) {
        String result = "miss";
        int index = locationCells.indexOf(userInput);
        if (index >= 0) {
            locationCells.remove(index);
            if (locationCells.isEmpty()) {
                result = "kill";
            } else {
                result = "hit";
                hitCount++;
                if (hitCount % 2 == 0) {
                    System.out.println("Uma das filiais da " + getName() + " encerrou suas atividades: " + filials[hitCount / 2 - 1]);
                }
                move();
            }
        }
        return result;
    }

    private void move() {
        List<String> newLocation = new ArrayList<>();
        for (String loc : locationCells) {
            int col = loc.charAt(0) - 'a';
            int row = loc.charAt(1) - '0';
            int newCol = col;
            int newRow = row;

            boolean moveRight = Math.random() < 0.5;
            if (moveRight) {
                newCol = col + 1;
                if (newCol > 6) {
                    newCol = col - 1;
                }
            } else {
                newRow = row + 1;
                if (newRow > 6) {
                    newRow = row - 1;
                }
            }

            String newLoc = (char)(newCol + 'a') + "" + newRow;
            if (!newLocation.contains(newLoc)) {
                newLocation.add(newLoc);
            }
        }
        locationCells = newLocation;
        System.out.println("A " + getName() + " se moveu");
    }

}