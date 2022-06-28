import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle;
/*
 * Created by JFormDesigner on Tue Jun 28 23:11:47 CST 2022
 */



/**
 * @author Brainrain
 */
public class  ‰»Î” œ‰ extends JPanel {
	public  ‰»Î” œ‰() {
		initComponents();
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		label1 = new JLabel();
		textField1 = new JTextField();
		button1 = new JButton();
		button2 = new JButton();

		//======== this ========

		//---- label1 ----
		label1.setText("\u8bf7\u5728\u4ee5\u4e0b\u6846\u5185\u8f93\u5165\u4f60\u7684\u7535\u5b50\u90ae\u4ef6\u5730\u5740\uff0c\u7528\u4e8e\u627e\u56de\u53e3\u4ee4");
		label1.setFont(new Font("\u5b8b\u4f53", Font.PLAIN, 18));

		//---- button1 ----
		button1.setText("\u786e\u8ba4");
		button1.setFont(new Font("\u6977\u4f53", Font.PLAIN, 20));

		//---- button2 ----
		button2.setText("\u53d6\u6d88");
		button2.setFont(new Font("\u6977\u4f53", Font.PLAIN, 20));

		GroupLayout layout = new GroupLayout(this);
		setLayout(layout);
		layout.setHorizontalGroup(
			layout.createParallelGroup()
				.addGroup(layout.createSequentialGroup()
					.addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
						.addComponent(textField1, GroupLayout.PREFERRED_SIZE, 414, GroupLayout.PREFERRED_SIZE)
						.addGroup(layout.createParallelGroup()
							.addGroup(layout.createSequentialGroup()
								.addGap(128, 128, 128)
								.addComponent(button1)
								.addGap(84, 84, 84)
								.addComponent(button2))
							.addGroup(layout.createSequentialGroup()
								.addGap(42, 42, 42)
								.addComponent(label1))))
					.addContainerGap(44, Short.MAX_VALUE))
		);
		layout.setVerticalGroup(
			layout.createParallelGroup()
				.addGroup(layout.createSequentialGroup()
					.addGap(65, 65, 65)
					.addComponent(label1)
					.addGap(62, 62, 62)
					.addComponent(textField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
					.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(button1)
						.addComponent(button2))
					.addGap(52, 52, 52))
		);
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	private JLabel label1;
	private JTextField textField1;
	private JButton button1;
	private JButton button2;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
