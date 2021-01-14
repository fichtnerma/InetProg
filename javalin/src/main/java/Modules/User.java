package Modules;

import javax.persistence.*;

@Entity
public class User {
    @Id
    @SequenceGenerator
            (name = "USER_ID_GENERATOR", sequenceName =
                    "USER_ID", initialValue = 1, allocationSize = 1)
    @GeneratedValue
            (strategy = GenerationType.SEQUENCE, generator =
                    "USER_ID_GENERATOR")
    @Column(name = "User_ID", precision = 2)
    private int userId;
    @Column (name="Name", length=255, nullable=false)
    private String name;
    @Column (name="Mail", length=155, unique=true, nullable=false)
    private String mail;
    @Column (name="Password", length=55, nullable=false)
    private String password;
    @Column (name="IsAuthor")
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
