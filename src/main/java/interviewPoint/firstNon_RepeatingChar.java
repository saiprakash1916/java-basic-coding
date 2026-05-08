package interviewPoint;

public class firstNon_RepeatingChar {
    static char firstNonRepeatingChar(String str){
        int[] freq = new int[256];
        for(char ch : str.toCharArray()){
            freq[ch] ++;
        }
        for (char ch : str.toCharArray()){
            if(freq[ch] == 1){
                return ch;
            }
        }
        return '0';
    }

    public static void main(String[] args) {
        String str = "hello";
        System.out.println(firstNonRepeatingChar(str));
    }
}
