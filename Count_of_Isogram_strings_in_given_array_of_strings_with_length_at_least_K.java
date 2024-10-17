
// Enter the Array String : 4
// Enter the Array String Values : ag bka lkmn asdfg
// Enter the k value : 2
// 4

// Enter the Array String : 3
// Enter the Array String Values : abcd der erty
// Enter the k value : 4
// 2

// Tc : O(n^2)



public class Count_of_Isogram_strings_in_given_array_of_strings_with_length_at_least_K {

    static boolean isPalindrom(String s){

        int n2 = s.length();

        // Palindromic String
        for(int i=0; i<n2; i++){
            for(int j=i+1; j<=n2-1; j++){
                if(s.charAt(i) == s.charAt(j)){
                    return false;
                }
            }
        }
        return true;
    }

    static int countIsogramPalindromicWithGivenK(String[] str){
        int k = 4;
        int count = 0;
        int n = str.length;


        for(int i=0; i<n; i++){

            if(isPalindrom(str[i]) && str[i].length() >= k){
                count = count + 1;
            }
        }
        return count;
    }

    public static void main(String[] args){

        String[] str = {"abcde", "sfgcv", "abxcz", "kjmn"}; // o/p: will be 4  


        // countIsogramPalindromicWithGivenK(str);

        System.out.println("Number of Isogram in Given String with k length : " + countIsogramPalindromicWithGivenK(str));


    }
}


