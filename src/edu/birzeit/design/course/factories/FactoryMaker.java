package edu.birzeit.design.course.factories;

import edu.birzeit.design.course.factories.GUIFactory;
import edu.birzeit.design.course.factories.MacOSFactory;
import edu.birzeit.design.course.factories.WindowsFactory;

//Factory creator - an indirect way of instantiating the factories
public class FactoryMaker {
    private static GUIFactory abstractFactory = null;

    public static GUIFactory getFactory(String choice) {
        if (choice.equals("mac os x")) {
            abstractFactory = new MacOSFactory();
        } else {
            abstractFactory = new WindowsFactory();
        }
        return abstractFactory;
    }
}