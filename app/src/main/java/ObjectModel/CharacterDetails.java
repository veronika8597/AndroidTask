package ObjectModel;

public class CharacterDetails {
    private int id;
    private String name;
    private String description;
    private String thumbnail; // Assuming thumbnail is a URL
    private String response;

    // Constructor
    public CharacterDetails(int id, String name, String description, String thumbnail, String response) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.thumbnail = thumbnail;
        this.response = response;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public String getResponse() {
        return response;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public void setResponse(String response) {
        this.response = response;
    }
}
