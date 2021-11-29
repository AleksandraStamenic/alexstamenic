class ReverseString {
    public static void main (String[] args) {

        String str= "ABCD", rev="";
        char ch;

        System.out.print("Original word: ");
        System.out.println("ABCD"); //Example word

        for (int i=0; i<str.length(); i++)
        {
            ch= str.charAt(i); //extracts each character
            rev= ch+rev; //adds each character in front of the existing string
        }
        System.out.println("Reversed word: "+ rev);
    }
}


