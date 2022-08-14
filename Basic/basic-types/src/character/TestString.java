package character;

import java.util.Date;

public class TestString {
    public static String randomString(int lengthc) {
        char[] s = new char[lengthc];
        short start = '0';
        short end = 'z' + 1;
        for (int i = 0; i < s.length; i++) {
            while (true) {
                char cc = (char) ((Math.random() * (end - start)) + start);
                if (Character.isLetter(cc) || Character.isDigit(cc)) {
                    s[i] = cc;
                    break;
                }
            }
        }
        String result = new String(s);
        return result;
    }

    public static void main(String[] args) {
        String str = randomString(10);
        StringBuffer sb = new StringBuffer(str);
        MyStringBuffer msb = new MyStringBuffer(str);
        Date start_time = new Date();
        int total = 1000000;
        for (int i = 0; i < total; i++) {
            sb = sb.append(randomString(100));
        }
        Date end_time = new Date();
        System.out.printf("使用StringBuffer连接+的方式，连接%d次，耗时%d毫秒%n", total, end_time.getTime() - start_time.getTime());
        start_time = new Date();
        for (int i = 0; i < total; i++) {
            msb.append(randomString(100));
        }
        end_time = new Date();
        System.out.printf("使用MyStringBuffer的方式，连接%d次，耗时%d毫秒%n", total, end_time.getTime() - start_time.getTime());

    }
}