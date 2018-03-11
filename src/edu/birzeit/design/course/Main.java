package edu.birzeit.design.course;

import edu.birzeit.design.course.app.Application;
import edu.birzeit.design.course.factories.FactoryMaker;

/**
 * Main class. Everything comes together here.
 */
public class Main {

    /**
     * Application picks the factory type and creates it in run time (usually at
     * initialization stage), depending on the configuration or
     * environment variables.
     */
    private static Application configureApplication() {
        String osName = System.getProperty("os.name").toLowerCase();
        Application app = new Application(FactoryMaker.getFactory(osName));
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}
