package controller;

import java.awt.BorderLayout;
import java.awt.Component;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.metal.DefaultMetalTheme;
import javax.swing.plaf.metal.MetalLookAndFeel;
import javax.swing.plaf.metal.OceanTheme;

import view.JFmainFrame;

public class Control {
	private JFmainFrame jFmainFrame;
	
	public Control() {
		initLookAndFeel();
		jFmainFrame = new JFmainFrame();
	}
	private void initLookAndFeel() {
//		String lookAndFeel = "javax.swing.plaf.nimbus.NimbusLookAndFeel";
		String lookAndFeel = "javax.swing.plaf.metal.MetalLookAndFeel";
//		String lookAndFeel = "javax.swing.plaf.synth.SynthLookAndFeel";
//		String lookAndFeel = "com.sun.java.swing.plaf.windows.WindowsLookAndFeel";
//		String lookAndFeel = "com.sun.java.swing.plaf.motif.MotifLookAndFeel";
//		String lookAndFeel = UIManager.getCrossPlatformLookAndFeelClassName();
//		String lookAndFeel = "com.sun.java.swing.plaf.gtk.GTKLookAndFeel";
		
        try {
//        	MetalLookAndFeel.setCurrentTheme(new OceanTheme());
//        	MetalLookAndFeel.setCurrentTheme(new DefaultMetalTheme());
        	UIManager.setLookAndFeel(lookAndFeel);

		} catch (Exception e) {
			// TODO: handle exception
		}
        JFrame.setDefaultLookAndFeelDecorated(true);
    }
	private void initLookAndFeel2() {
//		# Swing properties

//		swing.defaultlaf=com.sun.java.swing.plaf.windows.WindowsLookAndFeel
//		swing.defaultlaf = com.sun.java.swing.plaf.windows.WindowsLookAndFeel;
	}

}
