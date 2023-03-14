
public class FlashLamp {
	private boolean status;
	private Battery battery;
	
	public FlashLamp() {
		this.status = false;
		this.battery = null;
	}
	
	
	/**
	 * @return the status
	 */
	public boolean isStatus() {
		return status;
	}



	/**
	 * @param status the status to set
	 */
	public void setStatus(boolean status) {
		this.status = status;
	}



	public void setBattery(Battery b) {
		this.battery = b;
	}
	
	public int getBatteryInfo() {
		return battery.getEnergy();
	}
	
	public void turnOn() {
		this.status = true;
		if(this.status == true && this.getBatteryInfo() > 0 && this.battery != null){
			System.out.println("BAT");
		}
	}
	
	public void turnOff() {
		this.status = false;
		if(this.status == false && this.getBatteryInfo() < 0) {
			System.out.println("TAT");
		}
	}
	
}
