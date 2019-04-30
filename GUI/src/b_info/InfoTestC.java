package b_info;

import java.awt.*;
import javax.swing.*;

public class InfoTestC {
	// 1. ������� ����
	JFrame f;
	JButton bAdd, bShow, bSearch, bDelete, bCancel, bExit;
	JTextArea ta;
	JTextField tfName, tfId, tfTel, tfSex, tfAge, tfHome;
	//label�� �׳� ����������.
	
	// 2. ��� ��ü ����
	InfoTestC(){
		
		//JFrame f =new JFrame("����"); // ������ ������� �������ְ� ��ó�� �ѹ��� �����ϸ�, 
										//���������� �ٽ� ����Ǵ� ���̱� ������ nullpoint ����.
		f = new JFrame("����");
		
		bAdd = new JButton("ADD", new ImageIcon("src/imgs/flower.png")); //ICON --> Interface, Inferface�� �ٷ� ��ü���� �� �� �����Ƿ�, Interface�� ������ class�� ��ü����������� ex)ImageIcon
		bAdd.setRolloverIcon(new ImageIcon("src/imgs/lemon.png")); //���콺 �ö����� �̹��� �ٲ�� // ������ ���鼭 �ʿ��� �޼ҵ带 ã��, ������ �θ�Ŭ��������.
		bAdd.setPressedIcon(new ImageIcon("src/imgs/strawberry.png")); //Ŭ���Ҷ� �ٲ��
		bAdd.setToolTipText("��� �Է��մϴ�."); // ���콺 �÷����� ���� �����ֱ�.
		bAdd.setMnemonic('i'); //alt+i // ����Ű ����
		bAdd.setVerticalTextPosition(JButton.BOTTOM); //text ��ġ �������� ����
		bAdd.setHorizontalTextPosition(JButton.CENTER); //text ��ġ ������� ����
		
		bShow = new JButton("SHOW");
		bSearch = new JButton("Search");
		bDelete = new JButton("Delete");
		bCancel = new JButton("Cancel");
		bExit = new JButton("Exit");
		
		ta = new JTextArea(10,50);
		
		tfName = new JTextField(15);  // �ʺ� ���� �ϳ��� ���൵ ��ü ����
		tfId = new JTextField();
		tfTel = new JTextField();
		tfSex = new JTextField();
		tfAge = new JTextField();
		tfHome = new JTextField();

	}
	
	
	// 3. ȭ�� ���̱� �� ȭ�� ���
	void addLayout() {
		//South ����
		JPanel p_south = new JPanel();  //�⺻ flow ���̾ƿ�
		p_south.setLayout(new GridLayout(1,6)); //���̾ƿ��� �����ϰ� �ʹٸ� setLayout.
		p_south.add(bAdd);
		p_south.add(bShow);
		p_south.add(bSearch);
		p_south.add(bDelete);
		p_south.add(bCancel);
		p_south.add(bExit);
		
		//West ����
		JPanel p_west = new JPanel();
		p_west.setLayout(new GridLayout(6,2));  //6�� 2���� ���̰ڴ�.
		p_west.add(new JLabel("�̸�"));
		p_west.add(tfName);
		p_west.add(new JLabel("ID"));
		p_west.add(tfId);
		p_west.add(new JLabel("��ȭ��ȣ"));
		p_west.add(tfTel);
		p_west.add(new JLabel("����"));
		p_west.add(tfSex);
		p_west.add(new JLabel("����"));
		p_west.add(tfAge);
		p_west.add(new JLabel("��"));
		p_west.add(tfHome);
		
		
		
		
		//��ü �����ӿ� ���̱�.
		
		f.setLayout(new BorderLayout());
		f.add(p_south, BorderLayout.SOUTH);
		f.add(p_west, BorderLayout.WEST);
		f.add(ta, BorderLayout.CENTER);
		
		f.setSize(700, 580);
		f.setVisible(true);
		

		
		
	}
	

	public static void main(String[] args) {
		
		InfoTestC it = new InfoTestC();
		it.addLayout();
		
	

	}

}
