package view;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JPanel;

public class RoundedJPanel extends JPanel{
	protected int strokeSize = 2;
    protected Dimension arcs = new Dimension(10, 10);
    public RoundedJPanel() {
    	super();
    	setOpaque(false);
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int width = getWidth();
        int height = getHeight();
        Graphics2D graphics = (Graphics2D) g;
        //Draws the rounded opaque panel with borders.
        graphics.setColor(getBackground());
        graphics.fillRoundRect(0, 0, width,
        height, arcs.width, arcs.height);
//        graphics.setColor(getForeground());
        graphics.setColor(new Color(108, 113, 117));
        graphics.setStroke(new BasicStroke(strokeSize));
        graphics.drawRoundRect(0, 0, width,
        height, arcs.width, arcs.height);

        graphics.setStroke(new BasicStroke());
    }
}