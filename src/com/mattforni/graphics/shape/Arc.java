package com.mattforni.graphics.shape;

import javax.swing.JPanel;

import com.mattforni.graphics.Shape;

public class Arc extends Shape {

    // DEFAULT CONSTRUCTOR CREATES AN ARC WITH NO DIMENSIONS
    public Arc(final JPanel panel){
        super(panel, new java.awt.geom.Arc2D.Double(
                new java.awt.geom.Rectangle2D.Double(), 0, 0, 1));
    }

    // CONSTRUCTOR CREATES AN ARC AT GIVEN LOCATION(x,y) WITH SIZE(w,h)
    // A STARTING ANGLE start AND A STOPING ANGLE stop WITH TYPE type
    public Arc(final JPanel panel, final double x, double y,
            final double w, final double h,
            final double start, final double stop, final int type){
        super(panel, new java.awt.geom.Arc2D.Double(
                new java.awt.geom.Rectangle2D.Double(x, y, w, h), start, stop, type));
    }
}
