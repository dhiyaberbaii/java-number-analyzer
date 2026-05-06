public class a1{
    
    public static void main(String[] args){
        for (int i = 0; i < args.length; i++) {
            int n = Integer.parseInt(args[i]);
            if (n % 2 ==0){
                System.out.print(n + " is even,") ;//3mlt print moch println bech tji resultat el kol fi star w7d
            }
            else {
                System.out.print(n + " is odd,");
            }
            if (n>0){
                System.out.print(" positive ,"); 
            }
            else if (n==0){
                System.out.print(" zero ,"); 
            }
            else{
                System.out.print(" negative ,") ;
            }
            if(n%3==0){
                System.out.print(" divisible by 3") ;
            }
            else{
                System.out.print(" not divisible by 3");
            } 
            boolean isPrime = true;

            if (n <= 1) {
                isPrime = false;
            } else {
                for (int j = 2; j < n; j++) {
                    if (n % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            if (isPrime) {
                System.out.println(" and prime");
            } else {
                System.out.println(" and not prime");
            }
            String rev = "";
            int testn = n;
            if (n == 0) {
                System.out.println("the reverse of 0 is : 0");
                System.out.println("0 is Palindrome");
            }
            else if (n<0){
                testn= testn*(-1);
                while(testn != 0){
                int a = testn%10;
                rev = rev + a;
                testn = testn/10;
            }
                int revn = Integer.parseInt(rev);
                revn = revn*(-1);
                System.out.println("the reverse of " + n + " is : " + revn );
                
                if (revn==n){
                    System.out.println(n + " is Palindrome");
                }
                else{
                System.out.println(n + " is not Palindrome") ;
                }
            }
            else{
            
                while(testn != 0){
                int a = testn%10;
                rev = rev + a;
                testn = testn/10;
            }
                System.out.println("the reverse of " + n + " is : " + rev );
                int revn = Integer.parseInt(rev);
                if (revn==n){
                    System.out.println(n + " is Palindrome");
                }
                else{
                System.out.println(n + " is not Palindrome") ;
                }
            }
            System.out.println("----------------");
        

                
                }  
            }
        }

