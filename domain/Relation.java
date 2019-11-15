package domain;

import java.io.Serializable;

public class Relation<KeyType> implements Serializable
{
    public KeyType kA;
    public KeyType kB;
    /*private String keyA;
    private String keyB;*/

    public Relation(KeyType kA, KeyType kB)
    {
        this.kA=kA;
        this.kB=kB;
    }

    public KeyType getkA() {
        return kA;
    }

    public void setkA(KeyType kA) {
        this.kA = kA;
    }

    public KeyType getkB() {
        return kB;
    }

    public void setkB(KeyType kB) {
        this.kB = kB;
    }

    @Override
    public String toString()
    {
        return this.kA + "," + this.kB;
    }
}
