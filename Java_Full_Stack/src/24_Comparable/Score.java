/*
Leaderboard
There is an application to create leaderboards of e-sports competitions. It uses the Score class to represent a score
of each player. This class has two fields: player for the player's name and totalScore for that player's total score.
To build a leaderboard, the Score objects need to be compared. A Score object is considered bigger than another Score
if it's totalScore value is bigger. If totalScore values of two Score objects are the same, such objects must be
compared by their player values. See the example below.

Sample Input 1:
Ann 162
Zipper 121
Flash 121
CoolDoge 200

Sample Output 1:
[Flash=121, Zipper=121, Ann=162, CoolDoge=200]
 */
import java.util.*;

class Score implements Comparable<Score> {
    private final String player;
    private final int totalScore;

    public Score(String player, int totalScore) {
        this.player = player;
        this.totalScore = totalScore;
    }

    public String getPlayer() {
        return player;
    }

    public int getTotalScore() {
        return totalScore;
    }

    @Override
    public String toString() {
        return player + '=' + totalScore;
    }

    @Override
    public int compareTo(Score score) {
        int compareByTotalScore = this.totalScore - score.totalScore;
        if (compareByTotalScore != 0) {
            return compareByTotalScore;
        }
        return this.getPlayer().compareTo(score.player);
    }
}

// do not change the code below
class MainScore {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Score> scores = new ArrayList<>();
        while (sc.hasNextLine()) {
            String[] input = sc.nextLine().split(" ");
            Score score = new Score(input[0], Integer.parseInt(input[1]));
            scores.add(score);
        }

        Collections.sort(scores);
        System.out.println(scores);
    }
}