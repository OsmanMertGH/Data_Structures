public class Assignment1_TwoSumSolution1 {

    public static void main(String[] args) {


        int[] array = {2, 7, 11, 15};

        System.out.println(twoSumSolution1(array, 9));
    }

    public static int[] twoSumSolution1(int[] array, int target) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if (array[i] + array[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }
}