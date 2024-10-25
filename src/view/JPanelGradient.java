package view;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LinearGradientPaint;
import java.awt.Rectangle;
import javax.swing.JPanel;


/**
 *
 * @author Edisoncor
 */
public class JPanelGradient extends JPanel{

//	private Color color1 = new Color(0x666f7f);
//	private Color color2 = new Color(0x262d3d);
//	private Color color1 = Color.blue;
	private Color color1 = new Color(229,239,251);
	private Color color2 = Color.white;
//    private float x1=0;
//    private float y1=0;
//    private float x2=getWidth();
//    private float y2=getHeight();

    public JPanelGradient() {
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();

        Rectangle clip = g2.getClipBounds();
        
        g2.setPaint(new GradientPaint(0.0f, 0.0f, color1,
                0.0f, getHeight(), color2));
        g2.fillRect(clip.x, clip.y, clip.width, clip.height);
    }
}

