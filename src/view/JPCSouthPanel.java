package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.LineBorder;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter.DEFAULT;

import utilities.Utilities;

public class JPCSouthPanel extends JPanel{
	private static String [] RADIO_BUTTONS_CONTEN= {"Qword","Dword","Word","Byte"};
	private static String [][] BUTTONS_CONTEN_CENTER= {{"Or","Xor","D","4","5","6","*"},
			{"Lsh","Rsh","E","1","2","3","-"}}; 
	private static String [] BUTTONS_CONTEN_SOUTH= {"Not","And","F","0",".","+"}; 
	private static String [] BUTTONS_CONTEN_EATS= {"1/x","="}; 

	private JPanel jPWestPanel;
	private JPanel jPCenterPanel;
	private JPanel jPCCenterPanel;
	private JPanel jPEastPanel;
	private JPanel jPCSouthPanel;
	private JRadioButton jRadioButton;
//	private RoundedJPanel roundedJPanel;
	private JPanel roundedJPanel;
	private JButton jButton;
//	private RoundedJButton jButton;
	private JPanel jPanelAux;
	private JPanel jPanelAuxNorth;
	private JPanel jPanelAuxCenter;
	private JPanel jPanelAuxWest;
	private JPanel jPanelAuxEast;
	public JPCSouthPanel() {
		setPreferredSize(new Dimension(0,95));
		setLayout(new BorderLayout());
		setBackground(Utilities.mainColor());
		initComponents();
	}
	private void initComponents() {
		jPWestPanel = new JPanel();
		jPWestPanel.setLayout(new BorderLayout());
		jPWestPanel.setBackground(Utilities.mainColor());
		jPWestPanel.setPreferredSize(new Dimension(80,100));
		jPWestPanel.setBorder(new LineBorder(Utilities.mainColor(), Utilities.spacing()));
//			roundedJPanel = new RoundedJPanel();
			roundedJPanel = new JPanel();
			roundedJPanel.setBorder(new RoundedBorder(5));
			roundedJPanel.setOpaque(false);
			roundedJPanel.setLayout(new GridLayout(4,1));
				for (int i = 1; i <= 4; i++) {
					jRadioButton = new JRadioButton();
					jRadioButton.setText(RADIO_BUTTONS_CONTEN[i-1]);
//					jRadioButton = new JRadioButton(i==1?"Qword": i==2?"Dword": i==3?"Word": "Byte");
					jRadioButton.setFont(Utilities.mediumLetter());
					jRadioButton.setForeground(Utilities.blueLetter());								
					jRadioButton.setOpaque(false);
					roundedJPanel.add(jRadioButton);
				}
			jPWestPanel.add(roundedJPanel,BorderLayout.CENTER);		
		this.add(jPWestPanel,BorderLayout.WEST);
		
		jPCenterPanel = new JPanel();
		jPCenterPanel.setBackground(Color.RED);
		jPCenterPanel.setPreferredSize(new Dimension(315,88));
		jPCenterPanel.setLayout(new BorderLayout());
//		jPCenterPanel.setBorder(new LineBorder(Utilities.mainColor(), Utilities.spacing()));
////////////////////////////////////////////////////////////////terminar	
			jPCCenterPanel = new JPanel();
			jPCCenterPanel.setLayout(new GridLayout(2,7));
			jPCCenterPanel.setBackground(Utilities.mainColor());
			for (int i = 1; i <= 2; i++) {
				for (int j = 1; j <= 7; j++) {
					jPanelAux = new JPanel();
					jPanelAux.setLayout(new BorderLayout());
					jPanelAux.setBackground(Utilities.mainColor());
					jPanelAux.setBorder(new LineBorder(Utilities.mainColor(), Utilities.spacing()));
					jButton = new JButton();
					jButton.setFont(Utilities.smallLetter());
					jButton.setForeground(Utilities.blueLetter());								

					if(j==4 || j==5 || j==6) {
						jButton.setBackground(Utilities.whaitColor());
						jButton.setFont(Utilities.bigLetter());
							
					}
					if(i==1 && j==3 || i==2 && j==3) {
						jButton.setBackground(Utilities.mainColor());
						jButton.setFont(Utilities.bigLetter());
					}
					jButton.setText(BUTTONS_CONTEN_CENTER[i-1][j-1]);
//							jButton = new RoundedJButton();
					jButton.setBorder(new RoundedBorder(5));
					jPanelAux.add(jButton,BorderLayout.CENTER);		
					jPCCenterPanel.add(jPanelAux);		
				}
			}
			jPCenterPanel.add(jPCCenterPanel,BorderLayout.CENTER);
			
			jPCSouthPanel = new JPanel();
			jPCSouthPanel.setBackground(Utilities.mainColor());
			jPCSouthPanel.setLayout(new BorderLayout());
			jPCSouthPanel.setPreferredSize(new Dimension(0,96/3));
				jPanelAuxWest  = new JPanel();
				jPanelAuxWest.setBackground(Utilities.mainColor());
				jPanelAuxWest.setLayout(new GridLayout());
				jPanelAuxWest.setPreferredSize(new Dimension(3*322/8,0));
//				jPanelAuxWest.setBorder(new LineBorder(Utilities.mainColor(), Utilities.spacing()));
				for (int i = 1; i <= 3; i++) {
					jPanelAux = new JPanel();
					jPanelAux.setLayout(new BorderLayout());
					jPanelAux.setBackground(Utilities.mainColor());
					jPanelAux.setBorder(new LineBorder(Utilities.mainColor(), Utilities.spacing()));
//					jPanelAux.setBorder(new RoundedBorder(5));
					jButton = new JButton();
					jButton.setFont(Utilities.smallLetter());
					jButton.setForeground(Utilities.blueLetter());								
					if(i==3) {
						jButton.setFont(Utilities.bigLetter());
						jButton.setBackground(Utilities.mainColor());
					}
					jButton.setText(""+BUTTONS_CONTEN_SOUTH[i-1]);
//					jButton.setBackground(Utilities.mainColor());
					jButton.setBorder(new RoundedBorder(5));
					jPanelAux.add(jButton,BorderLayout.CENTER);
					
					jPanelAuxWest.add(jPanelAux,BorderLayout.WEST);
					
				}
					
				jPCSouthPanel.add(jPanelAuxWest,BorderLayout.WEST);

				jPanelAuxCenter = new JPanel();
				jPanelAuxCenter.setBackground(Color.red);
//				jPanelAuxCenter.setBackground(Utilities.mainColor());
				jPanelAuxCenter.setLayout(new BorderLayout());
				jPanelAuxCenter.setPreferredSize(new Dimension(0,89/3));
				jPanelAuxCenter.setBorder(new LineBorder(Utilities.mainColor(), Utilities.spacing()));

						jButton = new JButton();
						jButton.setFont(Utilities.bigLetter());
						jButton.setForeground(Utilities.blueLetter());								
						jButton.setText(BUTTONS_CONTEN_SOUTH[3]);
						jButton.setBackground(Utilities.whaitColor());
						jButton.setBorder(new RoundedBorder(5));
						jPanelAuxCenter.add(jButton,BorderLayout.CENTER);
				
				jPCSouthPanel.add(jPanelAuxCenter,BorderLayout.CENTER);
				
				jPanelAuxEast = new JPanel();
				jPanelAuxEast.setBackground(Utilities.mainColor());
//				jPanelAuxEast.setBackground(Color.magenta);
				jPanelAuxEast.setLayout(new GridLayout());
				jPanelAuxEast.setPreferredSize(new Dimension(2*326/8, 0));
				for (int i = 1; i <= 2; i++) {
					jPanelAux = new JPanel();
					jPanelAux.setLayout(new BorderLayout());
//					jPanelAux.setBackground(Utilities.mainColor());
					jPanelAux.setBorder(new LineBorder(Utilities.mainColor(), Utilities.spacing()));
//					jPanelAux.setBorder(new RoundedBorder(5));
					jButton = new JButton();
					jButton.setFont(Utilities.smallLetter());
					jButton.setForeground(Utilities.blueLetter());								
					jButton.setText(BUTTONS_CONTEN_SOUTH[i+3]);
					if(i==1) {
						jButton.setBackground(Utilities.mainColor());
					}
					jButton.setBorder(new RoundedBorder(5));
					jPanelAux.add(jButton);
					
					jPanelAuxEast.add(jPanelAux,BorderLayout.CENTER);
					
				}
				jPCSouthPanel.add(jPanelAuxEast,BorderLayout.EAST);
				
			jPCenterPanel.add(jPCSouthPanel,BorderLayout.SOUTH);


		this.add(jPCenterPanel,BorderLayout.CENTER);
		
		jPEastPanel = new JPanel();
//		jPEastPanel.setLayout(new GridLayout(3,1));
		jPEastPanel.setLayout(new BorderLayout());
//		jPEastPanel.setBackground(Color.blue);
		jPEastPanel.setBackground(Utilities.mainColor());
//		jPEastPanel.setBorder(new LineBorder(Utilities.mainColor(), Utilities.spacing()));
		jPEastPanel.setPreferredSize(new Dimension(332/8,0));
			jPanelAux = new JPanel();
			jPanelAux.setLayout(new BorderLayout());
//			jPanelAux.setPreferredSize(new Dimension(4000,1000));
			jPanelAux.setBackground(Utilities.mainColor());
//			jPanelAux.setBackground(Color.magenta);
//			jPanelAux.setBorder(new LineBorder(Utilities.mainColor(), Utilities.spacing()));
			
				jPanelAuxNorth = new JPanel();
//				jPanelAuxNorth.setBackground(Color.black);
				jPanelAuxNorth.setLayout(new BorderLayout());
				jPanelAuxNorth.setPreferredSize(new Dimension(0,96/3));
				jPanelAuxNorth.setBorder(new LineBorder(Utilities.mainColor(), Utilities.spacing()));

					jButton = new JButton();
					jButton.setFont(Utilities.mediumLetter());
					jButton.setForeground(Utilities.blueLetter());								
					jButton.setText(BUTTONS_CONTEN_EATS[0]);
					jButton.setBackground(Utilities.mainColor());
					jButton.setBorder(new RoundedBorder(5));
					jPanelAuxNorth.add(jButton,BorderLayout.CENTER);
					
				jPanelAux.add(jPanelAuxNorth,BorderLayout.NORTH);		

				jPanelAuxCenter = new JPanel();
//				jPanelAuxNorth.setBackground(Color.black);
				jPanelAuxCenter.setLayout(new BorderLayout());
				jPanelAuxCenter.setPreferredSize(new Dimension(0,33));
				jPanelAuxCenter.setBorder(new LineBorder(Utilities.mainColor(), Utilities.spacing()));

					jButton = new JButton();
					jButton.setFont(Utilities.veryLargeLetter());
					jButton.setForeground(Utilities.blueLetter());								
					jButton.setText(BUTTONS_CONTEN_EATS[1]);
//					jButton.setBackground(Utilities.mainColor());
					jButton.setBorder(new RoundedBorder(5));
					jPanelAuxCenter.add(jButton,BorderLayout.CENTER);
					
				jPanelAux.add(jPanelAuxCenter,BorderLayout.CENTER);		

			jPEastPanel.add(jPanelAux,BorderLayout.CENTER);		

		this.add(jPEastPanel,BorderLayout.EAST);
	}
}
