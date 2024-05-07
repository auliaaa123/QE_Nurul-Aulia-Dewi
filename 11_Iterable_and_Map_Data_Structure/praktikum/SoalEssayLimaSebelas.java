public class SoalEssayLimaSebelas {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int writeIndex = 1; // Indeks untuk menulis elemen tanpa duplikat
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[writeIndex - 1]) {
                nums[writeIndex] = nums[i];
                writeIndex++;
            }
        }

        return writeIndex; // Panjang subarray tanpa duplikat
    }

    public static void main(String[] args) {
        int[] nums1 = {2, 3, 3, 3, 6, 9, 9};
        System.out.println(removeDuplicates(nums1));  // Output: 4

        int[] nums2 = {2, 2, 2, 11};
        System.out.println(removeDuplicates(nums2));  // Output: 2
    }
}
