import java.util.ArrayList;
import java.util.List;

public class Podcast {
    private String title;
    private String author;
    private String description;
    private List<Episode> episodes = new ArrayList<Episode>();

    public String getTitle(){
        return title;
    }

    public List<Episode> getEpisodes() {
        return episodes;
    }

    public String getAuthor() {
        return author;
    }

    public String getDescription() {
        return description;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setEpisodes(List<Episode> episodes) {
        this.episodes = episodes;
    }
}
