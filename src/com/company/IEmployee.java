package com.company;

public interface IEmployee {
    public void accept(IVisitor visitor);
    public void getInfo();
}
