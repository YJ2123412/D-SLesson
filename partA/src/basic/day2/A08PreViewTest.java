package basic.day2;

public class A08PreViewTest {
    public static void main(String[] args) {
        
    
        char start = 'A';

         //반복명령 while 맛보기 : 조건이 참인 동안
        while(start<='Z'){
            System.out.print(start++);
        }
        System.out.println();

         while(start>'A'){
            System.out.print(--start);
        }

    }

    
}
