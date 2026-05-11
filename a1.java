public class a1{
        public static boolean isEven(int n) {
            return n % 2 == 0;
        }
        public static boolean isDivisibleBy3(int n) {
            return n % 3 == 0;
        }
        public static boolean isPositive(int n) {
            return n > 0;
        }
        public static boolean isPrime(int n) {
            if (n <= 1) {
                return false;
            }

            for (int j = 2; j < n; j++) {
                if (n % j == 0) {
                return false;
                }
            }

                return true;
        }
        public static int reverse(int n) {
    if (n == 0) {
        return 0;
    }

    String rev = "";
    int testn = n;

    if (n < 0) {
        testn = testn * (-1);
    }

    while (testn != 0) {
        int a = testn % 10;
        rev = rev + a;
        testn = testn / 10;
    }

    int revn = Integer.parseInt(rev);

    if (n < 0) {
        revn = revn * (-1);
    }

    return revn;
}
public static boolean isPalindrome(int n) {
    return reverse(n) == n;
}
    
        public static void main(String[] args){
            for (int i = 0; i < args.length; i++) {
                int n = Integer.parseInt(args[i]);
                if (isEven(n)){
                    System.out.print(n + " is even,") ;//3mlt print moch println bech tji resultat el kol fi star w7d
                }
                else {
                    System.out.print(n + " is odd,");
                }
                if (isPositive(n)){
                    System.out.print(" positive ,"); 
                }
                else if (n==0){
                    System.out.print(" zero ,"); 
                }
                else{
                    System.out.print(" negative ,") ;
                }
                if(isDivisibleBy3(n)){
                    System.out.print(" divisible by 3") ;
                }
                else{
                    System.out.print(" not divisible by 3");
                } 

                if (isPrime(n)) {
                    System.out.println(" and prime");
                } else {
                    System.out.println(" and not prime");
                }
                int revn = reverse(n);
                System.out.println("the reverse of " + n + " is : " + revn);
                if (isPalindrome(n)) {
                    System.out.println(n + " is Palindrome");
                } 
                else {
                    System.out.println(n + " is not Palindrome");
                }
                
                System.out.println("----------------");
            }
            
            

                    
        }  
}


