package zipcode;

public class Hamming {
    private String s;
    private String s1;

    public Hamming(String s, String s1) throws IllegalArgumentException{
        //exception here:
        if(s.length() != s1.length())
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");

        this.s = s;
        this.s1 = s1;
    }

    public int getHammingDistance() {
        //where the real magic happens
        Integer counter = 0;
        if(s.length() == s1.length()){
            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i) != s1.charAt(i)){
                    counter++;
                }
            }
        }

        return counter;
    }
}
