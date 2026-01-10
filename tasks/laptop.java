package task;

public class laptop {
	 private String brand;
	    private int price;

	    public void setBrand(String brand) {
	        this.brand = brand;
	    }

	    public String getBrand() {
	        return brand;
	    }

	    public void setPrice(int price) {
	        this.price = price;
	    }

	    public int getPrice() {
	        return price;
	    }

	    public static void main(String[] args) {

	        laptop l = new laptop();

	        l.setBrand("Dell");
	        System.out.println("Laptop Brand: " + l.getBrand());

	        l.setPrice(55000);
	        System.out.println("Laptop Price: " + l.getPrice());
	    }
}
