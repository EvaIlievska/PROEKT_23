package konstruktori;

public class Vehicle {
    private String color;

    // Constructor with a default color
    Vehicle() {
        setColor("Blue"); // Set a default color, e.g., "Blue"
    }

    // Constructor with a parameter to set the color
    Vehicle(String a) {
        setColor(a);
    }

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}