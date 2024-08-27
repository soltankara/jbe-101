package algorithm;

public class MajorityElement {
    public int findingMajorityElement(int[] nums) {
        selectionSort(nums);
        return nums[nums.length/2];
    }
    public void selectionSort(int [] nums){
        for(int i=0;i<nums.length-1;i++){
            int minInd=i;
            for(int j=i;j<nums.length;j++){
                if(nums[j]<nums[minInd]) minInd=j;
            }
            int temp = nums[i];
            nums[i] = nums[minInd];
            nums[minInd] = temp;
        }

    }

    public static void main(String[] args) {
        MajorityElement el=new MajorityElement();
        int[] arr={3,2,3};
        System.out.println("Majority Element is: "+el.findingMajorityElement(arr));
    }
}
