package Test0927;

import java.util.Arrays;
//枚举
enum Day{
    一,二,三,四,五,六,日
}

public class Days {
    public static void main(String[] args) {
        Day day=Day.一;
        System.out.println(day);
        System.out.println(Arrays.toString(Day.values()));
    }
}
