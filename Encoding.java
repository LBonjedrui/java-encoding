import java.math.BigInteger;

class Encoding {



    public static String hexToString(String hex) {

        String res = "";
        for (int i = 0 ; i < hex.length() ; i += 2) {
            String tmp = hex.substring(i,i+2);
            res += (char) (Integer.parseInt(tmp, 16));
        }
        return res;

    }

    public static String asciiToString(int[] ascii) {

        String res = "";
        for (int i: ascii) {
            res += (char) i;
        }
        return res;

    }

    public static String intToString(BigInteger message) {

        String res = "";
        String hex = message.toString(16);
        for (int i = 0 ; i < hex.length() ; i += 2) {
            String tmp = hex.substring(i,i+2);
            res += (char) (Integer.parseInt(tmp, 16));
        }
        return res;

    }



    public static String stringToHex(String str) {

        String res = "";
        char[] tmp = str.toCharArray();
        for (char c: tmp) {
            res += Integer.toHexString((int) c);
        }
        return res;

    }

    public static String asciiToHex(int[] ascii) {
        
        String res = "";
        for (int i: ascii) {
            res += Integer.toHexString(i);
        }
        return res;

    }

    public static String intToHex(BigInteger message) {
        return message.toString(16);
    }



    public static int[] stringToASCII(String str) {

        int[] res = new int[ str.length() ];
        for (int i = 0 ; i < str.length() ; i++) {
            res[i] = (int) str.charAt(i);
        }
        return res;

    }

    public static int[] hexToASCII(String hex) {

        int[] res = new int[ hex.length() / 2 ];
        for (int i = 0 ; i < hex.length() ; i += 2) {
            String tmp = hex.substring(i,i+2);
            res[ i / 2 ] = Integer.parseInt(tmp, 16);
        }
        return res;

    }

    public static int[] intToASCII(BigInteger message) {
        
        String hex = message.toString(16);
        int[] res = new int[ hex.length() / 2 ];
        for (int i = 0 ; i < hex.length() ; i += 2) {
            String tmp = hex.substring(i,i+2);
            res[ i / 2 ] = Integer.parseInt(tmp, 16);
        }
        return res;
        
    }



    public static BigInteger stringToInt(String str) {

        String hex = "";
        char[] tmp = str.toCharArray();
        for (char c: tmp) {
            hex += Integer.toHexString((int) c);
        }
        return new BigInteger(hex,16);      

    }

    public static BigInteger hexToInt(String hex) {
        return new BigInteger(hex, 16);
    }

    public static BigInteger asciiToInt(int[] ascii) {
        
        String hex = "";
        for (int i: ascii) {
            hex += Integer.toHexString(i);
        }
        return new BigInteger(hex, 16);

    }



}
