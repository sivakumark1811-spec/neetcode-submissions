class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int l = i + 1;
            int r = nums.length - 1;
            int a = nums[i];
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            while (l < r) {
                int val = a + nums[l] + nums[r];
                if (val == 0) {
                    list.add(Arrays.asList(a, nums[l], nums[r]));
                    l++;
                    r--;
                    while (l < r && nums[l] == nums[l - 1]) l++;
                    while (l < r && nums[r] == nums[r + 1]) r--;
                } else if (val > 0)
                    r--;

                else
                    l++;
            }
        }
        return list;
    }
}
