import java.util.ArrayList;

public class Players implements ISaveable {
    private String playerName;
    private String score;
    private ArrayList<String> values;
    private String type;

    public Players(ArrayList<String> List) {
        this.values = List;
    }

    @Override
    public String toString() {
        return "Players{" +
                "playerName='" + playerName + '\'' +
                ", score='" + score + '\'' +
                ", values=" + values +
                ", type='" + type + '\'' +
                '}';
    }

    @Override
    public ArrayList<String> sendList() {
        return values;
    }

    @Override
    public void populate() {
        this.playerName = values.get(0);
        this.score = values.get(1);
        this.type = values.get(2);
    }
}
