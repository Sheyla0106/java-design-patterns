package com.sheyla.factory.factoryy;

import com.sheyla.factory.BenzCar;
import com.sheyla.factory.Car;

/**
 * @Author: sheyla
 * @Date:Create：in 2019/7/13 19:27
 * @Modified By：
 * @Description:
 */
public class BeazFactory implements Factory {
    @Override
    public Car getCar() {
        return new BenzCar();
    }
}
