package ClassPatern;

// Cоздание юзера

public class User {
    private String login;
    private String password;
    private String email;
    private String city;

    public User(String login, String password, String email, String city) {
        this.login = login;
        this.password = password;
        this.email = email;
        this.city = city;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

}
