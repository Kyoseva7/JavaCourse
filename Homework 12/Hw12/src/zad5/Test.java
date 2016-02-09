package zad5;

public class Test {

	public static void main(String[] args) {
		
		DeviceFactory deviceFactory = new DeviceFactory();
		Device device1 = deviceFactory.makeDevice("Samsung", "Galaxy", "Phone");
		Device device2 = deviceFactory.makeDevice("Apple", "Ipad", "Tablet");
		Device device3 = deviceFactory.makeDevice("Lenovo", "V50", "Laptop");
		
		device1.deviceInfo(device1);
		device2.deviceInfo(device2);
		device3.deviceInfo(device3);
	}

}
