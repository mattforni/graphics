package com.mattforni.graphics.shape;

import com.mattforni.graphics.Shape;

public class RoundRect extends Shape{

    // DEFAULT CONSTRUCTOR CREATES A ROUND RECTANGLE WITH NO DIMENSIOSN
    public RoundRect(javax.swing.JPanel panel){
        super(panel, new java.awt.geom.RoundRectangle2D.Double());
    }

    // CREATES A ROUNDRECTANGLE WITH GIVEN LOCATION(x,y) SIZE(w,h)
    // AND ARCSIZE(arcw, arch)
    public RoundRect(javax.swing.JPanel panel, double x, double y, double w, double h, double arcw, double arch){
        super(panel, new java.awt.geom.RoundRectangle2D.Double(x, y, w, h, arcw, arch));
    }
}
