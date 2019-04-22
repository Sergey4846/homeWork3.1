public class Solution {
    public static void main(String[] args) {

        int s = 3700;
        int sec;
        int m;
        int min, h;
        int hour;
        int day, d;
        int week, w;

        sec = s % 60;
        m = (s - sec) / 60;
        min = m % 60;
        h = (m - min) / 60;
        hour = h % 24;
        d = (h - hour) / 24;
        day = d % 7;
        w = (d - day) / 7;


        System.out.println(w + " недель " + d + " суток " + h + " часов " + min + " минут " + sec + " секунд ");
    }


}