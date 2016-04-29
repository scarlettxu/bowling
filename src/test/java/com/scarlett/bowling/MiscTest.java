package com.scarlett.bowling;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Calendar;

import static org.junit.Assert.*;

/**
 * Created by scarlettxu on 16-4-6.
 */
public class MiscTest {
    double a[]= new double[11];
    double x= 2;
    @Before
    public void setUp() throws Exception {
        for (int i=0;i<=10;i++){
            a[i]=i;
        }
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testPrintN1() throws Exception {
        long ms1 = Calendar.getInstance().getTimeInMillis();

        Misc.printN1(10000);
        long ms2 = Calendar.getInstance().getTimeInMillis();
        System.out.println();
        System.out.println(ms2-ms1);
    }

    @Test
    public void testPrintN2() throws Exception {
        long ms1 = Calendar.getInstance().getTimeInMillis();
        Misc.printN2(100000);
        long ms2 = Calendar.getInstance().getTimeInMillis();
        System.out.println();
        System.out.println(ms2-ms1);

    }

    @Test
    public void testPlus1() throws Exception {
        long ms1 = Calendar.getInstance().getTimeInMillis();
        for (int i=0;i<10000;i++){
        double result = Misc.plus1(10,a,x);}
//        System.out.printf("%f",result);
        long ms2 = Calendar.getInstance().getTimeInMillis();
        System.out.println();
        System.out.println(ms2-ms1);

    }

    @Test
    public void testPlus2() throws Exception {
        long ms1 = Calendar.getInstance().getTimeInMillis();
        for (int i=0;i<10000;i++){
        double result = Misc.plus2(10,a,x);}
//        System.out.printf("%f",result);
        long ms2 = Calendar.getInstance().getTimeInMillis();
        System.out.println();
        System.out.println(ms2-ms1);

    }

    @Test
    public void testMaxSubseqSum() throws Exception {
        int[] a = new int[8];
        a[0]=-1;
        a[1]=3;
        a[2]=-2;
        a[3]=4;
        a[4]=-6;
        a[5]=1;
        a[6]=6;
        a[7]=-1;

        Misc.maxSubseqSum(a,8);
    }

}