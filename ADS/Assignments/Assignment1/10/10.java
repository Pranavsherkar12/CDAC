public class Program10 {

	public static boolean isleap(int year) {
		//If year is divisible by 4 then it is leap year
		//If year is divisible by 400 then it is Centurion leap year
		//If year is divisible by 4,100 it should also be divisible by 400 then it is leap year
		//If year is divisible by 100 and 400 both then it is Centurion leap year
		return (year % 4 == 0) && (year % 100 != 0 || year % 400 == 0);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year:");
		int n = sc.nextInt();

		System.out.println(isleap(n));
	}
}
//Time complexity:O(n)
//Space complexity:O(1)

//Alternative way:
/*
if (year % 4 == 0) {

			if (year % 100 == 0) {

				return (year % 400 == 0);

			} else {
				return true;
			}
		} else {
			return false;
		}

	}
 */
