package com.beerhouse.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContainerTests {

    @Test
    public void testShouldCreateContainer() {
        String type = "Bottle";
        String measure = "1L";
        Container container = Container.create(type, measure);

        assertEquals(type, container.type());
        assertEquals(measure, container.measure());
    }
}
