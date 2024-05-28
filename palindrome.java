class Main {
    public static void main(String[] args) {

        String str = "racecar", reversedStr = "";

        // get the length of the string
        int strLength = str.length();

        // reverse the string
        for (int i = (strLength - 1); i >=0; --i) {
            reversedStr = reversedStr + str.charAt(i);
        }

        // check if the original string and reversed string are equal
        if (str.equalsIgnoreCase(reversedStr)) {
            System.out.println(str + " is a Palindrome.");
        }
        else {
            System.out.println(str + " is not a Palindrome.");
        }
    }
}