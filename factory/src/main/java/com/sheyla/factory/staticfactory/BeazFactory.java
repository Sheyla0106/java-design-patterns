package com.sheyla.factory.staticfactory;

import com.sheyla.factory.BenzCar;
import com.sheyla.factory.Car;
import com.sheyla.factory.factoryy.Factory;

/**
 * @Author: sheyla
 * @Date:Create：in 2019/7/13 19:27
 * @Modified By：
 * @Description:
 */
public class BeazFactory {
    public static Car getCar() {
        return new BenzCar();
    }
}
