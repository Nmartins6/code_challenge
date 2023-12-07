package Day_2;

public class MinMaxSum {
    public static void main(String[] args) {

        public static void miniMaxSum(List<Integer> arr) {

            Collections.sort(arr);
            long totalSum = 0;

            for (int index = 0 ; index < arr.size() ; index++) {
                totalSum += arr.get(index);
            }
            System.out.print((totalSum - arr.get(arr.size() - 1)) + " " + (totalSum - arr.get(0)));
        }

    }
}
