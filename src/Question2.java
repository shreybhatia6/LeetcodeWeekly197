public class Question2 {

    public int numSub(String s) {

        int sum = 0;
        String[] temp = s.split("0");
        for (String tempS : temp) {
            int tempCount = 0;
            int length = tempS.length();
            while (length > 0) {
                tempCount += length;
                tempCount %= 1000000007;
                length--;
            }
            sum += tempCount;
        }

        return sum;

    }
}

