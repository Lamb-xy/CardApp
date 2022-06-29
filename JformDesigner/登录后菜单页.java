import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle;
import com.jgoodies.forms.factories.*;
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
		DefaultComponentFactory compFactory = DefaultComponentFactory.getInstance();
		popupMenu3 = new JPopupMenu();
		menu7 = new JMenu();
		menuItem8 = new JMenuItem();
		menuItem9 = new JMenuItem();
		menuItem2 = new JMenuItem();
		label13 = new JLabel();
		title1 = compFactory.createTitle("\u540d\u7247\u7ba1\u7406\u7cfb\u7edf");
		popupMenu5 = new JPopupMenu();
		menu6 = new JMenu();
		menuItem5 = new JMenuItem();
		menuItem6 = new JMenuItem();
		menuItem7 = new JMenuItem();
		scrollPane1 = new JScrollPane();
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
		frame2 = new JFrame();
		label14 = new JLabel();
		popupMenu1 = new JPopupMenu();
		menu1 = new JMenu();
		menuItem3 = new JMenuItem();
		menuItem4 = new JMenuItem();
		menuItem10 = new JMenuItem();
		label15 = new JLabel();
		popupMenu2 = new JPopupMenu();
		menu2 = new JMenu();
		menuItem11 = new JMenuItem();
		menuItem12 = new JMenuItem();
		menuItem13 = new JMenuItem();
		button1 = new JButton();
		textField12 = new JTextField();
		textField13 = new JTextField();
		popupMenu4 = new JPopupMenu();
		menu3 = new JMenu();
		dialog2 = new JDialog();
		label16 = new JLabel();

		//======== this ========
		setTitle("MainInterface");
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

				//---- menuItem2 ----
				menuItem2.setText("\u5bfc\u51fa");
				menu7.add(menuItem2);
			}
			popupMenu3.add(menu7);
		}

		//---- label13 ----
		label13.setFont(new Font("\u5b8b\u4f53", Font.PLAIN, 24));
		label13.setForeground(new Color(153, 153, 255));

		//---- title1 ----
		title1.setFont(new Font("\u5b8b\u4f53", Font.PLAIN, 20));

		//======== popupMenu5 ========
		{

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
			popupMenu5.add(menu6);
		}

		GroupLayout contentPaneLayout = new GroupLayout(contentPane);
		contentPane.setLayout(contentPaneLayout);
		contentPaneLayout.setHorizontalGroup(
			contentPaneLayout.createParallelGroup()
				.addGroup(contentPaneLayout.createSequentialGroup()
					.addComponent(popupMenu5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(115, 115, 115)
					.addComponent(label13)
					.addGap(26, 26, 26)
					.addComponent(title1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(0, 0, Short.MAX_VALUE))
				.addGroup(contentPaneLayout.createSequentialGroup()
					.addComponent(popupMenu3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 408, GroupLayout.PREFERRED_SIZE)
					.addGap(1, 1, 1))
		);
		contentPaneLayout.setVerticalGroup(
			contentPaneLayout.createParallelGroup()
				.addGroup(contentPaneLayout.createSequentialGroup()
					.addComponent(label13, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
					.addGap(0, 0, Short.MAX_VALUE))
				.addGroup(contentPaneLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(contentPaneLayout.createParallelGroup()
						.addGroup(contentPaneLayout.createSequentialGroup()
							.addComponent(popupMenu5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addComponent(popupMenu3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(contentPaneLayout.createSequentialGroup()
							.addComponent(title1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 291, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		pack();
		setLocationRelativeTo(getOwner());

		//======== frame1 ========
		{
			frame1.setTitle("InputInformationWindow");
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
			label12.setFont(new Font("\u5fae\u8f6f\u96c5\u9ed1", Font.PLAIN, 26));

			GroupLayout dialog1ContentPaneLayout = new GroupLayout(dialog1ContentPane);
			dialog1ContentPane.setLayout(dialog1ContentPaneLayout);
			dialog1ContentPaneLayout.setHorizontalGroup(
				dialog1ContentPaneLayout.createParallelGroup()
					.addGroup(dialog1ContentPaneLayout.createSequentialGroup()
						.addGap(35, 35, 35)
						.addComponent(label12, GroupLayout.PREFERRED_SIZE, 204, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(78, Short.MAX_VALUE))
			);
			dialog1ContentPaneLayout.setVerticalGroup(
				dialog1ContentPaneLayout.createParallelGroup()
					.addGroup(dialog1ContentPaneLayout.createSequentialGroup()
						.addGap(40, 40, 40)
						.addComponent(label12)
						.addContainerGap(80, Short.MAX_VALUE))
			);
			dialog1.pack();
			dialog1.setLocationRelativeTo(dialog1.getOwner());
		}

		//======== frame2 ========
		{
			frame2.setTitle("ExportToFile");
			Container frame2ContentPane = frame2.getContentPane();

			//---- label14 ----
			label14.setText("\u5bfc\u51fa\u5230\u6587\u4ef6");

			//======== popupMenu1 ========
			{

				//======== menu1 ========
				{
					menu1.setText("\u6307\u5b9a\u6587\u4ef6\u8def\u5f84");

					//---- menuItem3 ----
					menuItem3.setText("\u6211\u7684\u684c\u9762");
					menu1.add(menuItem3);

					//---- menuItem4 ----
					menuItem4.setText("C\u76d8");
					menu1.add(menuItem4);

					//---- menuItem10 ----
					menuItem10.setText("D\u76d8");
					menu1.add(menuItem10);
				}
				popupMenu1.add(menu1);
			}

			//---- label15 ----
			label15.setText("\u6307\u5b9a\u6587\u4ef6\u540d");

			//======== popupMenu2 ========
			{

				//======== menu2 ========
				{
					menu2.setText("\u6587\u4ef6\u7c7b\u578b");

					//---- menuItem11 ----
					menuItem11.setText("xls");
					menu2.add(menuItem11);

					//---- menuItem12 ----
					menuItem12.setText("pdf");
					menu2.add(menuItem12);

					//---- menuItem13 ----
					menuItem13.setText("doc");
					menu2.add(menuItem13);
				}
				popupMenu2.add(menu2);
			}

			//---- button1 ----
			button1.setText("\u786e\u8ba4");

			//======== popupMenu4 ========
			{

				//======== menu3 ========
				{
					menu3.setText("\u6211\u7684\u6587\u6863");
				}
				popupMenu4.add(menu3);
			}

			GroupLayout frame2ContentPaneLayout = new GroupLayout(frame2ContentPane);
			frame2ContentPane.setLayout(frame2ContentPaneLayout);
			frame2ContentPaneLayout.setHorizontalGroup(
				frame2ContentPaneLayout.createParallelGroup()
					.addGroup(frame2ContentPaneLayout.createSequentialGroup()
						.addGroup(frame2ContentPaneLayout.createParallelGroup()
							.addGroup(frame2ContentPaneLayout.createSequentialGroup()
								.addContainerGap()
								.addComponent(popupMenu2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(textField13, GroupLayout.PREFERRED_SIZE, 234, GroupLayout.PREFERRED_SIZE)
								.addGap(34, 34, 34)
								.addComponent(button1, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE))
							.addGroup(frame2ContentPaneLayout.createSequentialGroup()
								.addGroup(frame2ContentPaneLayout.createParallelGroup()
									.addComponent(label14, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
									.addGroup(frame2ContentPaneLayout.createSequentialGroup()
										.addGap(48, 48, 48)
										.addComponent(label15)
										.addGap(30, 30, 30)
										.addComponent(textField12, GroupLayout.PREFERRED_SIZE, 234, GroupLayout.PREFERRED_SIZE))
									.addGroup(frame2ContentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
										.addComponent(popupMenu4, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(popupMenu1, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
								.addGap(0, 109, Short.MAX_VALUE)))
						.addContainerGap())
			);
			frame2ContentPaneLayout.setVerticalGroup(
				frame2ContentPaneLayout.createParallelGroup()
					.addGroup(frame2ContentPaneLayout.createSequentialGroup()
						.addComponent(label14, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(popupMenu1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(popupMenu4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
						.addGroup(frame2ContentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
							.addComponent(label15)
							.addComponent(textField12, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(frame2ContentPaneLayout.createParallelGroup()
							.addGroup(frame2ContentPaneLayout.createSequentialGroup()
								.addGap(23, 23, 23)
								.addComponent(textField13, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGroup(frame2ContentPaneLayout.createSequentialGroup()
								.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(popupMenu2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addContainerGap())
					.addGroup(GroupLayout.Alignment.TRAILING, frame2ContentPaneLayout.createSequentialGroup()
						.addGap(0, 261, Short.MAX_VALUE)
						.addComponent(button1, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
			);
			frame2.pack();
			frame2.setLocationRelativeTo(frame2.getOwner());
		}

		//======== dialog2 ========
		{
			Container dialog2ContentPane = dialog2.getContentPane();

			//---- label16 ----
			label16.setText("\u5bfc\u51fa\u6210\u529f");
			label16.setFont(new Font("\u5fae\u8f6f\u96c5\u9ed1", Font.PLAIN, 26));

			GroupLayout dialog2ContentPaneLayout = new GroupLayout(dialog2ContentPane);
			dialog2ContentPane.setLayout(dialog2ContentPaneLayout);
			dialog2ContentPaneLayout.setHorizontalGroup(
				dialog2ContentPaneLayout.createParallelGroup()
					.addGroup(dialog2ContentPaneLayout.createSequentialGroup()
						.addGap(148, 148, 148)
						.addComponent(label16)
						.addContainerGap(183, Short.MAX_VALUE))
			);
			dialog2ContentPaneLayout.setVerticalGroup(
				dialog2ContentPaneLayout.createParallelGroup()
					.addGroup(dialog2ContentPaneLayout.createSequentialGroup()
						.addGap(44, 44, 44)
						.addComponent(label16)
						.addContainerGap(44, Short.MAX_VALUE))
			);
			dialog2.pack();
			dialog2.setLocationRelativeTo(dialog2.getOwner());
		}
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	private JPopupMenu popupMenu3;
	private JMenu menu7;
	private JMenuItem menuItem8;
	private JMenuItem menuItem9;
	private JMenuItem menuItem2;
	private JLabel label13;
	private JLabel title1;
	private JPopupMenu popupMenu5;
	private JMenu menu6;
	private JMenuItem menuItem5;
	private JMenuItem menuItem6;
	private JMenuItem menuItem7;
	private JScrollPane scrollPane1;
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
	private JFrame frame2;
	private JLabel label14;
	private JPopupMenu popupMenu1;
	private JMenu menu1;
	private JMenuItem menuItem3;
	private JMenuItem menuItem4;
	private JMenuItem menuItem10;
	private JLabel label15;
	private JPopupMenu popupMenu2;
	private JMenu menu2;
	private JMenuItem menuItem11;
	private JMenuItem menuItem12;
	private JMenuItem menuItem13;
	private JButton button1;
	private JTextField textField12;
	private JTextField textField13;
	private JPopupMenu popupMenu4;
	private JMenu menu3;
	private JDialog dialog2;
	private JLabel label16;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
