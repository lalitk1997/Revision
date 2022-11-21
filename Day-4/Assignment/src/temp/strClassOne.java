package temp;

/*
interface stringFunctions{
  public void print(String a,String b);
  public int countVowels(String a,String b);
  public int countConsonants(String a,String b);
  public int valueOfString(String a,String b);
}
*/
// Please note that the string contains both uppercase and lowercase characters
class strClassOne {
    // implement all the function inherited by this class
    public String print(String a,String b){
        // This function prints both the strings on the same line separated by space
        return (a+" "+b);
    }
    public int countVowels(String a,String b){
        // This function returns the length of the string having lesser number of vowels.
        //In case both the strings, have the same number of vowels return the length of the bigger string
        int aCount = 0;
        for(int i=0; i<a.length(); i++){
            if(a.charAt(i) == 'a' || a.charAt(i) == 'e' || a.charAt(i) == 'i' || a.charAt(i) == 'o' || a.charAt(i) == 'u' || a.charAt(i) == 'A' || a.charAt(i) == 'E' || a.charAt(i) == 'I' || a.charAt(i) == 'O' || a.charAt(i) == 'U'){
                aCount += 1;
            }
        }

        int bCount = 0;
        for(int i=0; i<b.length(); i++){
            if(b.charAt(i) == 'a' || b.charAt(i) == 'e' || b.charAt(i) == 'i' || b.charAt(i) == 'o' || b.charAt(i) == 'u' || b.charAt(i) == 'A' || b.charAt(i) == 'E' || b.charAt(i) == 'I' || b.charAt(i) == 'O' || b.charAt(i) == 'U'){
                bCount += 1;
            }
        }

        if(aCount < bCount){
            return a.length();
        }else if(aCount > bCount){
            return b.length();
        }else{
            if(a.length() > b.length()){
                return a.length();
            }else{
                return b.length();
            }
        }
    }
    public int countConsonants(String a,String b){
        // This function returns the length of the string having
        // lesser number of consonants
        // In case both the strings have the same number of consonants,
        // return the length of the bigger string

        int aCount = 0;
        for(int i=0; i<a.length(); i++){
            if(a.charAt(i) != 'a' || a.charAt(i) != 'e' || a.charAt(i) != 'i' || a.charAt(i) != 'o' || a.charAt(i) != 'u' || a.charAt(i) != 'A' || a.charAt(i) != 'E' || a.charAt(i) != 'I' || a.charAt(i) != 'O' || a.charAt(i) != 'U'){
                aCount += 1;
            }
        }

        int bCount = 0;
        for(int i=0; i<b.length(); i++){
            if(b.charAt(i) != 'a' || b.charAt(i) != 'e' || b.charAt(i) != 'i' || b.charAt(i) != 'o' || b.charAt(i) != 'u' || b.charAt(i) != 'A' || b.charAt(i) != 'E' || b.charAt(i) != 'I' || b.charAt(i) != 'O' || b.charAt(i) != 'U'){
                bCount += 1;
            }
        }

        if(aCount > bCount){
            return bCount;
        }else if(aCount < bCount){
            return aCount;
        }else{
            if(a.length() > b.length()){
                return a.length();
            }else{
                return b.length();
            }
        }
    }

//    public String print(String a,String b){
//        // This functions prints string a and string b on two different lines
//        return (a+"/n"+b);
//    }
//    public int countVowels(String a,String b){
//        // This function returns the length of the string having more number of vowels.
//        //In case both the strings, have the same number of vowels return the length of the smaller string
//    }
//    public int countConsonants(String a,String b){
//        // This function returns the length of the string having more number of consonants
//        // In case both the strings have the same number of consonants, return the length of the smaller string
//    }
}
