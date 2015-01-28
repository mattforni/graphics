package com.mattforni.graphics;

import java.awt.*;
import javax.swing.*;

public class ColorText {
      private final String text;
      private final JPanel panel;
      private final Font font;
      private final Point position;
      private final Color color;
      private final Dimension size;

      public ColorText (final String text, final JPanel p,
              final int x, final int y) {
          this.text = text;
          this.panel = p;
          this.font = new Font("SansSerif", Font.PLAIN, 20);
          this.position = new Point(x, y);
          this.color = java.awt.Color.red;
          this.size = getSize();
      }
  
      public final void paint(final Graphics2D brush) {
          brush.setColor(color);
          brush.setFont(font);
          brush.drawString(text, position.x, position.y);
      }

      public final int getCenterX() {
          return (size.width/2) + position.x;
      }

      public final int getCenterY() {
          return (size.height/2) + position.y;
      }

      private Dimension getSize() {
          final FontMetrics metrics = panel.getFontMetrics(font);
          return new Dimension(metrics.stringWidth(text), metrics.getHeight());
      }
}