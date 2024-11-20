package com.jwetherell.algorithms.mathematics.test;

import org.junit.Test;

import com.jwetherell.algorithms.mathematics.Distance;

import static org.junit.Assert.assertEquals;

import java.lang.Math;

public class DistanceTest{

    long[] p1 = {0,0};
    long[] p2 = {3,2};
    double x1 = 5;
    double y1 = 0;
    double x2 = 6;
    double y2 = 3;
    double eud = Math.sqrt(10);

    @Test
    public void testDistance() throws Exception{
        long te = Distance.chebyshevDistance(p1,p2);
        assertEquals(3,te);
        double a = Distance.squaredDistance(x1,y1,x2,y2);
        assertEquals(10,a);
        double b = Distance.euclideanDistance(x1, y1, x2, y2);
        assertEquals(eud,b);

    }




}