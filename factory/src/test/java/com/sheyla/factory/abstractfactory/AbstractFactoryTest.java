package com.sheyla.factory.abstractfactory;

import com.sheyla.factory.Car;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

/**
 * AbstractFactory Tester.
 *
 * @author sheyla
 * @version 1.0
 * @since <pre>07/13/2019</pre>
 */
public class AbstractFactoryTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: gerCar()
     */
    @Test
    public void testGerCar() throws Exception {
        DefaultFactory defaultFactory = new DefaultFactory();
        System.out.println(defaultFactory.getCar("beanz").getName());

    }

    /**
     * Method: geCar(String name)
     */
    @Test
    public void testGeCar() throws Exception {
//TODO: Test goes here... 
    }


} 
