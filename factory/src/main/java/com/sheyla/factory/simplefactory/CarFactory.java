package com.sheyla.factory.simplefactory;

import com.sheyla.factory.BMWCar;
import com.sheyla.factory.BenzCar;
import com.sheyla.factory.Car;

/**
 * @Author: sheyla
 * @Date:Create：in 2019/7/13 19:05
 * @Modified By：
 * @Description:
 */
public class CarFactory {

    public Car geCar(String name) {
        if ("BMW".equals(name)) {
            return new BMWCar();
        } else if ("beaz".equals(name)) {
            return new BenzCar();
        }
        return null;
    }
}
