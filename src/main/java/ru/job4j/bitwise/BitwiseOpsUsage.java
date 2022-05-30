package ru.job4j.bitwise;

public class BitwiseOpsUsage {

    static final int hash(Object key) {
        int h = key.hashCode();
        return (key == null) ? 0 : h ^ (h >>> 16);
    }

    public static String binary(int num) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 31; i++) {
            sb.append(num % 2 == 0 ? 0 : 1);
            sb.append((i + 1) % 8 == 0 ? " " : "");
            num /= 2;
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        int a = 342;
        System.out.println("Binary form output: " + Integer.toBinaryString(a));
        System.out.println("Bitwise unary NOT: " + Integer.toBinaryString(~a));
        System.out.println("Bitwise AND: " + (277 & 432));
        System.out.println("Bitwise OR: " + (277 | 432));
        System.out.println("Bitwise exclusive OR: " + (277 ^ 432));
        int z = (64 << 3);
        System.out.println(Integer.toBinaryString(z));
        System.out.println("Shift left: " + Integer.toBinaryString(z));
        System.out.println(64 << 26);
        System.out.println("Every shift left == (value * 2): " + (111111111 << 3));
        System.out.println("Every shift right == (value % 2): " + (35 >> 2));
        System.out.println("Shift right zero fill: " + (123 >>> 4));
        System.out.println(binary(123));
        System.out.println(binary(123 >>> 4));
        System.out.println(binary(255));
        System.out.println(binary(255 >>> 4));
        System.out.println(binary(Integer.MAX_VALUE));
        System.out.println(binary(Integer.MAX_VALUE >>> 16));
    }
}
