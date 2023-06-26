package PrePlacementTraning;

class ShiftZeros {
    public static int[] zeros(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            if (arr[left] == 0 && arr[right] != 0) {
                // Swap non-zero element with zero element
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            } else {
                if (arr[left] != 0) {
                    left++;
                }
                if (arr[right] == 0) {
                    right--;
                }
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 0, 4};
        int[] res = zeros(arr);

        // Print the result
        for (int num : res) {
            System.out.print(num + " ");
        }
    }
}
