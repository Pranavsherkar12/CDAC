package orgg.prgm3;

public class BMITracker {
	private int weight;
	private float height;
	private double BMI;
	
	public BMITracker(int weight,float height){
		this.weight = weight;
		this.height = height;
	}
	
	public int getWeight() {
		return weight;	
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public int getHeight() {
		return weight;	
	}
	
	public void setHeight(float height) {
		this.height = height;
	}
	
	
	public double calculateBMI() {
		BMI = (weight / (height * height));
		return BMI;
	}
	
	public String classifyBMI() {
		if (BMI < 18.5) {
			return "Underweight";
		}
		else if (BMI > 18.5 && BMI < 24.9) {
			return "Normal weight";
		}
		else if (BMI > 25 && BMI < 29.9) {
			return "Overweight";
		}
		else {
			return "Obese";
		}
	}
	
	public String toString() {
		return "Details are: "+"\n"+
				"Weight is: " + weight +"\n"+
				"Height is: " + height;
				
	}

	
}