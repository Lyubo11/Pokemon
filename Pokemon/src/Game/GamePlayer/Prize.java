package Game.GamePlayer;

public class Prize {
    private String medalName;
    private String description;

    public Prize(String medalName, String description) {
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
        return "Prize's info:'" +
                "\nPrize name: " + medalName +
                "\nDescription: " + description;
    }
}
