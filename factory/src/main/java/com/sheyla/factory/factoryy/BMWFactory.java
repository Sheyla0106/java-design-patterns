package com.sheyla.factory.factoryy;

import com.sheyla.factory.BMWCar;
import com.sheyla.factory.Car;

/**
 * @Author: sheyla
 * @Date:Create：in 2019/7/13 19:26
 * @Modified By：
 * @Description:
 */
public class BMWFactory implements Factory {
    @Override
    public Car getCar() {
        return new BMWCar();
    }
}
