import java.io.*;

public class contador{
	public static void main(String[] args){
		contador1 hilo1 = new contador1(5);
		contador2 hilo2 = new contador2(5);
		hilo1.start();
		hilo2.start();
	}
}