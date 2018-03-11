package edu.birzeit.design.course.factories;

import edu.birzeit.design.course.buttons.MacOSButton;
import edu.birzeit.design.course.checkboxes.MacOSCheckbox;

/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 */
public class MacOSFactory implements GUIFactory {

    @Override
    public MacOSButton createButton() {
        return new MacOSButton();
    }

    @Override
    public MacOSCheckbox createCheckbox() {
        return new MacOSCheckbox();
    }
}

