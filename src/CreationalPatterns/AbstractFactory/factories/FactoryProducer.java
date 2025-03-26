package CreationalPatterns.AbstractFactory.factories;

import CreationalPatterns.AbstractFactory.factories.impl.AbstractFactory;
import CreationalPatterns.AbstractFactory.factories.impl.MacUIFactory;
import CreationalPatterns.AbstractFactory.factories.impl.WindowsUIFactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(String currentOs) {
        if (currentOs.equalsIgnoreCase("windows")) {
            return new WindowsUIFactory();
        }
        if (currentOs.equalsIgnoreCase("mac")) {
            return new MacUIFactory();
        }
        return new WindowsUIFactory();
    }
}
