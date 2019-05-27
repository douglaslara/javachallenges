package javachallenge.strings;

public class BinaryGap {
    public int solution(int N) {

        String binary = Integer.toBinaryString(N);
        if (!binary.contains(String.valueOf("0"))) {
            return 0;
        }

        int binaryGap = 0;
        int biggerGap = 0;
        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '1') {
                if (binaryGap > 0 && binaryGap > biggerGap) {
                    biggerGap = binaryGap;
                }
                binaryGap = 0;
            } else if (binary.charAt(i) == '0') {
                binaryGap++;
            }
        }

        return biggerGap;
    }
}

