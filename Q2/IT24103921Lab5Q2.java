import java.util.Scanner;

public class IT24103921Lab5Q2{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the number of new members invited : ");
		int count = input.nextInt();
		if(count >= 0){
			switch(count){
				case 0:
					System.out.println("No Prize");
					break;
				case 1:
					System.out.println("Prize : Pen");
					break;
				case 2:
					System.out.println("Prize : Umbrella");
					break;
				case 3:
					System.out.println("Prize : Bag");
					break;
				case 4:
					System.out.println("Prize : Travelling Chair");
					break;
				default:
					System.out.println("Prize : Headphone");
					break;
			}
		}else{
			System.out.println("Invalid Count !!");
		}
	}
}