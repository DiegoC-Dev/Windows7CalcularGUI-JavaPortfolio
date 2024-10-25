package view;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JPanel;

import utilities.Utilities;

public class JPNorthPanel extends JPanel{
	JPanel jPNorthPanel;
	JPanel jPCenterPanel;
	JPanel jPSouthPanel;
	public JPNorthPanel() {
		setBackground(Utilities.mainColor());
		setLayout(new BorderLayout());
		setPreferredSize(new Dimension(10,10));
		initComponents();
	}
	private void initComponents() {
//		jPNorthPanel = new JPanel();
////		jPNorthPanel.setSize(10, 100);
//		jPNorthPanel.setBackground(Color.black);
//		this.add(jPNorthPanel,BorderLayout.NORTH);
//		
//		jPCenterPanel = new JPanel();
////		jPCenterPanel.setSize(50, 100);
//		jPCenterPanel.setLayout(new BorderLayout());
//		jPCenterPanel.setBackground(Color.yellow);
//
//			screen =  new JLabel("0"); 
//			screen.setBackground(Color.DARK_GRAY);
////			screen.setForeground(Color.white);
////			screen.setBorder(new bor);
//			jPCenterPanel.add(screen,BorderLayout.CENTER);
//			
//		this.add(jPCenterPanel,BorderLayout.CENTER);
//		
//		jPSouthPanel = new JPanel();
////		jPSouthPanel.setSize(30, 100);
//		jPSouthPanel.setBackground(Color.magenta);
//		this.add(jPSouthPanel,BorderLayout.SOUTH);
	}
}