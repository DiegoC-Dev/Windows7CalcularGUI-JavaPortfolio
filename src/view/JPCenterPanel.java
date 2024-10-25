package view;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JPanel;

public class JPCenterPanel extends JPanel{
	JPCNorthPanel jpcNorthPanel;
	JPCCenterPanel jpcCenterPanel;
	JPCSouthPanel jpcSouthPanel;
	public JPCenterPanel() {
		setBackground(Color.red);
		setLayout(new BorderLayout());
		initComponents();
		
	}
	private void initComponents() {
		jpcNorthPanel = new JPCNorthPanel();
		this.add(jpcNorthPanel,BorderLayout.NORTH);
		jpcCenterPanel = new JPCCenterPanel();
		this.add(jpcCenterPanel,BorderLayout.CENTER);
		jpcSouthPanel = new JPCSouthPanel();
		this.add(jpcSouthPanel,BorderLayout.SOUTH);
	}

}
