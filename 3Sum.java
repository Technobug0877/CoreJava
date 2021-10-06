class Solution {
  public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        HashSet<List<Integer>> set= new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
          int left=i+1,right=nums.length-1;
            while(left<right)
            {
                if(nums[i]+nums[left]+nums[right]==0)
                {
                    ArrayList<Integer> temp=new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[left]);
                    temp.add(nums[right]);
                    set.add(temp);
                    left++;
                    right--;
                }
                else if(nums[left]+nums[right]+nums[i]>0)
                    right--;
                else
                    left++;
            }
        }
    List<List<Integer>> re= new ArrayList<>();
        for(List tt : set)
        {
             re.add(tt);
        }
        return re;
        
    }
}