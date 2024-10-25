package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import utilities.Utilities;


public class JFmainFrame extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPNorthPanel jPnorthPanel;
	private JPCenterPanel jPcenterPanel;
	private JPSouthPanel jPsouthPanel;
	private JPWestPanel jPWestPanel;
	private JPEastPanel jPEastPanel;
//	private JButton jLargeButton;
 	private JPanel jPmainPanel;
	
	public JFmainFrame() {
//		setSize(700, 20+200+150+150);
		setSize(428, 380);
//		setFont(Utilities.smallLetter());
		setTitle("Calculator ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Image icon = new ImageIcon(getClass().getResource("/images/CalculatorIcon2.png")).getImage();
		setIconImage(icon);
		setLayout(new BorderLayout());
		initialComponents();
//		jLargeButton = new JButton();
//		jLargeButton.setBackground(Color.red);
//		jLargeButton.setBounds(10, 10, 20, 20);
//		pack();
		setVisible(true);
	}

	private void initialComponents() {
		setJMenuBar(new JMmainMenu());
		
		jPmainPanel = new JPanel();
		jPmainPanel.setLayout(new BorderLayout());
//		jPmainPanel.setBackground(Color.yellow);
//		jPmainPanel.setSize(700, 500);
		
			jPWestPanel = new JPWestPanel();
			jPEastPanel = new JPEastPanel();
			jPnorthPanel = new JPNorthPanel();
			jPsouthPanel = new JPSouthPanel();
			jPcenterPanel = new JPCenterPanel();
			jPmainPanel.add(jPWestPanel,BorderLayout.WEST);
			jPmainPanel.add(jPEastPanel ,BorderLayout.EAST);
			jPmainPanel.add(jPnorthPanel,BorderLayout.NORTH);
			jPmainPanel.add(jPcenterPanel,BorderLayout.CENTER);
			jPmainPanel.add(jPsouthPanel,BorderLayout.SOUTH);
			
		add(jPmainPanel,BorderLayout.CENTER);
	}

}
