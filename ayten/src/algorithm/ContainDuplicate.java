package algorithm;

public class ContainDuplicate {
    public boolean containsDuplicate(int[] nums) {
       selectionSort(nums);
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]) return true;
        }
        return false;
    }
    public void selectionSort(int [] nums){
        for(int i=0;i<nums.length-1;i++){
            int mIndex=i;
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]<nums[mIndex]) mIndex=j;
            }
            int temp=nums[mIndex];
            nums[mIndex]=nums[i];
            nums[i]=temp;
        }
    }

    public static void main(String[] args) {
        ContainDuplicate contain=new ContainDuplicate();
        int[] num={1,2,3,1};
        System.out.println(contain.containsDuplicate(num));
    }
}
