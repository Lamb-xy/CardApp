import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout;
/*
 * Created by JFormDesigner on Tue Jun 28 21:47:29 CST 2022
 */



/**
 * @author Brainrain
 */
public class 更改口令界面 extends JFrame {
	public 更改口令界面() {
		initComponents();
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		label1 = new JLabel();
		label2 = new JLabel();
		label3 = new JLabel();
		textField1 = new JTextField();
		label4 = new JLabel();
		label5 = new JLabel();
		passwordField1 = new JPasswordField();
		passwordField2 = new JPasswordField();
		button3 = new JButton();
		button2 = new JButton();
		label6 = new JLabel();
		toggleButton1 = new JToggleButton();
		dialog1 = new JDialog();
		label7 = new JLabel();

		//======== this ========
		setTitle("ChangePasswordInterface");
		Container contentPane = getContentPane();

		//---- label2 ----
		label2.setText("\u8bf7\u7acb\u5373\u66f4\u6539\u53e3\u4ee4");

		//---- label3 ----
		label3.setText("\u8d26\u6237\u540d:");

		//---- textField1 ----
		textField1.setText("\u5c0f\u9f99");
		textField1.setEnabled(false);

		//---- label4 ----
		label4.setText("\u8bf7\u8f93\u5165\u65b0\u53e3\u4ee4\uff1a");

		//---- label5 ----
		label5.setText("\u8bf7\u6838\u5bf9\u65b0\u53e3\u4ee4\uff1a");

		//---- button3 ----
		button3.setText("\u786e\u8ba4");
		button3.setFont(new Font("\u6977\u4f53", Font.PLAIN, 20));

		//---- button2 ----
		button2.setText("\u53d6\u6d88");
		button2.setFont(new Font("\u6977\u4f53", Font.PLAIN, 20));

		//---- toggleButton1 ----
		toggleButton1.setText("60s");

		GroupLayout contentPaneLayout = new GroupLayout(contentPane);
		contentPane.setLayout(contentPaneLayout);
		contentPaneLayout.setHorizontalGroup(
			contentPaneLayout.createParallelGroup()
				.addGroup(contentPaneLayout.createSequentialGroup()
					.addGroup(contentPaneLayout.createParallelGroup()
						.addGroup(contentPaneLayout.createSequentialGroup()
							.addGap(172, 172, 172)
							.addComponent(label1))
						.addGroup(contentPaneLayout.createSequentialGroup()
							.addGap(67, 67, 67)
							.addGroup(contentPaneLayout.createParallelGroup()
								.addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
									.addComponent(label4)
									.addComponent(label5))
								.addComponent(label3)
								.addComponent(label6)
								.addComponent(toggleButton1))
							.addGap(57, 57, 57)
							.addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
								.addGroup(contentPaneLayout.createSequentialGroup()
									.addComponent(button3)
									.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(button2))
								.addGroup(contentPaneLayout.createParallelGroup()
									.addComponent(textField1, GroupLayout.PREFERRED_SIZE, 201, GroupLayout.PREFERRED_SIZE)
									.addComponent(label2)
									.addComponent(passwordField1, GroupLayout.PREFERRED_SIZE, 201, GroupLayout.PREFERRED_SIZE)
									.addComponent(passwordField2, GroupLayout.PREFERRED_SIZE, 201, GroupLayout.PREFERRED_SIZE)))))
					.addContainerGap(68, Short.MAX_VALUE))
		);
		contentPaneLayout.setVerticalGroup(
			contentPaneLayout.createParallelGroup()
				.addGroup(contentPaneLayout.createSequentialGroup()
					.addGap(22, 22, 22)
					.addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
						.addComponent(label2)
						.addComponent(label1))
					.addGap(47, 47, 47)
					.addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(textField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label3))
					.addGap(30, 30, 30)
					.addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(passwordField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label4))
					.addGap(31, 31, 31)
					.addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(passwordField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label5))
					.addGap(33, 33, 33)
					.addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(button2)
						.addComponent(button3)
						.addComponent(label6)
						.addComponent(toggleButton1))
					.addContainerGap(50, Short.MAX_VALUE))
		);
		pack();
		setLocationRelativeTo(getOwner());

		//======== dialog1 ========
		{
			Container dialog1ContentPane = dialog1.getContentPane();

			//---- label7 ----
			label7.setText("\u53e3\u4ee4\u66f4\u6539\u6210\u529f");

			GroupLayout dialog1ContentPaneLayout = new GroupLayout(dialog1ContentPane);
			dialog1ContentPane.setLayout(dialog1ContentPaneLayout);
			dialog1ContentPaneLayout.setHorizontalGroup(
				dialog1ContentPaneLayout.createParallelGroup()
					.addGroup(GroupLayout.Alignment.TRAILING, dialog1ContentPaneLayout.createSequentialGroup()
						.addContainerGap(80, Short.MAX_VALUE)
						.addComponent(label7)
						.addGap(78, 78, 78))
			);
			dialog1ContentPaneLayout.setVerticalGroup(
				dialog1ContentPaneLayout.createParallelGroup()
					.addGroup(dialog1ContentPaneLayout.createSequentialGroup()
						.addGap(55, 55, 55)
						.addComponent(label7)
						.addContainerGap(75, Short.MAX_VALUE))
			);
			dialog1.pack();
			dialog1.setLocationRelativeTo(dialog1.getOwner());
		}
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	private JLabel label1;
	private JLabel label2;
	private JLabel label3;
	private JTextField textField1;
	private JLabel label4;
	private JLabel label5;
	private JPasswordField passwordField1;
	private JPasswordField passwordField2;
	private JButton button3;
	private JButton button2;
	private JLabel label6;
	private JToggleButton toggleButton1;
	private JDialog dialog1;
	private JLabel label7;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
