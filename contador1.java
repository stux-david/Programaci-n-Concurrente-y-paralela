public class contador1 extends Thread{
	private int cont;

	public contador1(int c){
		this.cont=c;

	}
	public void run(){
		for(int i=1; i<=cont; i++){
			System.out.println("contador 1: \t" + i);		
		}
	}
}