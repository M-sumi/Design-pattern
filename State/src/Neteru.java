
public class Neteru extends DogState{
	private static Neteru s = new Neteru();
	private Neteru() {}

	public static DogState getInstance() {
		return s;
	}


	public void tukareta(Dog moto) {

	}

	public void tabeta(Dog moto) {
		moto.changeState(TanoshiiState.getInstance());
	}

	public void kakeru(Dog moto) {

	}


	public String toString() {
		return"寝てる状態";
	}

}
