package com.sheyla.factory;

import com.sheyla.factory.Car;

/**
 * @Author: sheyla
 * @Date:Create：in 2019/7/13 18:23
 * @Modified By：
 * @Description:
 */
public class BMWCar implements Car {
    @Override
    public String getName() {
        return "BMW";
    }
}
