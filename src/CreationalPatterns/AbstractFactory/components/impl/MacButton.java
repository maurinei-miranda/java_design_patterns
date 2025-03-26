package CreationalPatterns.AbstractFactory.components.impl;

import CreationalPatterns.AbstractFactory.components.Button;

public class MacButton implements Button {
    private boolean isRendered = false;

    @Override
    public void onClick() {
        System.out.println(this.getClass().descriptorString() + "WindowsButton.onClick");
    }

    @Override
    public void render() {
        isRendered = true;
    }

    public boolean isRendered() {
        return isRendered;
    }
}
