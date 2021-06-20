package homework1.entity;

public class Admin extends Entity {

    public Admin(String firstName, String lastName, Integer age, String email, String password) {
        super(firstName, lastName, age, email, password, Role.ADMIN);
    }
}
