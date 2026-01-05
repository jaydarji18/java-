public class Datatypes {
    private static final boolean TRUE = true;

    public static void main(String args[]) {
        byte b = 1;
        short s = 3200;
        int i = 20;
        long l = 10000000L;
        float f = 100.2f;
        double d = 1000000.200;
        char c = 1000;
        boolean br = TRUE;

        System.out.println("\nByte:" + b + "\nShort:" + s + "\nInt:" + i + "\nlong:" + l + "\nfloat:" + f + "\ndouble:"
                + d + "\nchar:" + c + "\nboolean:" + br);

        // var is used as integer and it must be initialized and used with local variable
        var ab = 20;
        System.out.println(ab);
    }
}
