class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> count = new HashMap<>();
        int n = nums.length;

        for (int num: nums) {
            if (count.containsKey(num)) {
                count.put(num, count.get(num) + 1);
            } else {
                count.put(num, 1);
            }
            if (count.get(num) > n / 2) {
                return num;
            }          
        }
        return 0;
    }
}
