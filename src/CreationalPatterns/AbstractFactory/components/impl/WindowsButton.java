package CreationalPatterns.AbstractFactory.components.impl;

import CreationalPatterns.AbstractFactory.components.Button;

public class WindowsButton implements Button {

    private boolean isRendered = false;

    @Override
    public void render() {
        isRendered = true;
    }

    @Override
    public void onClick() {
        System.out.println("WindowsButton.onClick");
    }

    public boolean isRendered() {
        return isRendered;
    }
}
