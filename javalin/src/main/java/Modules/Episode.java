package Modules;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
public class Episode {
    @Id
    @SequenceGenerator
            (name = "EPISODE_ID_GENERATOR", sequenceName =
                    "EPISODE_ID", initialValue = 1, allocationSize = 1)
    @GeneratedValue
            (strategy = GenerationType.SEQUENCE, generator =
                    "EPISODE_ID_GENERATOR")
    @Column(name = "Episode_ID", precision = 2)
    private int episodeId;
    @Column (name="Title" , length=255)
    private String title;
    @Column (name="Description" , length=655)
    private String description;
    @Column (name="UploadDate")
    private LocalDate uploadDate;
    @Column (name="Audiolink" , length=355)
    private String audioLink;

    public String getDescription() {
        return description;
    }

    public String getAudioLink() {
        return audioLink;
    }

    public LocalDate getUploadDate() {
        return uploadDate;
    }

    public String getTitle() {
        return title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAudioLink(String audioLink) {
        this.audioLink = audioLink;
    }

    public void setUploadDate(LocalDate uploadDate) {
        this.uploadDate = uploadDate;
    }
}
