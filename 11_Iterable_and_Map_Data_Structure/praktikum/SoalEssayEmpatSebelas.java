import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SoalEssayEmpatSebelas {
    public static List<Integer> findUnique(int[] arr1, int[] arr2) {
        Set<Integer> set = new HashSet<>();
        List<Integer> result = new ArrayList<>();

        // Tambahkan semua angka dari arr2 ke dalam HashSet
        for (int num : arr2) {
            set.add(num);
        }

        // Tambahkan angka-angka dari arr1 ke dalam hasil jika tidak ada dalam HashSet
        for (int num : arr1) {
            if (!set.contains(num)) {
                result.add(num);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {1, 3, 5, 10, 16};
        System.out.println(findUnique(arr1, arr2));  // Output: [2, 4]

        int[] arr3 = {3, 8};
        int[] arr4 = {2, 8};
        System.out.println(findUnique(arr3, arr4));  // Output: [3]
    }
}
