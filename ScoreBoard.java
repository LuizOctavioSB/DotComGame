import java.util.List;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ScoreBoard {

    private static final String FILE_NAME = "scoreboard.txt";
    private List<Score> scores;

    public ScoreBoard() {
        scores = new ArrayList<>();
        try {
            File file = new File(FILE_NAME);
            if (file.exists()) {
                Scanner scanner = new Scanner(file);
                while (scanner.hasNextLine()) {
                    String[] line = scanner.nextLine().split(",");
                    scores.add(new Score(line[0], Integer.parseInt(line[1])));
                }
                scanner.close();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Erro ao ler o arquivo de placar: " + e.getMessage());
        }
    }

    public void addScore(String name, int count) {
        scores.add(new Score(name, count));
        try {
            PrintWriter writer = new PrintWriter(FILE_NAME);
            for (Score score : scores) {
                writer.println(score.getName() + "," + score.getCount());
            }
            writer.close();
        } catch (FileNotFoundException e) {
            System.out.println("Erro ao escrever o arquivo de placar: " + e.getMessage());
        }
    }

    public void showScore() {
        scores.sort((s1, s2) -> s1.getCount() - s2.getCount());
        int rank = 1;
        for (Score score : scores) {
            System.out.println(rank + ". " + score.getName() + " - " + score.getCount() + " tiros");
            rank++;
        }
    }

    public List<Score> getScores() {
        return scores;
    }

}