import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle;
/*
 * Created by JFormDesigner on Tue Jun 28 23:10:43 CST 2022
 */



/**
 * @author Brainrain
 */
public class µÇÂ¼ºó²Ëµ¥Ò³ extends JFrame {
	public µÇÂ¼ºó²Ëµ¥Ò³() {
		initComponents();
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		popupMenu3 = new JPopupMenu();
		menu7 = new JMenu();
		menuItem8 = new JMenuItem();
		menuItem9 = new JMenuItem();
		menu8 = new JMenu();
		menuItem10 = new JMenuItem();
		menu6 = new JMenu();
		menuItem5 = new JMenuItem();
		menuItem6 = new JMenuItem();
		menuItem7 = new JMenuItem();
		label13 = new JLabel();
		panel1 = new JPanel();
		frame1 = new JFrame();
		label1 = new JLabel();
		textField1 = new JTextField();
		textField2 = new JTextField();
		label2 = new JLabel();
		textField3 = new JTextField();
		label3 = new JLabel();
		textField4 = new JTextField();
		label4 = new JLabel();
		label5 = new JLabel();
		textField6 = new JTextField();
		label6 = new JLabel();
		textField7 = new JTextField();
		label7 = new JLabel();
		textField8 = new JTextField();
		label8 = new JLabel();
		textField9 = new JTextField();
		label9 = new JLabel();
		textField10 = new JTextField();
		label10 = new JLabel();
		textField11 = new JTextField();
		label11 = new JLabel();
		button3 = new JButton();
		textField5 = new JTextField();
		dialog1 = new JDialog();
		label12 = new JLabel();

		//======== this ========
		Container contentPane = getContentPane();

		//======== popupMenu3 ========
		{

			//======== menu7 ========
			{
				menu7.setText("\u5171\u4eab");

				//---- menuItem8 ----
				menuItem8.setText("\u540d\u7247\u5171\u4eab");
				menu7.add(menuItem8);

				//---- menuItem9 ----
				menuItem9.setText("\u540d\u7247\u5939\u5171\u4eab");
				menu7.add(menuItem9);

				//======== menu8 ========
				{
					menu8.setText("\u5bfc\u51fa");

					//---- menuItem10 ----
					menuItem10.setText("\u5bfc\u51fa\u5230\u6587\u4ef6");
					menu8.add(menuItem10);
				}
				menu7.add(menu8);
			}
			popupMenu3.add(menu7);
		}

		//======== menu6 ========
		{
			menu6.setText("\u65b0\u589e");

			//---- menuItem5 ----
			menuItem5.setText("\u9010\u7247\u65b0\u589e");
			menu6.add(menuItem5);
			menu6.addSeparator();

			//---- menuItem6 ----
			menuItem6.setText("\u6279\u91cf\u65b0\u589e");
			menu6.add(menuItem6);
			menu6.addSeparator();

			//---- menuItem7 ----
			menuItem7.setText("\u6279\u91cf\u5bfc\u5165");
			menu6.add(menuItem7);
		}

		//---- label13 ----
		label13.setText("\u6b22\u8fce\u4f7f\u7528\u540d\u7247\u518c");
		label13.setFont(new Font("\u5b8b\u4f53", Font.PLAIN, 24));
		label13.setForeground(new Color(153, 153, 255));

		//======== panel1 ========
		{
			panel1.setBackground(new Color(246, 234, 227));

			GroupLayout panel1Layout = new GroupLayout(panel1);
			panel1.setLayout(panel1Layout);
			panel1Layout.setHorizontalGroup(
				panel1Layout.createParallelGroup()
					.addGap(0, 394, Short.MAX_VALUE)
			);
			panel1Layout.setVerticalGroup(
				panel1Layout.createParallelGroup()
					.addGap(0, 275, Short.MAX_VALUE)
			);
		}

		GroupLayout contentPaneLayout = new GroupLayout(contentPane);
		contentPane.setLayout(contentPaneLayout);
		contentPaneLayout.setHorizontalGroup(
			contentPaneLayout.createParallelGroup()
				.addGroup(contentPaneLayout.createSequentialGroup()
					.addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
						.addComponent(popupMenu3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(menu6, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGroup(contentPaneLayout.createParallelGroup()
						.addGroup(contentPaneLayout.createSequentialGroup()
							.addGap(82, 82, 82)
							.addComponent(label13))
						.addGroup(contentPaneLayout.createSequentialGroup()
							.addGap(6, 6, 6)
							.addComponent(panel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		contentPaneLayout.setVerticalGroup(
			contentPaneLayout.createParallelGroup()
				.addGroup(contentPaneLayout.createSequentialGroup()
					.addGap(8, 8, 8)
					.addGroup(contentPaneLayout.createParallelGroup()
						.addGroup(contentPaneLayout.createSequentialGroup()
							.addGap(0, 0, Short.MAX_VALUE)
							.addComponent(label13, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addComponent(panel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(contentPaneLayout.createSequentialGroup()
							.addComponent(menu6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addComponent(popupMenu3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())))
		);
		pack();
		setLocationRelativeTo(getOwner());

		//======== frame1 ========
		{
			frame1.setTitle("\u6211\u7684\u540d\u7247\u5939");
			Container frame1ContentPane = frame1.getContentPane();

			//---- label1 ----
			label1.setText("\u59d3\u540d\uff1a");

			//---- label2 ----
			label2.setText("\u673a\u6784\u540d\u79f0\uff1a");

			//---- label3 ----
			label3.setText("\u5934\u8854\uff1a");

			//---- label4 ----
			label4.setText("\u673a\u6784\u804c\u52a1\uff1a");

			//---- label5 ----
			label5.setText("\u6027\u522b\uff1a");

			//---- label6 ----
			label6.setText("\u5934\u50cf\uff1a");

			//---- label7 ----
			label7.setText("\u5e74\u9f84\uff1a");

			//---- label8 ----
			label8.setText("\u673a\u6784\u5730\u5740\uff1a");

			//---- label9 ----
			label9.setText("\u8054\u7cfb\u7535\u8bdd\uff1a");

			//---- label10 ----
			label10.setText("\u7535\u5b50\u793e\u4ea4\u53f7\uff1a");

			//---- label11 ----
			label11.setText("\u7535\u5b50\u90ae\u7bb1\uff1a");

			//---- button3 ----
			button3.setText("\u786e\u5b9a");
			button3.setFont(new Font("\u6977\u4f53", Font.PLAIN, 20));

			GroupLayout frame1ContentPaneLayout = new GroupLayout(frame1ContentPane);
			frame1ContentPane.setLayout(frame1ContentPaneLayout);
			frame1ContentPaneLayout.setHorizontalGroup(
				frame1ContentPaneLayout.createParallelGroup()
					.addGroup(frame1ContentPaneLayout.createSequentialGroup()
						.addGap(79, 79, 79)
						.addGroup(frame1ContentPaneLayout.createParallelGroup()
							.addComponent(label2)
							.addComponent(label4)
							.addComponent(label3)
							.addComponent(label6)
							.addComponent(label5)
							.addComponent(label7)
							.addComponent(label1)
							.addComponent(label8)
							.addComponent(label9))
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
						.addGroup(frame1ContentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
							.addComponent(textField1, GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
							.addComponent(textField7, GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
							.addComponent(textField5, GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
							.addComponent(textField4, GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
							.addComponent(textField2, GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
							.addComponent(textField3, GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
							.addComponent(textField6, GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
							.addComponent(textField8, GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
							.addComponent(textField9, GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE))
						.addGap(146, 146, 146))
					.addGroup(frame1ContentPaneLayout.createSequentialGroup()
						.addGroup(frame1ContentPaneLayout.createParallelGroup()
							.addGroup(frame1ContentPaneLayout.createSequentialGroup()
								.addGap(78, 78, 78)
								.addGroup(frame1ContentPaneLayout.createParallelGroup()
									.addComponent(label11)
									.addComponent(label10))
								.addGap(53, 53, 53)
								.addGroup(frame1ContentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
									.addComponent(textField11, GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
									.addComponent(textField10, GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)))
							.addGroup(frame1ContentPaneLayout.createSequentialGroup()
								.addGap(191, 191, 191)
								.addComponent(button3)))
						.addContainerGap(146, Short.MAX_VALUE))
			);
			frame1ContentPaneLayout.setVerticalGroup(
				frame1ContentPaneLayout.createParallelGroup()
					.addGroup(frame1ContentPaneLayout.createSequentialGroup()
						.addGap(28, 28, 28)
						.addGroup(frame1ContentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
							.addComponent(label1)
							.addComponent(textField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(frame1ContentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
							.addComponent(label7)
							.addComponent(textField7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(frame1ContentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
							.addComponent(label5)
							.addComponent(textField5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(frame1ContentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
							.addComponent(label6)
							.addComponent(textField4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGap(10, 10, 10)
						.addGroup(frame1ContentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
							.addComponent(label3)
							.addComponent(textField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(frame1ContentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
							.addComponent(label4)
							.addComponent(textField3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(frame1ContentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
							.addComponent(label2)
							.addComponent(textField6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGap(7, 7, 7)
						.addGroup(frame1ContentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
							.addComponent(label8)
							.addComponent(textField8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGap(10, 10, 10)
						.addGroup(frame1ContentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
							.addComponent(label9, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
							.addComponent(textField9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(frame1ContentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
							.addComponent(label11)
							.addComponent(textField11, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGap(16, 16, 16)
						.addGroup(frame1ContentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
							.addComponent(label10)
							.addComponent(textField10, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGap(35, 35, 35)
						.addComponent(button3)
						.addContainerGap(35, Short.MAX_VALUE))
			);
			frame1.pack();
			frame1.setLocationRelativeTo(frame1.getOwner());
		}

		//======== dialog1 ========
		{
			Container dialog1ContentPane = dialog1.getContentPane();

			//---- label12 ----
			label12.setText("\u6279\u91cf\u65b0\u589e\u6210\u529f");

			GroupLayout dialog1ContentPaneLayout = new GroupLayout(dialog1ContentPane);
			dialog1ContentPane.setLayout(dialog1ContentPaneLayout);
			dialog1ContentPaneLayout.setHorizontalGroup(
				dialog1ContentPaneLayout.createParallelGroup()
					.addGroup(dialog1ContentPaneLayout.createSequentialGroup()
						.addGap(58, 58, 58)
						.addComponent(label12, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(84, Short.MAX_VALUE))
			);
			dialog1ContentPaneLayout.setVerticalGroup(
				dialog1ContentPaneLayout.createParallelGroup()
					.addGroup(dialog1ContentPaneLayout.createSequentialGroup()
						.addGap(49, 49, 49)
						.addComponent(label12)
						.addContainerGap(88, Short.MAX_VALUE))
			);
			dialog1.pack();
			dialog1.setLocationRelativeTo(dialog1.getOwner());
		}
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	private JPopupMenu popupMenu3;
	private JMenu menu7;
	private JMenuItem menuItem8;
	private JMenuItem menuItem9;
	private JMenu menu8;
	private JMenuItem menuItem10;
	private JMenu menu6;
	private JMenuItem menuItem5;
	private JMenuItem menuItem6;
	private JMenuItem menuItem7;
	private JLabel label13;
	private JPanel panel1;
	private JFrame frame1;
	private JLabel label1;
	private JTextField textField1;
	private JTextField textField2;
	private JLabel label2;
	private JTextField textField3;
	private JLabel label3;
	private JTextField textField4;
	private JLabel label4;
	private JLabel label5;
	private JTextField textField6;
	private JLabel label6;
	private JTextField textField7;
	private JLabel label7;
	private JTextField textField8;
	private JLabel label8;
	private JTextField textField9;
	private JLabel label9;
	private JTextField textField10;
	private JLabel label10;
	private JTextField textField11;
	private JLabel label11;
	private JButton button3;
	private JTextField textField5;
	private JDialog dialog1;
	private JLabel label12;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
