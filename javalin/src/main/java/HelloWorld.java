import io.javalin.Javalin;

public class HelloWorld {
    public static void main(String[] args) {
        Javalin app = Javalin.create().start(7000);
        app.get("/all", ctx -> ctx.render("AllePodcasts.html"));
        app.get("/podcast", ctx -> ctx.render("Podcast.html"));
    }
}
