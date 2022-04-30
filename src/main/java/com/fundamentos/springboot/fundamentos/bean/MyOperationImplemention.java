package com.fundamentos.springboot.fundamentos.bean;

public class MyOperationImplemention implements MyOperation
{

    @Override
    public int suma(int number) {
        return number+1;
    }
}
