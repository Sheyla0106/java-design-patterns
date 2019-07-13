package com.sheyla.factory.abstractfactory;

import com.sheyla.factory.BMWCar;
import com.sheyla.factory.Car;

/**
 * @Author: sheyla
 * @Date:Create：in 2019/7/13 20:17
 * @Modified By：
 * @Description:默认的抽象工厂
 */
public class DefaultFactory extends AbstractFactory {
    @Override
    Car getCar() {
        return new BMWCar();
    }
}
