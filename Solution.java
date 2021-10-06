class Solution {

public int[] twoSum(int[] numbers, int target) {
    int sum[] = new int[2];
    HashMap<Integer , Integer> map = new HashMap<>();
    map.put(numbers[0] , 0);
    for(int i = 1 ; i<numbers.length ; i++)
    {
        int s = target - numbers[i];
        if(map.containsKey(s)){
            sum[1]=i+1;
            sum[0]=map.get(s)+1;
            break;
    }
        map.put(numbers[i] , i);
    }
 return sum;   
}
}