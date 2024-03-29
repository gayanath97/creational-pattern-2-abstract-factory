package Application;

import button.Button;
import checkbox.Checkbox;
import factory.GUIFactory;

public class Application {

    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }
    public void paint() {
        button.paint();
        checkbox.paint();
    }

}
