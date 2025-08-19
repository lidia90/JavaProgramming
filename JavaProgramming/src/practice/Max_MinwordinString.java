package practice;

public class Max_MinwordinString {

	public static void main(String[] args) {
		String str = "I am Sumit";
        String[] words = str.split("\\s+");
        
        
        String s_long = words[0];
        String s_small = words[0];
        
        for(int i=0; i < words.length; i++){
            if(words[i].length() > s_long.length()){
                s_long = words[i];
            }
        }
        for(int i=0; i<words.length; i++){
            if(words[i].length() < s_small.length()){
                s_small = words[i];
            }
        }

        System.out.println("Longest word is: "+s_long);
        System.out.println("Smallest word is: "+s_small);
	}

}
