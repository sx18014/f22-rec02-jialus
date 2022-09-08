package edu.cmu.cs.cs214.rec02;

import edu.cmu.cs.cs214.rec02.points.*;

public class Line {
    private PolarPoint point1;
    private PolarPoint point2;

    public Line(PolarPoint point1, PolarPoint point2) {
        this.point1 = point1;
        this.point2 = point2;
    }

    public void draw() {
        int x1 = point1.getX();
        int y1 = point1.getY();
        int x2 = point2.getX();
        int y2 = point2.getY();
        
        // assume implementation 

        System.out.println("Line drawn from (" + x1 + ", " + y1 +
                            ") to (" + x2 + ", " + y2 + ")");
    }
}
