package Game.GamePlayer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Medal {
    private String medalName;
    private String description;
    public static List<String> medalClasses = new ArrayList<>(Arrays.asList("Gold", "Silver", "Bronze"));

    public Medal(String medalName, String description) {
        this.medalName = medalName;
        this.description = description;
    }

    public String getMedalName() {
        return medalName;
    }

    public void setMedalName(String medalName) {
        this.medalName = medalName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Medal{" +
                "medalName='" + medalName + '\'' +
                ", description='" + description + '\'' +
                ", medalClasses=" + medalClasses +
                '}';
    }
}
