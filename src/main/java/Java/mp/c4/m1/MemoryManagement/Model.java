package Java.mp.c4.m1.MemoryManagement;

import java.util.Random;

public class Model {

    private Model parent;
    private Long  aLong;

    public Model(Model parent) {

        this.parent = parent;
        this.aLong = new Random().nextLong();
    }

    public Model getParent() {

        return parent;
    }

    public void setParent(Model parent) {

        this.parent = parent;
    }

    public Long getaLong() {

        return aLong;
    }

    public void setaLong(Long aLong) {

        this.aLong = aLong;
    }

    public long sumChildParent() {

        if (parent != null) {
            return parent.sumChildParent() + aLong;
        } else {
            return 0;
        }
    }
}
