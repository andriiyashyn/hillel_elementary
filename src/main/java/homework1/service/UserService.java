package homework1.service;


import homework1.entity.Entity;

import java.io.IOException;

public class UserService extends AbstractService {
    private static final String MESSAGE = "Current method is unavailable for UserService";

    @Override
    public void writeUser(Entity entity) throws IOException {
        System.out.println(MESSAGE);
    }
}
