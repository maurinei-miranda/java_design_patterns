package CreationalPatterns.AbstractFactory;

import CreationalPatterns.AbstractFactory.components.Button;
import CreationalPatterns.AbstractFactory.components.CheckBox;
import CreationalPatterns.AbstractFactory.factories.FactoryProducer;
import CreationalPatterns.AbstractFactory.factories.impl.AbstractFactory;

public class Main {
    public static void main(String[] args) {
        AbstractFactory osFactory = FactoryProducer.getFactory("windows");
        Button windowsButton = osFactory.createButton();
        CheckBox checkBox = osFactory.createCheckBox();

        System.out.println(windowsButton);
        System.out.println(checkBox.getStatus());
        checkBox.render();
        checkBox.enable();
        System.out.println(checkBox.getStatus());
        windowsButton.onClick();
    }
}