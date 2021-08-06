

public class FutsuuState extends DogState{
	private static FutsuuState s = new FutsuuState();
	private FutsuuState() {}

	public static DogState getInstance() {
		return s;
	}


	public void tukareta(Dog moto) {

	}

	public void tabeta(Dog moto) {
		moto.changeState(TanoshiiState.getInstance());
	}

	public void kakeru(Dog moto) {
		moto.changeState(Neteru.getInstance());
	}


	public String toString() {
		return"普通状態";
	}
}
