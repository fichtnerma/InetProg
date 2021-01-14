import Modules.Episode;
import Modules.Podcast;
import io.javalin.Javalin;

import javax.persistence.Persistence;
import java.time.LocalDate;
import java.util.Date;

public class HelloWorld {
    public static void main(String[] args) {
        Persistence.createEntityManagerFactory("podlike");
        Javalin app = Javalin.create().start(7000);
        app.get("/all", ctx -> ctx.render("AllePodcasts.html"));
        app.get("/podcast", ctx -> ctx.render("Podcast.html"));
    }

    private Podcast initPodcast() {
        Podcast podcast = new Podcast();
        podcast.setDescription("Contrary to popular belief, " +
                "Lorem Ipsum is not simply random text. " +
                "It has roots in a piece of classical Latin literature from 45 BC," +
                " making it over 2000 years old. Richard McClintock, " +
                "a Latin professor at Hampden-Sydney College in Virginia, " +
                "looked up one of the more obscure Latin words, consectetur, " +
                "from a Lorem Ipsum passage, and going through the cites of the word in classical literature, " +
                "discovered the undoubtable source.");
        podcast.addEpisode(podcast.getEpisodes().size(),initEpisode());


        return podcast;

    }

    private Episode initEpisode() {
        Episode episode = new Episode();
        episode.setAudioLink("http://www.ffmages.com/ffvii/ost/disc-1/15-the-oppressed.mp3");
        episode.setDescription("Contrary to popular belief, " +
                "Lorem Ipsum is not simply random text. " +
                "It has roots in a piece of classical Latin literature from 45 BC," +
                " making it over 2000 years old.");
        episode.setTitle("Test1");
        episode.setUploadDate(LocalDate.now());
        return episode;
    }
}
