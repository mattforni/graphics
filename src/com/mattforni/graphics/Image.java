package com.mattforni.graphics;

import java.awt.*;

import javax.swing.*;

public class Image extends Shape {
        private java.awt.Image _awtImg;
        private JPanel _jPanel;
        public Image(String filename, JPanel jp) {
            super(jp, new java.awt.geom.Rectangle2D.Double());
            _jPanel = jp;
            _awtImg = jp.getToolkit().createImage(filename);
            MediaTracker mediaTracker = new MediaTracker(jp);
            mediaTracker.addImage(_awtImg, 0);
            try { // try loading the image
                mediaTracker.waitForAll();
            } catch (Exception e) { // something happened
                if (mediaTracker.isErrorAny()) {
                    return; // bail out
                }
            }
        }

        public Image(String filename, JPanel jp, int x, int y, int w, int h) {
            super(jp, new java.awt.geom.Rectangle2D.Double(x, y, w, h));
            _jPanel = jp;
            _awtImg = jp.getToolkit().createImage(filename);
            MediaTracker mediaTracker = new MediaTracker(jp);
            mediaTracker.addImage(_awtImg, 0);
            try { // try loading the image
                mediaTracker.waitForAll();
            } catch (Exception e) { // something happened
                if (mediaTracker.isErrorAny()) {
                    return; // bail out
                }
            }
        }

        public void paint (Graphics2D brush) {
            double rot = getRotation() * Math.PI / 180.0;
            brush.rotate(rot, (int)getX()+40, (int)getY()+50);
            brush.drawImage(_awtImg, (int)getX(), (int)getY(), _jPanel);
            brush.rotate(-rot, (int)getX()+40, (int)getY()+50);
        }
}
