package CreationalPatterns.AbstractFactory.components.impl;

import CreationalPatterns.AbstractFactory.components.CheckBox;

public class MacCheckBox implements CheckBox {
    private boolean checked;
    private boolean isRendered = false;

    @Override
    public void render() {
        isRendered = true;
    }

    @Override
    public void enable() {
        this.checked = !checked;
    }

    @Override
    public boolean getStatus() {
        return checked;
    }

    public boolean isRendered() {
        return isRendered;
    }
}
