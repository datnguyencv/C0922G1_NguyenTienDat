package ss4_class_object.stop_watch;

public class MainStopWatch {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        System.out.println(stopWatch.getStartTime());
        demo();
        stopWatch.stop();
        System.out.println(stopWatch.getEndTime());
        System.out.println(stopWatch.getElapsedTime());
    }

    static void demo() {
        int demo = 0;
        for (int i = 0; i < 1000000000; i++) {
            for (int j = 0; j < 100000000; j++) {
                demo = i;
            }

        }
    }
}
