package com.sheyla.factory.staticfactory;

import com.sheyla.factory.BMWCar;
import com.sheyla.factory.Car;
import com.sheyla.factory.factoryy.Factory;

/**
 * @Author: sheyla
 * @Date:Create：in 2019/7/13 19:26
 * @Modified By：
 * @Description:
 */
public class BMWFactory {
    public static Car getCar() {
        return new BMWCar();
    }
}
