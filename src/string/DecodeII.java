package string;

public class DecodeII {
    public static void main(String[] args) {
        DecodeII test = new DecodeII();
        System.out.println(test.decompress("a3b2c0d2e1f3"));
    }
    public String decompress(String input) {
        // left --> right : decode short
        // right --> left: decode long
        if (input.isEmpty()) {
            return input;
        }
        char[] arr = input.toCharArray();
        return decodeLong(arr, decodeShort(arr));

    }
    // return new length after decodeShort
    private int decodeShort(char[] arr) {
        int end  = 0;
        for (int i = 0; i < arr.length ;i+=2) {
            int digit = getDigit(arr[i + 1]);
            if (digit >= 0  && digit <= 2){
                for (int j = 0; j < digit; j++) {
                    arr[end++] = arr[i];
                }
            } else {
                arr[end++] = arr[i];    // keep long code as original
                arr[end++] = arr[i + 1];
            }
        }

        return end;
    }
    private int getDigit(char c) {
        return c - '0';
    }
    private String decodeLong(char[] arr, int length) {
        int newLength = length;
        // calculate new length
        for (int i = 0; i < length; i++) {
            int digit = getDigit(arr[i]);
            newLength += digit - 2;
        }
        char[] result = new char[newLength];
        int end = newLength - 1;
        for (int i = length - 1; i >= 0; i--) {
            int digit = getDigit(arr[i]);
            if (digit > 2 && digit <= 9) {
                i--;
                for (int j = 0; j < digit; j++) {
                    result[end--] = arr[i];
                }
            } else {
                result[end--] = arr[i];
            }
        }
        return new String(result);
    }
}
