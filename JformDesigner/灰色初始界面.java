import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout;
/*
 * Created by JFormDesigner on Tue Jun 28 21:33:27 CST 2022
 */



/**
 * @author Brainrain
 */
public class 灰色初始界面 extends JFrame {
	public 灰色初始界面() {
		initComponents();
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		label1 = new JLabel();

		//======== this ========
		setTitle("\u4e3b\u754c\u9762");
		setBackground(new Color(204, 204, 204));
		Container contentPane = getContentPane();

		//---- label1 ----
		label1.setText("\u6b22\u8fce\u4f7f\u7528\u540d\u7247\u518c");
		label1.setFont(new Font("\u5b8b\u4f53", Font.PLAIN, 24));
		label1.setForeground(new Color(153, 153, 255));

		GroupLayout contentPaneLayout = new GroupLayout(contentPane);
		contentPane.setLayout(contentPaneLayout);
		contentPaneLayout.setHorizontalGroup(
			contentPaneLayout.createParallelGroup()
				.addGroup(contentPaneLayout.createSequentialGroup()
					.addGap(160, 160, 160)
					.addComponent(label1)
					.addContainerGap(170, Short.MAX_VALUE))
		);
		contentPaneLayout.setVerticalGroup(
			contentPaneLayout.createParallelGroup()
				.addGroup(contentPaneLayout.createSequentialGroup()
					.addGap(91, 91, 91)
					.addComponent(label1, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(202, Short.MAX_VALUE))
		);
		pack();
		setLocationRelativeTo(getOwner());
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	private JLabel label1;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
