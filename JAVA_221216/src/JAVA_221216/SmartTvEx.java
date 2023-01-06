package JAVA_221216;

public class SmartTvEx {

	public static void main(String[] args) {
		SmartTv stv = new SmartTv();
		
		stv.powerOn();
		stv.volumeUP();
		stv.volumeUP();
		stv.volumeDown();
		stv.channelUp();
		stv.channelDown();
		
		stv.InterNetOn();
		stv.urlChange("http://www.daum.net");
		stv.InterNetOff();
		
		stv.gameStart();
		stv.gamePlay();
		stv.gameEnd();
	}

}
