package ss7_abstract_class_interface.interface_resizeable.resizeable;

import ss7_abstract_class_interface.interface_resizeable.model.Circle;
import ss7_abstract_class_interface.interface_resizeable.model.Square;
import ss7_abstract_class_interface.interface_resizeable.model.Shape;
import ss7_abstract_class_interface.interface_resizeable.model.Rectangle;
import java.util.Random;

public class MainResizeable {
    public static void main(String[] args) {
        resizeable();

    }

    public static void resizeable() {

        Rectangle r1 = new Rectangle("red", true, 10, 10);
        Square s1 = new Square("red", true, 10);
        Shape c1 = new Circle("red", true, 10);
        Random random = new Random();
        System.out.printf("Tăng: %.2f (phần trăm )\n",new Random().nextDouble()*100);
        r1.resizeable(random.nextDouble());
        s1.resizeable(random.nextDouble());
        c1.resizeable(random.nextDouble());

        Shape[] box = new Shape[]{r1, s1, c1};
        for (int i = 0; i < box.length; i++) {
            System.out.println(box[i]);
        }
    }

}
