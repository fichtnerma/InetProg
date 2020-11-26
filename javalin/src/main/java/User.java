public class User {
    private String name;
    private String mail;
    private String password;
    private boolean isAuthor;

    public String getMail() {
        return mail;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public void setAuthor(boolean author) {
        isAuthor = author;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
