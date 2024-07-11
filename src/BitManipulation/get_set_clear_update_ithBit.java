package BitManipulation;

public class get_set_clear_update_ithBit {
    public static int getIthBit(int n, int i) {
        int bitmask = 1 << i;
        if ((n & bitmask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static int setIthBit(int n, int i) {
        int bitMask = 1 << i; // 1 sathe j shift karyi karna k 1 no binary 001 che apde 1 ni jarur se che
        return n | bitMask;
    }

    public static int ClearIthBt(int n, int i) {
        int bitMask = ~(1 << i);
        return n & bitMask;
    }

    public static int UpdateIthBit(int n, int i, int newbit) {
        n = ClearIthBt(n, i);
        int BitMask = newbit << i;
        return n | BitMask;
    }
    public  static  int clearIBits(int n,int i){
        int BitMask=(~0)<<i;
        return  n&BitMask;
    }
    public static void main(String[] args) {
        System.out.println("GetIth bit : " + getIthBit(10, 3));
        System.out.println("SetIth bit : " + setIthBit(10, 2));
        System.out.println("ClearIth bit : " + ClearIthBt(10, 1));
        System.out.println("UpdateIth bit : " + UpdateIthBit(10, 2, 1));
        System.out.println("ClearIbits : "+clearIBits(15,2));
    }
}
