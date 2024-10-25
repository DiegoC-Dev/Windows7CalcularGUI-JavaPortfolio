package view;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import javax.swing.JLabel;

public class JLabelGradient extends JLabel{
//	private String text;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public JLabelGradient(String text) {
//		this.text = text;
//		setText(text);
		setText("asdasdas");

		// TODO Auto-generated constructor stub
	}
	private Color color1 = new Color(229,239,251);
//	private Color color1 = Color.green;
	private Color color2 = Color.white;
//    private float x1=0;
//    private float y1=0;
//    private float x2=getWidth();
//    private float y2=getHeight();
    
	@Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();

        Rectangle clip = g2.getClipBounds();
//        float x=getWidth();
//        float y=getHeight();
        g2.setPaint(new GradientPaint(0.0f, 0.0f, color1,
                0.0f, getHeight(), color2));
        g2.fillRect(clip.x, clip.y, clip.width, clip.height);
    }
}
