package lesson22;


import java.util.logging.Level;
import java.util.logging.Logger;

public class MainJUL {
    private static final Logger LOGGER = LoggerUtil.getLogger(MainJUL.class);

    public static void main(String[] args) {
        int i = 0;
        System.out.println("I am here and i = " + i++);
        System.err.println("Error");
        LOGGER.info("I am here and i = " + i++);
        LOGGER.severe("I am here and i = " + i++);
        LOGGER.log(Level.INFO, "I am here and i = " + i++);
    }
}
