public class StringIntoArray{
    public static void main(String[] args) {
        String s = "-95 -83 -80 -79 -78 -77 -69 -67 -66 -65 -63 -63 -61 -60 -55 -52 -50 -49 -48 -46 -46 -42 -41 -33 -30 -28 -26 -26 -18 -17 -14 -13 -13 -11 -11 -10 -7 -7 -7 -6 -3 0 0 2 5 5 6 11 11 11 17 18 18 20 24 24 32 36 39 41 41 47 47 48 50 51 53 54 55 56 56 62 62 63 63 64 66 71 71 71 76 82 84 86 96";
        String newString = s.replace(" ", ",");
        System.out.println(newString);
    }
}
