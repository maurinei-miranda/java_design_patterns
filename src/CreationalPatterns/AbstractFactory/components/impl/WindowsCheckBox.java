package CreationalPatterns.AbstractFactory.components.impl;

import CreationalPatterns.AbstractFactory.components.CheckBox;

public class WindowsCheckBox implements CheckBox {

    private boolean checked;
    private boolean isRendered;

    @Override
    public void render() {
        isRendered = true;
    }

    @Override
    public void enable() {
        if (!isRendered) {
            System.out.println("Component is not rendered");
            return;
        }
        checked = !checked;
    }

    @Override
    public boolean getStatus() {
        return checked;
    }
}
