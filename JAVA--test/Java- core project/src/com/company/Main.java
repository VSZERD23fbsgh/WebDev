package com.company;

public class Main {

    public static void main(String[] args) {
        Scanner kbReader = new Scanner(System.in);
        System.out.print("Enter a sentence that is to be encrypted: ");
        String sntnc = kbReader.nextLine( );
        System.out.println("Original sentence = " + sntnc);
        Crypto myCryptObj = new Crypto( );
        String encryptdSntnc = myCryptObj.encrypt(sntnc);
        System.out.println("Encrypted sentence = " + encryptdSntnc);
        String decryptdSntnc = myCryptObj.decrypt(encryptdSntnc);
        System.out.println("Decrypted sentence = " + decryptdSntnc);
    }
}

public class Crypto {
    public String encrypt (String full) {
        String sep[] = full.split(" ");
        String end = "";
        for(int x = 0; x != sep.length; x++) {
            String endcon = "";
            for(int y = 0; y != sep[x].length(); y++) {
                if((sep[x].charAt(y) == 'v') || (sep[x].charAt(y) == 'V')) {
                    endcon += "ag'.r";
                }
                else if((sep[x].charAt(y) == 'm') || (sep[x].charAt(y) == 'M')) {
                    endcon += "ssad";
                }
                else if((sep[x].charAt(y) == 'g') || (sep[x].charAt(y) == 'G')) {
                    endcon += "jeb..w";
                }
                else if((sep[x].charAt(y) == 'b') || (sep[x].charAt(y) == 'B')) {
                    endcon += "dug>?/";
                }
            }
            end += endcon;
        }
        return  end;
    }
    public String decrypt (String full) {
        full = full.replaceAll("ag',r"  , "v");
        full = full.replaceAll("ssad"   , "m");
        full = full.replaceAll("jeb..w" , "g");
        full = full.replaceAll("dog>?/" , "b");
        return full;
    }
}
//v > ag',r
//m > ssad
//g > jeb..w
//B > dug>?/
