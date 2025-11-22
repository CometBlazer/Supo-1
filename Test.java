public class Test {

    public static int lowestCommon(long a, long b){
        for(int pos = 0; pos < 16; pos++){
            long mask = 1L;

            if(((a & mask) != 0) && ((b & mask) != 0)){
                return pos;
            }

            a >>= 1;
            b >>= 1;

            if(a == 0 || b == 0){
                break;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println("Lowest common set bit position of 18 and 20: " + lowestCommon(14, 25));
    }
}
