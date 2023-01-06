package JAVA_230104;

public class TryWithResourceEx {

	public static void main(String[] args) {

		try (FileInputStream fis = new FileInputStream("E:\\123.txt")) {
			fis.read();
			throw new Exception(); // 강제로 예외 발생 시키기
		} catch (Exception e) {
			System.out.println("예외처리 코드가 실행되었습니다.");
		}

		System.out.println("정상 실행 완료");

		FileInputStream fis2 = null;

		try {
			fis2 = new FileInputStream("E:\\123.txt");
			fis2.read();
			throw new Exception();
		} catch (Exception e) {
			System.out.println("예외처리 코드가 실행되었습니다.");
		} finally {
			if (fis2 != null) {
				try {
					fis2.close();
				} catch (Exception e) {

				}
			}
		}

		System.out.println("정상 실행 완료");
	}

}
