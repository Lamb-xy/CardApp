import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle;
/*
 * Created by JFormDesigner on Tue Jun 28 21:37:41 CST 2022
 */



/**
 * @author Brainrain
 */
public class 登录界面 extends JFrame {
	public 登录界面() {
		initComponents();
	}

	private void register(MouseEvent e) {
		// TODO add your code here
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		label2 = new JLabel();
		label3 = new JLabel();
		textField1 = new JTextField();
		button2 = new JButton();
		button3 = new JButton();
		label4 = new JLabel();
		label5 = new JLabel();
		label6 = new JLabel();
		passwordField1 = new JPasswordField();
		label7 = new JLabel();
		textField2 = new JTextField();
		dialog1 = new JDialog();
		label8 = new JLabel();
		dialog2 = new JDialog();
		label9 = new JLabel();

		//======== this ========
		setTitle("\u8bf7\u767b\u5f55\u540d\u7247\u518c\u7cfb\u7edf");
		setBackground(new Color(204, 204, 204));
		Container contentPane = getContentPane();

		//---- label2 ----
		label2.setText("\u8d26\u6237\u540d\uff1a");
		label2.setFont(new Font("\u5fae\u8f6f\u96c5\u9ed1", Font.PLAIN, 20));

		//---- label3 ----
		label3.setText("\u8d26\u6237\u53e3\u4ee4\uff1a");
		label3.setFont(new Font("\u5fae\u8f6f\u96c5\u9ed1", Font.PLAIN, 20));

		//---- button2 ----
		button2.setText("\u53d6\u6d88");
		button2.setFont(new Font("\u6977\u4f53", Font.PLAIN, 20));

		//---- button3 ----
		button3.setText("\u786e\u8ba4");
		button3.setFont(new Font("\u6977\u4f53", Font.PLAIN, 20));

		//---- label4 ----
		label4.setText("\u8fd8\u6ca1\u8d26\u53f7\uff1f");
		label4.setForeground(new Color(51, 153, 255));
		label4.setFont(new Font("\u5fae\u8f6f\u96c5\u9ed1", Font.PLAIN, 15));
		label4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				register(e);
			}
		});

		//---- label5 ----
		label5.setText("\u5fd8\u4e86\u53e3\u4ee4\uff1f");
		label5.setForeground(new Color(51, 153, 255));
		label5.setFont(new Font("\u5fae\u8f6f\u96c5\u9ed1", Font.PLAIN, 15));

		//---- label6 ----
		label6.setText("\u767b\u5f55");
		label6.setFont(new Font("\u5fae\u8f6f\u96c5\u9ed1", Font.PLAIN, 26));
		label6.setForeground(new Color(153, 153, 255));

		//---- label7 ----
		label7.setText("\u9a8c\u8bc1\u7801\uff1a");
		label7.setFont(new Font("\u5fae\u8f6f\u96c5\u9ed1", Font.PLAIN, 20));

		GroupLayout contentPaneLayout = new GroupLayout(contentPane);
		contentPane.setLayout(contentPaneLayout);
		contentPaneLayout.setHorizontalGroup(
			contentPaneLayout.createParallelGroup()
				.addGroup(contentPaneLayout.createSequentialGroup()
					.addGroup(contentPaneLayout.createParallelGroup()
						.addGroup(contentPaneLayout.createSequentialGroup()
							.addGap(210, 210, 210)
							.addComponent(label6))
						.addGroup(contentPaneLayout.createSequentialGroup()
							.addGap(73, 73, 73)
							.addGroup(contentPaneLayout.createParallelGroup()
								.addGroup(contentPaneLayout.createSequentialGroup()
									.addComponent(label4)
									.addGap(196, 196, 196)
									.addComponent(label5))
								.addGroup(contentPaneLayout.createSequentialGroup()
									.addGap(41, 41, 41)
									.addComponent(button3)
									.addGap(110, 110, 110)
									.addComponent(button2))))
						.addGroup(contentPaneLayout.createSequentialGroup()
							.addGap(46, 46, 46)
							.addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
								.addGroup(contentPaneLayout.createSequentialGroup()
									.addComponent(label2)
									.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(textField1, GroupLayout.PREFERRED_SIZE, 229, GroupLayout.PREFERRED_SIZE))
								.addGroup(GroupLayout.Alignment.LEADING, contentPaneLayout.createSequentialGroup()
									.addComponent(label3)
									.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
									.addComponent(passwordField1, GroupLayout.PREFERRED_SIZE, 229, GroupLayout.PREFERRED_SIZE))
								.addGroup(GroupLayout.Alignment.LEADING, contentPaneLayout.createSequentialGroup()
									.addComponent(label7)
									.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(textField2, GroupLayout.PREFERRED_SIZE, 229, GroupLayout.PREFERRED_SIZE)))))
					.addContainerGap(79, Short.MAX_VALUE))
		);
		contentPaneLayout.setVerticalGroup(
			contentPaneLayout.createParallelGroup()
				.addGroup(contentPaneLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(label6)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
					.addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(textField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label2))
					.addGap(27, 27, 27)
					.addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(label3)
						.addComponent(passwordField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18, 18, 18)
					.addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(label7)
						.addComponent(textField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(20, 20, 20)
					.addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(button2)
						.addComponent(button3))
					.addGap(55, 55, 55)
					.addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(label4)
						.addComponent(label5))
					.addContainerGap())
		);
		pack();
		setLocationRelativeTo(getOwner());

		//======== dialog1 ========
		{
			Container dialog1ContentPane = dialog1.getContentPane();

			//---- label8 ----
			label8.setText("\u8d26\u6237\u540d\u6216\u53e3\u4ee4\uff0c\u6216\u9a8c\u8bc1\u7801\u9519\uff1f");

			GroupLayout dialog1ContentPaneLayout = new GroupLayout(dialog1ContentPane);
			dialog1ContentPane.setLayout(dialog1ContentPaneLayout);
			dialog1ContentPaneLayout.setHorizontalGroup(
				dialog1ContentPaneLayout.createParallelGroup()
					.addGroup(dialog1ContentPaneLayout.createSequentialGroup()
						.addGap(30, 30, 30)
						.addComponent(label8)
						.addContainerGap(23, Short.MAX_VALUE))
			);
			dialog1ContentPaneLayout.setVerticalGroup(
				dialog1ContentPaneLayout.createParallelGroup()
					.addGroup(dialog1ContentPaneLayout.createSequentialGroup()
						.addGap(53, 53, 53)
						.addComponent(label8)
						.addContainerGap(65, Short.MAX_VALUE))
			);
			dialog1.pack();
			dialog1.setLocationRelativeTo(dialog1.getOwner());
		}

		//======== dialog2 ========
		{
			Container dialog2ContentPane = dialog2.getContentPane();

			//---- label9 ----
			label9.setText("\u5df2\u53d1\u9001\u65b0\u53e3\u4ee4\u5230\u4f60\u7684\u7535\u5b50\u90ae\u7bb1\uff0c\u8bf7\u95ee\u4ed6\u57285\u5206\u949f\u5185\u91cd\u65b0\u767b\u5f55\u5e76\u4fee\u6539\u53e3\u4ee4\uff0c\u8d85\u65f6\u65e0\u6548");

			GroupLayout dialog2ContentPaneLayout = new GroupLayout(dialog2ContentPane);
			dialog2ContentPane.setLayout(dialog2ContentPaneLayout);
			dialog2ContentPaneLayout.setHorizontalGroup(
				dialog2ContentPaneLayout.createParallelGroup()
					.addGroup(dialog2ContentPaneLayout.createSequentialGroup()
						.addGap(59, 59, 59)
						.addComponent(label9)
						.addContainerGap(63, Short.MAX_VALUE))
			);
			dialog2ContentPaneLayout.setVerticalGroup(
				dialog2ContentPaneLayout.createParallelGroup()
					.addGroup(dialog2ContentPaneLayout.createSequentialGroup()
						.addGap(34, 34, 34)
						.addComponent(label9)
						.addContainerGap(84, Short.MAX_VALUE))
			);
			dialog2.pack();
			dialog2.setLocationRelativeTo(dialog2.getOwner());
		}
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	private JLabel label2;
	private JLabel label3;
	private JTextField textField1;
	private JButton button2;
	private JButton button3;
	private JLabel label4;
	private JLabel label5;
	private JLabel label6;
	private JPasswordField passwordField1;
	private JLabel label7;
	private JTextField textField2;
	private JDialog dialog1;
	private JLabel label8;
	private JDialog dialog2;
	private JLabel label9;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
