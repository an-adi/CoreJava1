

class primenumbers {
 public static void main(String args[]) {
     int count = 0, flag = 0;
     System.out.println("First 50 prime numbers are: ");
     for (int i = 2; count != 50; i++) {
         for (int j = 2; j <= (i / 2); j++) {
             if (i % j == 0) {
                 flag = 1;
             }
         }
         if (flag == 0) {
             System.out.print(i + " ");
             count++;
         }
         flag = 0;
     }
 }
}