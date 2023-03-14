public class StartupCom extends DotCom {
    private int hitCount;

    public StartupCom() {
        hitCount = 0;
    }

    public String checkYourself(String guess) {
        String result = "miss";
        int index = locationCells.indexOf(guess);
        if (index >= 0) {
            locationCells.remove(index);
            if (locationCells.isEmpty()) {
                result = "kill";
                System.out.println("Você afundou a StartupCom " + super.name + "!");
            } else {
                result = "hit";
            }
        }
        return result;
    }
}