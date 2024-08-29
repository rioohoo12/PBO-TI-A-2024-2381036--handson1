public class KonversiNumber {
    public static void main(String[] args) {
        //widening
        byte tipeDataByte = 10;
        short tipeDataShort = tipeDataByte;
        int tipeDataInt = tipeDataShort;
        long tipeDataLong = tipeDataInt;
        float tipeDataFloat = tipeDataLong;
        double tipeDataDouble = tipeDataFloat;

        //Narrowing
        int tipeDataInt2 = 129;
        byte tipeDataByte2 = (byte) tipeDataInt2;
        System.out.println(tipeDataByte2);
    }
}
