package Java.mp.c4.m1.MemoryManagement;

public class OutOfMemoryErrorRunner {

    /**
     * OutOfMemoryError -Xmx10M -XX:MaxPermSize=10M
     *
     * @param args
     * @throws InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {

        Model previousParent = null;
        while (true) {
            previousParent = new Model(previousParent);
        }
    }
}
