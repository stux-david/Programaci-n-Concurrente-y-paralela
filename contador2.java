public class contador2 extends Thread{
	private int cont2;

	public contador2(int c){
		this.cont2=c;
	}

	public void run(){
		for(int i=10; i>cont2; i--){
			System.out.println("contador 2: \t" + i);
		}
	}
}