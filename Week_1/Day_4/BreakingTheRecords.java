package Day_3;

class TimeConvert {

    public static void main

    {
        public static List<Integer> breakingRecords(List<Integer> scores) {
        List records = new ArrayList<>(); int firstRecord = 0; int secondRecord = 0;

        int max = scores.get(0);
        int min = scores.get(0);


        for (int i = 0; i <  scores.size(); i++) {
            if (max <  scores.get(i)) {
                max = scores.get(i);
                firstRecord++;
            }

            if (min > scores.get(i)) {
                min = scores.get(i);
                secondRecord++;
            }


        }

        records.add(firstRecord);
        records.add(secondRecord);

        return records;

    }

    }