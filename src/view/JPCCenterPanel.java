package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.LineBorder;

import utilities.Utilities;

public class JPCCenterPanel extends JPanel{
	private static String [] RADIO_BUTTONS_CONTEN= {"Hex","Dec","Oct","Bin"};
	private static String [][] BUTTONS_CONTEN= {{"","Mod","A","MC","MR","MS","M+","M-"},
			{"(",")","B","BS","CE","C","+-","r"},
			{"RoR","RoL","C","7","8","9","/","%"}}; 
	private JPanel jPWestPanel;
	private JPanel jPCenterPanel;
	private JRadioButton jRadioButton;
//	private RoundedJPanel roundedJPanel;
	private JPanel roundedJPanel;
	private JButton jButton;
//	private RoundedJButton jButton;
	private JPanel jPanelAux;

	public JPCCenterPanel() {
		setPreferredSize(new Dimension(0,200));
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
//			jRadioButton = new JRadioButton(i==1?"Hex": i==2?"Dec": i==3?"Oct": "Bin");
			jRadioButton.setFont(Utilities.mediumLetter());
			jRadioButton.setForeground(Utilities.blueLetter());								
			jRadioButton.setOpaque(false);
			roundedJPanel.add(jRadioButton);
		}
		jPWestPanel.add(roundedJPanel,BorderLayout.CENTER);
		
		this.add(jPWestPanel,BorderLayout.WEST);
		
		jPCenterPanel = new JPanel();
//		jPCenterPanel.setBackground(Color.black);
		jPCenterPanel.setBackground(Utilities.mainColor());
//		jPCenterPanel.setLayout(new BorderLayout());
		jPCenterPanel.setLayout(new GridLayout(3,7));
//		jPCenterPanel.setBorder(new LineBorder(Utilities.mainColor(), Utilities.spacing()));

		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 8; j++) {
				jPanelAux = new JPanel();
				jPanelAux.setLayout(new BorderLayout());
				jPanelAux.setBackground(Utilities.mainColor());
//				jPanelAux.setBackground(Color.magenta);
				jPanelAux.setBorder(new LineBorder(Utilities.mainColor(), Utilities.spacing()));
//				jPanelAux.setBorder(new LineBorder(Utilities.mainColor(), Utilities.spacing2()));
					jButton = new JButton(); 
					jButton.setFont(Utilities.smallLetter());
	//				jButton.setFont(Utilities.bigLetter());
					jButton.setForeground(Utilities.blueLetter());
	//				jButton.setForeground(Color.blue.darker());
					jButton.setText(""+BUTTONS_CONTEN[i-1][j-1]);
					if(i==1 && j==1 || i==3 && j==4 || i==3 && j==5 ||i==3 && j==6) {
						jButton.setBackground(Utilities.whaitColor());
					}
					if(i==1 && j==3 || i==2 && j==3 || i==3 && j==3 || i==1 && j==4 ||
							i==1 && j==5 ||i==1 && j==6 ||i==1 && j==7 ||i==1 && j==8 ||
							i==2 && j==8 ||i==3 && j==8) {
						jButton.setBackground(Utilities.mainColor());
					}
					if(i==1 && j==3 || i==2 && j==3 || i==3 && j==3 || 
							i==3 && j==4 || i==3 && j==5 ||i==3 && j==6) {
						jButton.setFont(Utilities.bigLetter());
					}
					if( i==1 && j==4 ||i==1 && j==5 ||i==1 && j==6 ||
							i==1 && j==7 ||i==1 && j==8) {
						jButton.setFont(Utilities.smallLetter());
					}
					jButton.setBorder(new RoundedBorder(5));
				jPanelAux.add(jButton,BorderLayout.CENTER);		
			jPCenterPanel.add(jPanelAux);		
			}
		}
		this.add(jPCenterPanel,null);	
		this.add(jPCenterPanel,BorderLayout.CENTER);		
	}
}
