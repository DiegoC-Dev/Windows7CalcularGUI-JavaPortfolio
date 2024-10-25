package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

import utilities.Utilities;

public class JPCNorthPanel extends JPanel{
	private static String [][] LABELS_CONTEN= {{"0000","0000","0000","0000","0000","0000","0000","0000"},
			{"63    ","","","","47    ","","","32    "},
			{"0000","0000","0000","0000","0000","0000","0000","0000"},
			{"31    ","","","","15    ","","","0     "}}; 
	
//	i==1 || i==3?"0000": i==2 && j==1?"63   ": i==2 && j==5?"47   ":
//		i==1 && j==8?"32   ": i==4 && j==1?"31   ": i==4 && j==5?"15   ": 
//		i==4 && j==8?"0   ":"");
	JPanelGradient jPNothPanel;
	JLabel screen;
//	JLabelGradient screen;
	JLabel jlabel0;
	JLabel jlabel1;
	Border margin;
//	RoundedJPanel roundedJPanel;
	JPanel roundedJPanel;
	JPanel jPCenterPanel;
	JPanel jPSouthPanel;
	public JPCNorthPanel() {
		setBackground(Color.blue);
		setLayout(new BorderLayout());
		setPreferredSize(new Dimension(0,120));
		initComponents();
	}
	private void initComponents() {
		// TODO Auto-generated method stub
		jPNothPanel = new JPanelGradient();
		jPNothPanel.setPreferredSize(new Dimension(0,55));
//		jPNothPanel.setLayout(new BorderLayout());
		jPNothPanel.setLayout(new GridLayout(1,2));
		jPNothPanel.setBackground(Utilities.mainColor());
		jPNothPanel.setBorder(new LineBorder(Utilities.mainColor(), Utilities.spacing()));
			
//			roundedJPanel = new RoundedJPanel();
			roundedJPanel = new JPanel();
			roundedJPanel.setBorder(new RoundedBorder(5));
			roundedJPanel.setOpaque(false);
			roundedJPanel.setLayout(new BorderLayout());
	//		jPPrueba.setPreferredSize(new Dimension(50,50));
	//		jPPrueba.setSize(50, 50);

//				screen =  new JLabelGradient("0     ");
				screen =  new JLabel("0 ");
				screen.setFont(Utilities.screenLetter());
//				screen.setForeground(i==1 || i==3?Utilities.blueLetter():Utilities.grayLetter());								
				screen.setHorizontalAlignment(SwingConstants.RIGHT);
				screen.setVerticalAlignment(SwingConstants.CENTER);
//				screen.setBackground(Color.DARK_GRAY);
//				jPNothPanel.add(screen,BorderLayout.CENTER);
//				jPPrueba.add(screen,BorderLayout.NORTH);
				roundedJPanel.add(screen);
		

			jPNothPanel.add(roundedJPanel,BorderLayout.CENTER);
			
		this.add(jPNothPanel,BorderLayout.NORTH);
		
//		jPCenterPanel = new JPanel();
//		jPCenterPanel.setPreferredSize(new Dimension(1,1));
//		jPCenterPanel.setBackground(Utilities.mainColor());
//		this.add(jPCenterPanel,BorderLayout.CENTER);
	
		jPCenterPanel = new JPanel();
		jPCenterPanel.setLayout(new BorderLayout());
		jPCenterPanel.setPreferredSize(new Dimension(0,40));
		jPCenterPanel.setBackground(Utilities.mainColor());
//		jPCenterPanel.setLayout(new GridLayout(4,8));
		jPCenterPanel.setLayout(new BorderLayout());
		jPCenterPanel.setBorder(new LineBorder(Utilities.mainColor(), Utilities.spacing()));
//		jPCenterPanel.setBorder(new LineBorder(Color.black, 1, true));
//		jPSouthPanel.setBorder();
//		margin.paintBorder(this, graphics, 50, 50, 200, 200);
		roundedJPanel = new RoundedJPanel();
//		roundedJPanel = new JPanel();
		roundedJPanel.setBackground(Utilities.mainColor());
//		roundedJPanel.setBackground(Color.magenta);
//			roundedJPanel.setBorder(new RoundedBorder(5));
//			roundedJPanel.setOpaque(false);
			roundedJPanel.setLayout(new GridLayout(4,8));
				for (int i = 1; i <= 4; i++) {
					for (int j = 1; j <= 8; j++) {
							jlabel1 = new JLabel();
//							jlabel1 = new JLabel(
//								i==1 || i==3?"0000": i==2 && j==1?"63   ": i==2 && j==5?"47   ":
//								i==1 && j==8?"32   ": i==4 && j==1?"31   ": i==4 && j==5?"15   ": 
//								i==4 && j==8?"0   ":"");
							jlabel1.setText(""+LABELS_CONTEN[i-1][j-1]);
							jlabel1.setFont(Utilities.smallLetter());
							jlabel1.setForeground(i==1 || i==3?Utilities.blueLetter():Utilities.grayLetter());								
//							jlabel1.setForeground(Utilities.blueLetter());

	//						jlabel1.setHorizontalAlignment(i==4 && j==8?SwingConstants.RIGHT:SwingConstants.CENTER);
							jlabel1.setHorizontalAlignment(SwingConstants.CENTER);
							jlabel1.setVerticalAlignment(SwingConstants.NORTH);
//							jPCenterPanel.add(jlabel1);
							roundedJPanel.add(jlabel1);
					}
				}
				jPCenterPanel.add(roundedJPanel,BorderLayout.CENTER);
		this.add(jPCenterPanel,BorderLayout.CENTER);
	}
//	private void makemargin() {
//		// TODO Auto-generated method stub
//		margin = new Border() {
//			
//			@Override
//			public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
//				g.
//			}
//			
//			@Override
//			public boolean isBorderOpaque() {
//				// TODO Auto-generated method stub
//				return false;
//			}
//			
//			@Override
//			public Insets getBorderInsets(Component c) {
//				// TODO Auto-generated method stub
//				return null;
//			}
//		};
//	}
}
