package com.javarush.task.task18.task1811;

public class DecoratorMyRunnableImpl implements Runnable {
    private Runnable components;

    public DecoratorMyRunnableImpl(Solution.RunnableImpl components) {
        this.components = components;
    }

    @Override
    public void run() {
        System.out.print("DecoratorMyRunnableImpl body ");
        components.run();
    }
}
