package b_info;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.*;

import javax.swing.*;

public class InfoTestA {
	// 1. ������� ����
	JFrame f;
	JButton bAdd, bShow, bSearch, bDelete, bCancel, bExit;
	JTextArea ta;
	JTextField tfName, tfId, tfTel, tfSex, tfAge, tfHome;
	//label�� �׳� ����������.

	ArrayList<Person> list = new ArrayList<Person>();


	// 2. ��� ��ü ����
	InfoTestA(){


		f = new JFrame("����");

		bAdd = new JButton("ADD");
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

		f.setSize(1000, 580);
		f.setVisible(true);




	}

	// 4. �̺�Ʈ ���
	void eventProc() {
		BtnHdlr bh = new BtnHdlr();
		// ��ư�� �̺�Ʈ �ڵ鷯 ����
		bAdd.addActionListener(bh);
		bShow.addActionListener(bh);
		bSearch.addActionListener(bh);
		bDelete.addActionListener(bh);
		bCancel.addActionListener(bh);
		bExit.addActionListener(bh);

		//��ȭ��ȣ �ؽ�Ʈ �ʵ� ���� �̺�Ʈ �߻�.
		//tfTel.addActionListener(new TfHdler());

		//�ֹι�ȣ �ؽ�Ʈ�ʵ� ��Ŀ�� �̺�Ʈ
		tfId.addFocusListener(new IdFocus());

	}

	//class IdFocus implements FocusListener{
	class IdFocus extends FocusAdapter{

//		public void focusGained(FocusEvent arg0) {
// 			FocusListener �������̽��� ��ӹ��� ���� �� �������̵� ����� ������,
//			FocusAdapter�� ��ӹ޴� ������ �����ϸ� ���ʿ� �޽��� �������̵� ���� �ʾҵ� �ȴ�.
//		}


		public void focusLost(FocusEvent arg0) {
			// ��Ŀ���� �Ҿ�����.
			//�ֹι�ȣ�� �Է��ϸ�, ������ ����,���̰� �ڵ� �Էµǵ���.
			//"801212-1234567"
			String id = tfId.getText();
			//�����ڵ�
			char sung = id.charAt(7);
			if(sung == '1'|| sung=='3') {
				tfSex.setText("����");
			}
			else tfSex.setText("����");

			//���� �ڵ� �Է�.
			char chul =id.charAt(8);
			
			switch(chul) {

			case '0' : tfHome.setText("����"); break;
			case '1' : tfHome.setText("��õ/�λ�");break;
			case '2' : tfHome.setText("���");break;
			case '9' : tfHome.setText("����");break;	
			default:tfHome.setText("�ѱ���");  //break�ִ� ���, �ش� case ���� �� �ٷ� switch���� ������
			// break�� ���� ���, �ش� case ���� �Ŀ��� �ؿ� case�� �� �����Ѵ�.

			}
			
			//���� �ڵ� �Է�.
			int nai2 = Integer.parseInt(id.substring(0,2)); // String�� Int�� ��ȯ("80"-->80), Integer.parseInt() ���
			
			int age = 0;
			int nai3 = id.charAt(7);// �ֹι�ȣ�� 7��° ���ڸ� �� 
			
			// Calendar Ŭ������ �̿��Ͽ� �⵵���� ���ؼ� �⵵ ����.
			
			Calendar c = Calendar.getInstance();
			int year = c.get(Calendar.YEAR)	;	
			
			if(nai3=='1'|nai3=='2') {// 1 �̰ų� 2��� 1900
			// 3 �̰ų� 4��� 2000
				tfAge.setText(String.valueOf(year -(1900+nai2)+1)) ; 
			}else{
				tfAge.setText(String.valueOf(age = year -(2000+nai2)+1));
			}

		}

	}



	class TfHdler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			searchTel();
		}
	}


	class BtnHdlr implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			Object obj =e.getSource();

			if(obj == bAdd) {
				//�Է� ��ư�� ����������.
				insert();
				clearTextField();

			}else if(obj == bShow) { //��ü ���Ⱑ �������� ��.
				show();
			}else if(obj == bSearch) {
				searchTel();
			}else if(obj == bDelete) {
				delete();

			}else if(obj == bCancel) {
				clearTextField();

			}else if(obj == bExit) {
				exit(); // �Լ��� �ۿ� ���� ����ϴ� ���� ����.
			}

		}

	}

	void searchTel(){
		// (1) ����� �Է��� ��ȭ��ȣ ������.
		String tel = tfTel.getText();

		// (2) ArrayList�� �� Person�� tel�� ���ؼ� ������


		// (3) �ش� Person�� ��������� ���� �ؽ�Ʈ�ʵ忡 ���

		for(Person p : list) {
			if(p.getTel().equals(tel)) {

				tfName.setText(p.getName());
				tfId.setText(p.getId());
				tfSex.setText(p.getGender());
				tfAge.setText(String.valueOf(p.getAge()));
				tfHome.setText(p.getHome());
			}
		}
	}

	void delete() {
		// (1) ����� �Է��� ��ȭ��ȣ ������.
		String tel = tfTel.getText();

		for(Person p : list) {
			if(p.getTel().equals(tel)) {
				list.remove(p);
				break;  //���ϰ� ������ ���̻� ���� �ʾƵ� ��.
			}
		}
		clearTextField();
		show();


	}



	void insert() {
		// (1) �� �ؽ�Ʈ �ʵ��� �Է°��� ������
		// (2) 1�������� Person ����� ����(1 -������ / 2-setter)

		Person p = new Person();
		p.setName(tfName.getText());
		p.setId(tfId.getText());
		p.setTel(tfTel.getText());
		p.setGender(tfSex.getText());
		p.setAge(Integer.parseInt(tfAge.getText()));
		p.setHome(tfHome.getText());


		// (3) ArrayList�� 2�� ��ü�� �߰�
		list.add(p);

	}
	void clearTextField() {
		tfName.setText(null);tfId.setText(null);tfTel.setText(null);tfSex.setText(null);tfAge.setText(null);tfHome.setText(null);
	}

	void show() {
		ta.setText("====================��ü����=============\n\n");
		for(Person p: list) {
			ta.append(p.toString()); 
			//setText()�޼ҵ�� �ʱ�ȭ �� ��� ����� �ϹǷ� append�� �ϸ� �̾� �پ���.
			//append���� string�� �� �� �����Ƿ� toString �������.
		}
	}
	void exit() {
		int result = JOptionPane.showConfirmDialog(null, "������ ��������??");
		//�����ư ������ �� �������α׷� ����
		if(result == JOptionPane.OK_OPTION) {
			System.exit(0);
		}

	}


	public static void main(String[] args) {

		InfoTestA it = new InfoTestA();
		it.addLayout();
		it.eventProc();



	}

}
