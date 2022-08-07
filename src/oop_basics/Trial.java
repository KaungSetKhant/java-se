package oop_basics;

public interface Trial {
    void firstName ();
}

interface Trial2
{
    void lastName();
}

 class Child implements Trial,Trial2
{

    @Override
    public void firstName() {

    }

    @Override
    public void lastName() {

    }
}
