package dataAbstraction;

public abstract class  Remote {
	abstract public String batteryType();
	abstract public String connectivity();
	
	public boolean onOff(String a) {
		if(a.equalsIgnoreCase("On")) {
			return true;
		}
		else {
			return false;
		}
	}

}
