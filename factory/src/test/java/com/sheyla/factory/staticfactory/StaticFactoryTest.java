package com.sheyla.factory.staticfactory;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

/**
 * StaticFactory Tester.
 *
 * @author sheyla
 * @version 1.0
 * @since <pre>07/13/2019</pre>
 */
public class StaticFactoryTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: getCar(String name)
     */
    @Test
    public void testGetCar() throws Exception {
        StaticFactory staticFactory=new StaticFactory();
        System.out.println(staticFactory.geCar("BMW").getName());

    }


} 
