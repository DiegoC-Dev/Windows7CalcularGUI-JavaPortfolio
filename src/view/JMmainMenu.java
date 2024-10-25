package view;

import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

import utilities.Utilities;

public class JMmainMenu extends JMenuBar {
	private JMenu jmVer, jmEdicion,jmAyuda,jmiCalculos;
	private JMenuItem jmiEstandar,jmiCientifica,jmiProgramador,jmiEstadisticas,
	jmiHistorial,jmiDigitos,jmiBasicas,jmiConversion,jmiFecha,jmiHipoteca,
	jmiAlquiler,jmiCombustible1,jmiCombustible2,jmiCopiar,jmiPegar,jmiAyuda,jmiAcercaDe;

	public JMmainMenu() {
		setBackground(Utilities.mainColor());
		initCompoenents();
		
	}
	private void initCompoenents() {
		jmVer = new JMenu("Ver");
		this.add(jmVer);
		
			jmiEstandar = new JMenuItem("Estándar");
			jmiEstandar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1, InputEvent.CTRL_DOWN_MASK));
			jmVer.add(jmiEstandar);
			jmiCientifica = new JMenuItem("Cientifica");
			jmiCientifica.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_2, InputEvent.CTRL_DOWN_MASK));
			jmVer.add(jmiCientifica);
			jmiProgramador = new JMenuItem("Programador");
			jmiProgramador.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_3, InputEvent.CTRL_DOWN_MASK));
			jmVer.add(jmiProgramador);
			jmiEstadisticas = new JMenuItem("Estadísticas");
			jmiEstadisticas.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_4, InputEvent.CTRL_DOWN_MASK));
			jmVer.add(jmiEstadisticas);
			jmiHistorial = new JMenuItem("Historial");
			jmiHistorial.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_H, InputEvent.CTRL_DOWN_MASK));
			jmVer.add(jmiHistorial);
			jmiDigitos = new JMenuItem("Numero de dígitos en grupo");
			jmVer.add(jmiDigitos);
			jmiBasicas = new JMenuItem("Basicas");
			jmiBasicas.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F4, InputEvent.CTRL_DOWN_MASK));
			jmVer.add(jmiBasicas);
			jmiConversion = new JMenuItem("Conversión de unidades");
			jmiConversion.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_U, InputEvent.CTRL_DOWN_MASK));
			jmVer.add(jmiConversion);
			jmiFecha = new JMenuItem("Cálculo de fecha");
			jmiFecha.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, InputEvent.CTRL_DOWN_MASK));
			jmVer.add(jmiFecha);			
			jmiCalculos = new JMenu("Hojas de cálculo");
			jmVer.add(jmiCalculos);

				jmiHipoteca = new JMenuItem("Hipoteca");
				jmiCalculos.add(jmiHipoteca);
				jmiAlquiler = new JMenuItem("Alquiler de vehículos");
				jmiCalculos.add(jmiAlquiler);
				jmiCombustible1 = new JMenuItem("Consumo de combustible (mpg)");
				jmiCalculos.add(jmiCombustible1);
				jmiCombustible2 = new JMenuItem("Consumo de combustible (1/100 Km)");
				jmiCalculos.add(jmiCombustible2);			

			
		jmEdicion = new JMenu("Edicion");
		this.add(jmEdicion);
			
			jmiCopiar = new JMenuItem("Copiar");
			jmiCopiar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.CTRL_DOWN_MASK));
			jmEdicion.add(jmiCopiar);
			jmiPegar = new JMenuItem("Pegar");
			jmiPegar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, InputEvent.CTRL_DOWN_MASK));
			jmEdicion.add(jmiPegar);

		jmAyuda = new JMenu("Ayuda");
		this.add(jmAyuda);
		
			jmiAyuda = new JMenuItem("Ver la ayuda");
			jmiAyuda.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F1, InputEvent.CTRL_DOWN_MASK));
			jmAyuda.add(jmiAyuda);
			jmiAcercaDe = new JMenuItem("Acerda de Calculadora");
			jmAyuda.add(jmiAcercaDe);

	}
}