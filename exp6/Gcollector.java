package exp6;

public class Gcollector {

    public Gcollector() {
        System.out.println("Object created!");
    }

    public void performTask() {
        System.out.println("Task performed!");
    }

    public static void main(String[] args) {
        Gcollector obj = new Gcollector();
        obj.performTask();
        obj = null;
        System.gc();
        System.out.println("End of the program");
    }

    @Override
    protected void finalize() {
        System.out.println("Object is garbage collected");
    }
}
