package Java.mp.c4.m1.MemoryManagement;

public class StackOverflowErrorRunner {

    /**
     * StackOverflowError --Xss228k
     * 
     * @param args
     */
    public static void main(String[] args) {

        Model previousParent = null;
        while (true) {
            previousParent = new Model(previousParent);
            previousParent.sumChildParent();
        }
    }
}
