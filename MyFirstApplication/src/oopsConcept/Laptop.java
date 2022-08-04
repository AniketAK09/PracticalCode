package oopsConcept;

public class Laptop {
	
	int noOfUSBPort;
	String processorSpeed;
	
	public void setNoOfUSBPort(int usbPort)
	{
		noOfUSBPort = usbPort;
	}
	
	public int getNoOfUSBPort()
	{
		return noOfUSBPort;
	}
	
	public void setProcessorSpeed(String speed)
	{
		processorSpeed = speed;
	}
	
	public String getProcessorSpeed()
	{
		return processorSpeed;
	}
	
	public static void main(String[] args) {
		
		Laptop l = new Laptop();
		l.setNoOfUSBPort(5);
		l.setProcessorSpeed("4.6GHz");
		System.out.println("No of usb ports is "+l.getNoOfUSBPort());
		System.out.println("Speed of processor is "+l.getProcessorSpeed());
	}

}
