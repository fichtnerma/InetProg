import Modules.Episode;
import Modules.Podcast;
import io.javalin.Javalin;
import org.jetbrains.annotations.NotNull;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.time.LocalDate;
import java.util.Date;
import java.util.Map;

public class HelloWorld {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("podlike");
        EntityManager em = emf.createEntityManager();
        Podcast p1 = initPodcast();
        em.getTransaction().begin();
        em.persist(p1);
        em.getTransaction().commit();
        Javalin app = Javalin.create().start(7000);
        app.get("/all", ctx -> ctx.render("AllePodcasts.html"));
        app.get("/podcast/:id", ctx ->
        {
            String id = ctx.pathParam("id");
            Podcast pod = em.find(Podcast.class, Integer.parseInt(id));
            ctx.render("Podcast.html", Map.of("podcast", pod));
        }
        );

    }


    private static Podcast initPodcast() {
        Podcast podcast = new Podcast();
        podcast.setDescription("Contrary to popular belief, " +
                "Lorem Ipsum is not simply random text. " +
                "It has roots in a piece of classical Latin literature from 45 BC," +
                " making it over 2000 years old. Richard McClintock, " +
                "a Latin professor at Hampden-Sydney College in Virginia, " +
                "looked up one of the more obscure Latin words, consectetur, " +
                "from a Lorem Ipsum passage, and going through the cites of the word in classical literature, " +
                "discovered the undoubtable source.");
        podcast.setTitle("Beispiel");

        //podcast.addEpisode(podcast.getEpisodes().size(),initEpisode());


        return podcast;

    }

    private static Episode initEpisode() {
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