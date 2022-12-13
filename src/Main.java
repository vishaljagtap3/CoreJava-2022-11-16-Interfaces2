public class Main {
    public static void main(String[] args) {

        BitCode b1 = new BitCode(1, "Karve Road, Pune");
        BitCode b2 = new BitCode(2, "Dhayari, Pune");

        ISOVerification.verify(b1);
        System.out.println();
        ISOVerification.verify(b2);

    }
}
