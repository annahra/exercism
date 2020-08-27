public class Hamming {
    private int hammingDist;

    public Hamming(String leftStrand, String rightStrand) {
        if(leftStrand.isEmpty() && rightStrand.length() > 0) {
            throw new IllegalArgumentException("left strand must not be empty.");
        } else if(rightStrand.isEmpty() && leftStrand.length() > 0) {
            throw new IllegalArgumentException("right strand must not be empty.");
        } else if(leftStrand.length() != rightStrand.length()) {
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }

        calcHammingDistance(leftStrand, rightStrand);
    }

    private void calcHammingDistance(String leftStrand, String rightStrand) {
        int count = 0;
        for(int idx = 0; idx < leftStrand.length(); idx++) {
            if(leftStrand.charAt(idx) != rightStrand.charAt(idx)) {
                count++;
            }
        }
        hammingDist = count;
    }

    public int getHammingDistance() {
        return hammingDist;
    }
}
