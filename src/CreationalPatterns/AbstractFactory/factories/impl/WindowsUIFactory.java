package CreationalPatterns.AbstractFactory.factories.impl;

import CreationalPatterns.AbstractFactory.components.Button;
import CreationalPatterns.AbstractFactory.components.CheckBox;
import CreationalPatterns.AbstractFactory.components.impl.WindowsButton;
import CreationalPatterns.AbstractFactory.components.impl.WindowsCheckBox;

public class WindowsUIFactory extends AbstractFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new WindowsCheckBox();
    }
}
