package ru.job4j.condition;

public class Max {
    public int max(int first, int second) {
        return  first > second ? first : second;
    }

    public int max(int first, int second, int third) {
        return max(third, max(first, second));
    }

    public int max(int first, int second, int third, int fourth) {
        return max(fourth, max(first, second, third));
    }

    public static void main(String[] args) {
        Max max = new Max();
        int maxNum = max.max(-5, 3, 6, -1);
        System.out.println(maxNum);
    }
}
