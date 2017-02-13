public class CRC { 
    private String data, divisor;
    public CRC(String d, String di) {
        this.data = d;
        this.divisor = di;
    }
    public String getRemainder(String data, String divisor) {
        int x = 1, z = divisor.length(), j = 0, i;
        String data2 = "", strOfZeros = "";
        int y = divisor.length() - 1;
        /* This is to get correct amount of zero's onto the end of the data */
        while (y > 0) {
            data += "0";
            y--;
        }
        // Main part of method, this is the long division of Binary numbers.
        needToExit: for (i = x, j = 1; i < z && z <= data.length(); i++, j++) {
            if (z == data.length() && data2.charAt(0) == '1') {
                strOfZeros = "";
                for (i = 1; i < divisor.length(); i++) {    
                    if (data2.charAt(i) == divisor.charAt(i))
                        strOfZeros += '0';
                    else
                        strOfZeros += '1';
                }
                data2 = strOfZeros;
                break needToExit;
            }

            if (data.charAt(i) == divisor.charAt(j))
                data2 += "0";
            else
                data2 += "1";

            if (i == divisor.length() - 1) {
                data2 += data.charAt(z);
                x++;
                z++;
                // i = x;
                j = 0;

                // when first bit is a 0
                while (data2.charAt(0) != '1' && i == divisor.length() - 1) {
                    for (i = 1; i < divisor.length(); i++) {
                        if (data2.charAt(i) == '0')
                            strOfZeros += "0";
                        else
                            strOfZeros += "1";
                    }
                    strOfZeros += data.charAt(z);
                    data2 = strOfZeros;
                    strOfZeros = "";
                    x++;
                    z++;
                    i = x;
                }
            }

        }
        return data2;
    }
    public String getDataPlusCRC(String data){
        String str = data.concat(getRemainder(this.data, this.divisor));
        return str;
    }
    public static void main(String )
}