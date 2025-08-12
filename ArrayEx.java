public class ArrayEx {
    public static void main(String args[]) {
        // int nums[] = {1,2,3,4};
        // int nums[]=new int[4];
        // System.out.println(nums[0]);

        int nums[][] = new int[3][4];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                nums[i][j] = (int) (Math.random() * 10);
            }
        }
        // for (int i = 0; i < 3; i++) {
        // for (int j = 0; j < 4; j++) {
        // System.out.print(nums[i][j]);
        // }
        // System.out.println();
        // }

        // Enhance for loop
        for (int n[] : nums) {
            for (int m : n) {
                System.out.print(m + " ");
            }
            System.out.println();

        }
    }
}