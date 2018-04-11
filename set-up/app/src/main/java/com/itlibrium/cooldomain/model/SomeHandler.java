package com.itlibrium.cooldomain.model;

public class SomeHandler
{
    public void handle(SomeCommand command)
    {
        Dog dog = new Dog();
        dog.takeOrder(command.getOrder());
    }
}
