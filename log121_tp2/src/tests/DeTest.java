package tests;

import framework.De;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class DeTest {

    private De de1;
    private De de2;

    @Before
    public void faireAvant(){
        de1 = new De(6);
        de2 = new De(6);
    }

    @Test
    public void deSuperieurTest(){
        de1.setFaceObtenue(4);
        de2.setFaceObtenue(5);
        Assert.assertTrue(de1.compareTo(de2) > 0);
    }

    @Test
    public void deInferieurTest(){
        de1.setFaceObtenue(4);
        de2.setFaceObtenue(5);
        Assert.assertTrue(de2.compareTo(de1) < 0);
    }

    @Test
    public void memeDeTest(){
        de1.setFaceObtenue(4);
        Assert.assertTrue(de1.compareTo(de1)==0);
    }

    @Test
    public void rollDeTest(){
        de1.roll();
        Assert.assertTrue(de1.getCurrent() > 0);
    }

    @Test(expected=IllegalArgumentException.class)
    public void deNullTest(){
        de1.setFaceObtenue(4);
        de1.compareTo(null);
    }


}