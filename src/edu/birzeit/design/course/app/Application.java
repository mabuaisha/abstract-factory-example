package edu.birzeit.design.course.app;

import edu.birzeit.design.course.buttons.Button;
import edu.birzeit.design.course.checkboxes.Checkbox;
import edu.birzeit.design.course.factories.GUIFactory;

/**
 * Factory users don't care which concrete factory they use since they work with
 * factories and products through abstract interfaces.
 */
public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}