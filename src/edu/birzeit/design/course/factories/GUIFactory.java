package edu.birzeit.design.course.factories;

import edu.birzeit.design.course.buttons.Button;
import edu.birzeit.design.course.checkboxes.Checkbox;

/**
 * Abstract factory knows about all (abstract) product types.
 */

public interface GUIFactory {
    public abstract Button createButton();
    public abstract Checkbox createCheckbox();
}
