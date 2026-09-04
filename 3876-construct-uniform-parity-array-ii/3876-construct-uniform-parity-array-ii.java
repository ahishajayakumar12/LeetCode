class Solution {
    public boolean uniformArray(int[] nums1) {
        int minOdd = Integer.MAX_VALUE;
        int minEven = Integer.MAX_VALUE;
        for (int num : nums1) {
            if (num % 2 == 0) {
                minEven = Math.min(minEven, num);
            } else {
                minOdd = Math.min(minOdd, num);
            }
        }
        boolean makeOdd = true;

        for (int num : nums1) {
            if (num % 2 == 0) {
                if (minOdd >= num) {
                    makeOdd = false;
                    break;
                }
            }
        }
        boolean makeEven = true;

        for (int num : nums1) {
            if (num % 2 == 1) {
                if (minOdd >= num) {
                    makeEven = false;
                    break;
                }
            }
        }

        return makeOdd || makeEven;
    }
}