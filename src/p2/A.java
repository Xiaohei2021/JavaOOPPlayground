package p2;

public class A {
    public int v1 = 20; // Can be inherited and accessed by all
    protected int v2 = 50; //can be inherited and accessed by subclass
    int v3 = 35; // package private: can be accessed or inherited by class in the same package
    private int v4 = 99; //can only be accessed from their own class


}
