package Modules;

import Modules.Episode;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Podcast {
    @Id
    private int podcastId;
    @Column (name="Title", length=255)
    private String title;
    @ManyToOne
    @JoinColumn(name="Author_ID", referencedColumnName="User_ID")
    private User author;
    @Column (name="Description" , length=655)
    private String description;
    @OneToMany (mappedBy = "episodeId")
    private List<Episode> episodes = new ArrayList<Episode>();

    public String getTitle(){
        return title;
    }

    public List<Episode> getEpisodes() {
        return episodes;
    }

    public User getAuthor() {
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

    public void setAuthor(User author) {
        this.author = author;
    }

    public void setEpisodes(List<Episode> episodes) {
        this.episodes = episodes;
    }

    public void addEpisode(int index,Episode episode){
        episodes.add(index,episode);
    }
}
