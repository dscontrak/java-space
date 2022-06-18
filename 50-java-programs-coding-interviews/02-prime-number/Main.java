public class Main{
    public static void main(String[] args){
        System.out.println("The number 5 is primitive: " + isPrimeNumberV1(5));
        System.out.println("The number 6 is primitive: " + isPrimeNumberV1(6));
        System.out.println("The number 17 is primitive: " + isPrimeNumberV1(17));

        System.out.println("The number 17 is primitive: " + isPrimeNumberV2(17));
    }

    public static boolean isPrimeNumberV1(int n){
        int index = 2;
        while(index < n){

            float mod = n % index; 
            if(mod == 0.0){
                return false;
            }

            index++;
        }

        return true;

    }

     public static boolean isPrimeNumberV2(int number) {
        if (number == 2 || number == 3) {
            return true;
        }
        if (number % 2 == 0) {
            return false;
        }
        int sqrt = (int) Math.sqrt(number) + 1;
        for (int i = 3; i < sqrt; i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

}