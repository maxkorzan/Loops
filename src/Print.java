import java.util.Scanner;

public class Print {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);


        // 1. print 1-10
        for(int i=0; i<10; i++){
            System.out.print(i+1 + " ");
        }
        System.out.println();


        // 2. print 1-10 backwards
        for(int i=0; i<10; i++){
            System.out.print(10-i + " ");
        }
        System.out.println();


        // 3. print odd 1-20
        for(int i=1; i<=20; i++){
            if(i%2 != 0){
                System.out.print(i +" ");
            }
        }
        System.out.println();


        // 4. print even 1-20
        for(int i=1; i<=20; i++){
            if(i%2 == 0){
                System.out.print(i +" ");
            }
        }
        System.out.println();


        // 5. print user's number --> 1
        System.out.println("Enter a number: ");
        int number = scan.nextInt();

        for(int i=number; i>0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();



        // 6. sum all values 1-10
        int total = 0;
        for(int i=0; i<10; i++){
            total += (i+1);
        }
        System.out.println("The sum of numbers from 1 to 10 is: "+total);



        // 7. print sum of user's number --> 1
        int sum = 0;

        System.out.println("Enter a number: ");
        int num = scan.nextInt();

        for(int i=num; i>0; i--){
            //System.out.print((num-i)+1 + " ");
            sum += i;
        }
        System.out.println("The sum of numbers from "+num+" to 1 is: "+sum);


    }
}
