package com.fundamentos.springboot.fundamentos.bean;

public class MyWithDependencyImplement implements MyBeanWithDependency{

    private MyOperation myOperation;

    public MyWithDependencyImplement(MyOperation myOperation) {
        this.myOperation = myOperation;
    }

    @Override
    public void printWithDependency() {
        int numero=1;
        System.out.println(myOperation.suma(numero));
        System.out.println("Hola desde la implementacion de un bean con dependencia");
    }
}
