public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        for(int i =0 ; i< nums.length; i++){
            for(int j=i+1 ; j< nums.length; j++){
                if(nums[i]+nums[j]==target){
                    return new int[] {i,j} ;
                }
            }
        }
        throw new IllegalArgumentException("Həll mövcud deyil");
    }

    public static void main(String[] args) {
        int[] nums = {2,3,5,7,10} ;
        int target = 9 ;
        int[] result = twoSum(nums, target) ;
        System.out.println("[" + result[0] + "," + result[1] + "]");
    }}

