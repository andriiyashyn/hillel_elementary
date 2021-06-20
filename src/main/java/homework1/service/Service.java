package homework1.service;


import homework1.entity.Entity;

import java.io.IOException;

public interface Service {
    boolean checkUser(Entity entity) throws IOException;
    void writeUser(Entity entity) throws IOException;
}
