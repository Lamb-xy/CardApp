import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle;
/*
 * Created by JFormDesigner on Tue Jun 28 21:37:50 CST 2022
 */



/**
 * @author Brainrain
 */
public class 注册界面 extends JFrame {
	public 注册界面() {
		initComponents();
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		label1 = new JLabel();
		label2 = new JLabel();
		label3 = new JLabel();
		textField1 = new JTextField();
		passwordField1 = new JPasswordField();
		button1 = new JButton();

		//======== this ========
		setTitle("\u6ce8\u518c\u754c\u9762");
		setBackground(new Color(204, 204, 204));
		Container contentPane = getContentPane();

		//---- label1 ----
		label1.setText("\u6ce8\u518c");
		label1.setFont(new Font("\u5fae\u8f6f\u96c5\u9ed1", Font.PLAIN, 26));
		label1.setForeground(new Color(153, 153, 255));

		//---- label2 ----
		label2.setText("\u8d26\u6237\u540d\uff1a");

		//---- label3 ----
		label3.setText("\u53e3\u4ee4\uff1a");

		//---- button1 ----
		button1.setText("\u786e\u5b9a");

		GroupLayout contentPaneLayout = new GroupLayout(contentPane);
		contentPane.setLayout(contentPaneLayout);
		contentPaneLayout.setHorizontalGroup(
			contentPaneLayout.createParallelGroup()
				.addGroup(contentPaneLayout.createSequentialGroup()
					.addGroup(contentPaneLayout.createParallelGroup()
						.addGroup(contentPaneLayout.createSequentialGroup()
							.addGap(211, 211, 211)
							.addComponent(label1))
						.addGroup(contentPaneLayout.createSequentialGroup()
							.addGap(50, 50, 50)
							.addGroup(contentPaneLayout.createParallelGroup()
								.addComponent(label2)
								.addComponent(label3))
							.addGap(21, 21, 21)
							.addGroup(contentPaneLayout.createParallelGroup()
								.addComponent(textField1, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE)
								.addComponent(passwordField1, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)))
						.addGroup(contentPaneLayout.createSequentialGroup()
							.addGap(146, 146, 146)
							.addComponent(button1)))
					.addContainerGap(232, Short.MAX_VALUE))
		);
		contentPaneLayout.setVerticalGroup(
			contentPaneLayout.createParallelGroup()
				.addGroup(contentPaneLayout.createSequentialGroup()
					.addGap(25, 25, 25)
					.addComponent(label1)
					.addGap(26, 26, 26)
					.addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(label2)
						.addComponent(textField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGroup(contentPaneLayout.createParallelGroup()
						.addGroup(contentPaneLayout.createSequentialGroup()
							.addGap(24, 24, 24)
							.addComponent(label3))
						.addGroup(contentPaneLayout.createSequentialGroup()
							.addGap(32, 32, 32)
							.addComponent(passwordField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
					.addComponent(button1)
					.addGap(39, 39, 39))
		);
		pack();
		setLocationRelativeTo(getOwner());
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	private JLabel label1;
	private JLabel label2;
	private JLabel label3;
	private JTextField textField1;
	private JPasswordField passwordField1;
	private JButton button1;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
