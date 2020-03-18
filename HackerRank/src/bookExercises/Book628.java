package bookExercises;

public class Book628 {
	public static boolean isPrime(int a) {
		boolean flag = false;
        for(int i = 2; i <= a/2; ++i)
        {
            if(a % i == 0)
            {
                flag = true;
                break;
            }
        }

        if (!flag) {
           return true;
        }
        else { 
        	return false;
        }
	}
	public static void findMersenne(int i) {
		if(isPrime((int)Math.pow(2.0, (double)i)-1)) {
			System.out.println(i + "        " + ((int)Math.pow(2.0, (double)i)-1) );
		};
	}
	public static void main(String[] args) {
		System.out.println("p        2^p-1");
		System.out.println("______________");
		for (int i=2;i<=31;i++) {
			findMersenne(i);
		}
	}

}
