package homework1.entity;

public class User extends Entity {

    public User(String firstName, String lastName, Integer age, String email, String password) {
        super(firstName, lastName, age, email, password, Role.USER);
    }
}
