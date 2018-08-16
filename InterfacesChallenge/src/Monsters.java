import java.util.ArrayList;

public class Monsters implements ISaveable {
    private String monsterName;
    private String hitPoints;
    private String monsterType;
    private ArrayList<String> values;

    public Monsters(ArrayList<String> values) {
        this.values = values;
    }

    @Override
    public String toString() {
        return "Monsters{" +
                "monsterName='" + monsterName + '\'' +
                ", hitPoints='" + hitPoints + '\'' +
                ", monsterType='" + monsterType + '\'' +
                '}';
    }

    @Override
    public ArrayList<String> sendList() {
        return values;
    }

    @Override
    public void populate() {
        this.monsterName = values.get(0);
        this.hitPoints = values.get(1);
        this.monsterType = values.get(2);

    }


}
