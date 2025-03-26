package CreationalPatterns.AbstractFactory.factories.impl;

import CreationalPatterns.AbstractFactory.components.Button;
import CreationalPatterns.AbstractFactory.components.CheckBox;

public abstract class AbstractFactory {
    public abstract Button createButton();
    public abstract CheckBox createCheckBox();
}
