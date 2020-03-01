package framework;

import java.util.Random;

public class De implements Comparable<De> {

    private int nbFace;
    private int current;

    public De(int nbFace){
        this.nbFace = nbFace;
    }

    @Override
    public int compareTo(De o) {

        if (o==null) {
            throw new IllegalArgumentException();
        }

        return o.getCurrent() - this.getCurrent();

    }

    public int getCurrent() {
        return current;
    }

    public void setFaceObtenue(int i) {
        this.current = i;
    }

    public void roll(){
        Random dRoller= new Random();
        this.current = dRoller.nextInt(nbFace)+1;
    }

}