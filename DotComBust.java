import helper.GameHelper;
import java.util.List;
import java.util.ArrayList;

public class DotComBust {

    private GameHelper helper;
    private List<DotCom> dotcoms;
    private int count;
    private ScoreBoard scoreBoard;
    private String playerName;

    public DotComBust() {
        scoreBoard = new ScoreBoard();
        dotcoms = new ArrayList<DotCom>();
        helper = new GameHelper();
        count = 0;
    }

    public void retry() {
        helper = new GameHelper();
        dotcoms = new ArrayList<DotCom>();
    }

    private boolean validatePosition(String initial, String direction, int length) {
// Verifica se a posição inicial é válida
if (initial.length() != 2 || initial.charAt(0) < 'a' || initial.charAt(0) > 'g'
|| initial.charAt(1) < '0' || initial.charAt(1) > '7') {
return false;
}
// Verifica se a direção é válida
if (!direction.equalsIgnoreCase("cima") && !direction.equalsIgnoreCase("baixo") && !direction.equalsIgnoreCase("esquerda")
&& !direction.equalsIgnoreCase("direita")) {
return false;
}
// Verifica se as posições geradas pela direção são válidas
int col = initial.charAt(0) - 'a';
int row = initial.charAt(1) - '0';
if (direction.equalsIgnoreCase("cima")) {
if (row - length < 0) {
return false;
}
}
if (direction.equalsIgnoreCase("baixo")) {
if (row + length > 7) {
return false;
}
}
if (direction.equalsIgnoreCase("esquerda")) {
if (col - length < 0) {
return false;
}
}
if (direction.equalsIgnoreCase("direita")) {
if (col + length > 7) {
return false;
}
}
return true;
}

    private List<String> generatePositions(String initial, String direction, int length) {
        List<String> positions = new ArrayList<>();
        int col = initial.charAt(0) - 'a';
        int row = initial.charAt(1) - '0';
        for (int i = 0; i < length; i++) {
            if (direction.equals("cima")) {
                positions.add((char) (col + 'a') + "" + (row - i));
            }
            if (direction.equals("baixo")) {
                positions.add((char) (col + 'a') + "" + (row + i));
            }
            if (direction.equals("esquerda")) {
                positions.add((char) (col - i + 'a') + "" + row);
            }
            if (direction.equals("direita")) {
                positions.add((char) (col + i + 'a') + "" + row);
            }
        }
        return positions;
    }

    public boolean setupPanel(String type, String name, String initial, String direction) {
        DotCom dotcom;
        int length=0;
        if (type.equals("JustAnotherCom")) {
            dotcom = new JustAnotherCom();
            length=5;
        } else if (type.equals("MicroCom")) {
            length=4;
            dotcom = new MicroCom();
        } else if (type.equals("BigCom")) {
            length=6;
            dotcom = new BigCom();
        } else {
            length=3;
            dotcom = new StartupCom();
        }
        if (validatePosition(initial, direction, length)) {
            dotcom.setName(name);
            dotcom.setLocationCells(generatePositions(initial, direction, length));
            dotcoms.add(dotcom);
            return true;
        } else {
            return false;
        }
    }

    public void setPlayerName(String player) {
        playerName = player;
    }

    public String verify(String jogada) {
        var verify = false;
        count++;
        DotCom hitted = null;
        String result = "miss";
        for (DotCom dotcom : dotcoms) {
            result = dotcom.checkYourself(jogada);
            if (result != "miss") {
                hitted = dotcom;
                break;
            }
        }
        if (result == "kill") {
            dotcoms.remove(hitted);
            result = "Afundou o " + hitted.getName();
        }
        if (dotcoms.isEmpty()) {
            result = "finish";
        }

        if (result == "hit") {
            result = "Acertou o " + hitted.getName();
        }

        return result;
    }

    public void start() {
        System.out.printf("Objetivos do jogo...\n");
        do {
            String jogada = helper.getUserInput("Informe a jogada:");
            count++;
            String result = "miss";
            DotCom hitted = null;
            for (DotCom dotcom : dotcoms) {
                result = dotcom.checkYourself(jogada);
                System.out.print(result);
                if (result != "miss") {
                    hitted = dotcom;
                    System.out.printf("Dot com %s foi atingido!\n", dotcom.getName());
                    break;
                }
            }
            if (result == "kill") {
                System.out.printf("Dot com %s foi afundado!\n", hitted.getName());
                dotcoms.remove(hitted);
            }

        } while (!dotcoms.isEmpty());
        finishGame();
    }

    public List<Score> finishGamePanel() {
        scoreBoard.addScore(playerName, count);
        return scoreBoard.getScores();
    }

    public void finishGame() {
        System.out.printf("Jogo terminado após %d jogadas.\n", count);
        scoreBoard.addScore(playerName, count);
        scoreBoard.showScore();
    }
}