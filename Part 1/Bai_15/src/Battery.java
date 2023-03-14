
public class Battery {
	private int energy;

	/**
	 * @param enery
	 */
	public Battery() {
		this.energy = 10;
	}
	
	public void setEnergy(int energy) {
		this.energy = energy;
	}
	
	public int getEnergy() {
		return energy;
	}
	
	public void decreaseEnergy(FlashLamp fl) {
		this.energy -= 2;
	}
	
}
