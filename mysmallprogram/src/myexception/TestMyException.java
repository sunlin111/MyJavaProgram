package myexception;

public class TestMyException {

	public TestMyException(String sex) throws MyException {

		if (sex != "��" && sex != "Ů") {

			throw new MyException("�Ա����");
		}

	}

	public static void main(String[] args) {

		try {
			TestMyException t = new TestMyException("fas");
		} catch (MyException e) {
			e.printStackTrace();
		}
	}

}
