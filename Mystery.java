public class Mystery {
	public static void main(String[] args) {
		double input = (int)(Math.random()*100)/10.0;
		int output = (int)(input+0.5);
		System.out.println(input+" -> "+output);
	}
}
