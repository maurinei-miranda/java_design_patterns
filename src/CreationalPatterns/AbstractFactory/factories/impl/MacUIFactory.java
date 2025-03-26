package CreationalPatterns.AbstractFactory.factories.impl;

import CreationalPatterns.AbstractFactory.components.Button;
import CreationalPatterns.AbstractFactory.components.CheckBox;
import CreationalPatterns.AbstractFactory.components.impl.MacButton;
import CreationalPatterns.AbstractFactory.components.impl.MacCheckBox;

public class MacUIFactory extends AbstractFactory {

    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new MacCheckBox();
    }
}
