import java.util.Scanner;

public class App {
    
    private static Scanner imp = new Scanner(System.in);
    private static int[] nums = null; //Declare the array
       
        public static void main(String[] args) throws Exception {
        // // int[] scores = null;
        // // String[] names = null;
    
        // String[] names = {"Wolf", "Sutter", "Cook", "Fox", "Golden"};
        // int[] scores = {999, 785, 393, 220, 18};
    
        // for (int i = 0; i < names.length; i++) {
        //     System.out.println(names[i] + ":" + scores[i]);
        // }
            Scanner imp = new Scanner(System.in);
            int[] nums = null; //Declare the array
    
            System.out.println("How many numbers would you like to input?");
            int SIZE = imp.nextInt();
    
            nums = new int[SIZE];
    
            for (int i = 0; i < nums.length; i++) {
                System.out.println("Enter an Integer: ");
                nums[i] = imp.nextInt();
            }
    
            // System.out.print("Your List of Numbers is: ");
            // for(int i = 0; i < nums.length; i++) {
            //     System.out.print(nums[i] + " ");
            // }
            pa();
    
            for(int i = 0; i < nums.length; i++) {
                nums[i] = nums[i]*2;
            }
            
        }
    
    
    
    
        private static void pa(){
            System.out.print("Your List of Numbers is: ");
            for(int i = 0; i < nums.length; i++) {
                System.out.print(nums[i] + " ");
        }

    }
}
