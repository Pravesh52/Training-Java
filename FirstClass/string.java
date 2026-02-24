public class string {
    public static void main(String[] args) {
        String str="Pravesh";
//check reverse
       String rev=" ";


        for(int i=str.length()-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }
        System.out.println(str);
        System.out.println(rev);

        // check palindrom
        boolean palindrome = true;

        int left=0;
        int right=str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                palindrome = false;
                break;
            }
            left++;
            right--;
        }

        if (palindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }


        String str2="Pravesh";

        str2=str2.toLowerCase();

        int vowel=0, cons=0;

        for(int i=0;i<str2.length();i++){
            char c1=str.charAt(i);
            if(c1>='a' && c1 <='z')
            {
                if(c1=='a' || c1=='e' || c1=='i'|| c1=='o'||c1=='u'){
                     vowel++;
                }else{
                    cons++;
                }
            }
        }
        System.out.println("Vowel: "+vowel);
        System.out.println("Consonent: "+cons);


    }
}
