package mysmallprogram;

import java.text.SimpleDateFormat;
import java.util.Date;

public class JavaBaseUtil {

	/**
	 * �õ����ص�����ʱ��
	 */
	public static void getLocalDate() {

		String dateStr = new Date().toLocaleString();
		System.out.println(dateStr);
	}

	/**
	 * ��ʽ������ʱ��
	 */
	public static void getFormateDate() {
		Date date = new Date();

		// ��д��HH����24Сʱ��
		SimpleDateFormat sdf = new SimpleDateFormat("yyy MM dd HH:mm:ss");

		String str = sdf.format(date);
		System.out.println(str);
	}

	/**
	 * ��ʽ���ַ���
	 */
	public static void formateStr() {
		String str2 = "��";
		String str1 = "��";
		String str = String.format("%s �� %s", str1, str2);
		System.out.println(str);
	}

	public static void main(String[] args) {
		JavaBaseUtil.getLocalDate();
		JavaBaseUtil.getFormateDate();
		JavaBaseUtil.formateStr();
	}
}
