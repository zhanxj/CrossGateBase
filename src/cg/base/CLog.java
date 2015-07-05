package cg.base;

import java.util.Calendar;

import cg.base.log.Log;

class CLog implements Log {

	@Override
	public void info(String info) {
		printHead();
		System.out.println("[INFO] " + info); // 
	}
	
	private static void printHead() {
		Calendar calendar = Calendar.getInstance(); // 
		StringBuilder head = new StringBuilder(); //
		head.append(calendar.get(Calendar.YEAR) + "-"); // 
		head.append((calendar.get(Calendar.MONTH) + 1) + "-"); // 
		head.append(calendar.get(Calendar.DAY_OF_MONTH) + " "); // ���롰�ա�
		head.append(calendar.get(Calendar.HOUR_OF_DAY) + ":"); // ���롰ʱ��
		head.append(calendar.get(Calendar.MINUTE) + ":"); // ���롰�֡�
		head.append(calendar.get(Calendar.SECOND) + " "); // ���롰�롱
		System.out.print(head.toString()); // ���ʱ��ͷ
	}

	@Override
	public void warning(String warning) {
		printHead(); // �����Ϣͷ
		System.out.println("[WARING] " + warning); // �����Ϣ
	}

	@Override
	public void error(String error) {
		printHead(); // �����Ϣͷ
		System.out.println("[ERROR] " + error); // �����Ϣ
	}

	@Override
	public void print(String head, String message) {
		printHead(); // �����Ϣͷ
		System.out.println("[" + head + "] " + message); // �����Ϣ
	}

	@Override
	public void error(String error, Throwable t) {
		error(error); // �������
		t.printStackTrace(); // ��ӡ�׳�ջ
	}

}
