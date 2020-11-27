package com.yujingzhou;

/**
 * http://c.biancheng.net/view/1351.html
 * 抽象工厂（AbstractFactory）模式的定义：是一种为访问类提供一个创建一组相关或相互依赖对象的接口，且访问类无须指定所要产品的具体类就能得到同族的不同等级的产品的模式结构。
 *
 * @author yubo
 */
interface AbstractFactory {
    Product1 newProduct1();

    Product2 newProduct2();
}

interface Product1 {
    void show();
}

interface Product2 {
    void show();
}

class ConcreteProduct11 implements Product1 {
    @Override
    public void show() {
        System.out.println("具体产品1显示...");
    }
}

class ConcreteProduct21 implements Product2 {
    @Override
    public void show() {
        System.out.println("具体产品2显示...");
    }
}

class ConcreteFactory1 implements AbstractFactory {

    @Override
    public Product1 newProduct1() {
        System.out.println("具体工厂 1 生成-->具体产品 11...");
        return new ConcreteProduct11();
    }

    @Override
    public Product2 newProduct2() {
        System.out.println("具体工厂 1 生成-->具体产品 21...");
        return new ConcreteProduct21();
    }
}
