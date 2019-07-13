package com.sheyla.factory.staticfactory;

import com.sheyla.factory.BMWCar;
import com.sheyla.factory.BenzCar;
import com.sheyla.factory.Car;

/**
 * @Author: sheyla
 * @Date:Create：in 2019/7/13 20:24
 * @Modified By：
 * @Description:
 */
public class StaticFactory {

    public Car geCar(String name) {
        if ("BMW".equals(name)) {
            return BMWFactory.getCar();
        } else if ("beaz".equals(name)) {
            return BeazFactory.getCar();
        }
        return null;
    }
}
