package ss7_abstract_class_interface.interface_colorable.model;

public class Square implements InterfaceResizeable {

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides..");
    }
}

