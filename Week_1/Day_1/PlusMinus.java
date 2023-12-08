package Day_1;

    public class PlusMinus {
        public static void main(String[] args) {

            int size = arr.size();
            float positives = 0;
            float negatives = 0;
            float zeros = 0;

            for(int index = 0 ; index < size ; index ++) {
                if (arr.get(index) > 0) {
                    positives ++;
                } else if (arr.get(index) < 0) {
                    negatives ++;
                } else {
                    zeros ++;
                }
            }

            System.out.println(positives/size);
            System.out.println(negatives/size);
            System.out.println(zeros/size);

        }
    }
