package object.day8.day8_Interface;

public class B16MyClassMain {
    public static void main(String[] args) {
        //인터페이스는 객체생성 못함
        //단 익명 내부 타입으로 정의는 가능
        //InterfaceA ifA = new InterfaceA() {
            
      
        //구현클래스로 객체 생성
        MyClassA mya = new MyClassA();

        //업캐스팅 가능
        InterfaceA ifa = new MyClassA();

        //다운 캐스팅 가능
       // MyClassA temp = (MyClassA)ifa;

        System.out.println("참조타입 변수와 상관없이 똑같이 실행됨");
        mya.methodA();
        ifa.methodA();

  };
}
    

