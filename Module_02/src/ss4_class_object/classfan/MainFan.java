package ss4_class_object.classfan;

public class MainFan {
    public static void main(String[] args) {
        Fan fan = new Fan();
        System.out.println("Original fan: " + fan);

        Fan fan1 = new Fan(Fan.FAST, true, 10, "Yellow");
        System.out.println("Before: " + fan1);
        fan1.setColor("Black");
        fan1.setSpeed(Fan.SLOW);
        fan1.setRadius(5);
        System.out.println("After: " + fan1);

        Fan fan2 = new Fan(Fan.MEDIUM, false, 5, "Blue");
        System.out.println("Before: " + fan2);
        fan2.setOn(true);
        fan2.setSpeed(Fan.FAST);
        fan2.setRadius(10);
        System.out.println("After: " + fan2);
    }
}

