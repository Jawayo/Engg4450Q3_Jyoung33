package com.jwetherell.algorithms.mathematics.test;

import org.junit.Test;


import com.jwetherell.algorithms.mathematics.Division;

import static org.junit.Assert.assertEquals;



public class DivisonTest{

    
    String tes = "Division by zero";

    @Test
    public void testDivision() throws Exception{
        long te = Division.division(6, 3);
        assertEquals(2,te);
        long a = Division.divisionUsingLogs(6, 3);
        assertEquals(2,a);
        long b = Division.divisionUsingLoop(6,3);
        assertEquals(2,b);
        long c = Division.divisionUsingMultiplication(6,3);
        assertEquals(2,c);
        long d = Division.divisionUsingRecursion(6,3);
        assertEquals(2,d);
        long e = Division.divisionUsingShift(6,3);
        assertEquals(2,e);
        te = Division.division(6, 0);
        assertEquals(tes,te);
        a = Division.divisionUsingLogs(6, 0);
        assertEquals(tes,a);
        b = Division.divisionUsingLoop(6,0);
        assertEquals(tes,b);
        c = Division.divisionUsingMultiplication(6,0);
        assertEquals(tes,c);
        d = Division.divisionUsingRecursion(6,0);
        assertEquals(tes,d);
        e = Division.divisionUsingShift(6,0);
        assertEquals(tes,e);
        
    }




}