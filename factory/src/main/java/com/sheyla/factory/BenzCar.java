package com.sheyla.factory;

import com.sheyla.factory.Car;

/**
 * @Author: sheyla
 * @Date:Create：in 2019/7/13 18:24
 * @Modified By：
 * @Description:
 */
public class BenzCar implements Car {
    @Override
    public String getName() {
        return "Benz";
    }
}
