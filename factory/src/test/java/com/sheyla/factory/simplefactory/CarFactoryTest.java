package com.sheyla.factory.simplefactory;

import com.sheyla.factory.Car;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

/**
 * CarFactory Tester.
 *
 * @author sheyla
 * @version 1.0
 * @since <pre>7,13, 2019</pre>
 */
public class CarFactoryTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: geCar(String name)
     */
    @Test
    public void testGeCar() throws Exception {
        CarFactory carFactory = new CarFactory();
        Car car = carFactory.geCar("BMW");
        System.out.println(car.getName());
    }


} 
