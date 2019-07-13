package com.sheyla.factory.abstractfactory;

import com.sheyla.factory.BMWCar;
import com.sheyla.factory.BenzCar;
import com.sheyla.factory.Car;
import com.sheyla.factory.factoryy.BMWFactory;
import com.sheyla.factory.factoryy.BeazFactory;

/**
 * @Author: sheyla
 * @Date:Create：in 2019/7/13 20:13
 * @Modified By：
 * @Description:抽象工厂
 */
public abstract class AbstractFactory {
    abstract Car getCar();

    public Car getCar(String name) {
        if ("BMW".equals(name)) {
            return new BMWFactory().getCar();
        } else if ("beanz".equals(name)) {
            return new BeazFactory().getCar();
        } else {
            System.out.println("不是可以创建的类");
            return null;

        }
    }
}
