package homework1.service;


import homework1.entity.Entity;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class AdminService extends AbstractService implements Service {
    @Override
    public void writeUser(Entity entity) throws IOException {
        File file = new File(getFilePath());
        FileWriter writer = new FileWriter(file.getAbsoluteFile(), true);
        writer.write(entity.getEmail() + '\n');
        writer.write(entity.getAge() + '\n');
        writer.write(entity.getFirstName() + '\n');
        writer.write(entity.getLastName() + '\n');
    }
}
