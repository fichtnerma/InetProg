package Modules;

import java.util.Date;

public class Episode {
    private String title;
    private String description;
    private Date uploadDate;
    private String audioLink;

    public String getDescription() {
        return description;
    }

    public String getAudioLink() {
        return audioLink;
    }

    public Date getUploadDate() {
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

    public void setUploadDate(Date uploadDate) {
        this.uploadDate = uploadDate;
    }
}
