
public class TestFlashLamp {

	public static void main(String[] args) {
		Battery bt = new Battery();
		FlashLamp fl = new FlashLamp();
		
		fl.setBattery(bt);
		bt.setEnergy(100);
		for(int i = 0; i < 10; i++) {
			fl.turnOn();
			fl.turnOff();
			bt.decreaseEnergy(fl);
		}
		System.out.println("Battery energy: " + bt.getEnergy());
	}

}
