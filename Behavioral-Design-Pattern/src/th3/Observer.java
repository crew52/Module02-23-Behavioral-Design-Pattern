package th3;

abstract class Observer {
    protected Subject subject;
    public abstract void update();
}