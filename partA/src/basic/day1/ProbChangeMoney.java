package basic.day1;

public class ProbChangeMoney {
    public static void main(String[] args) {
        
    

    int myWon= 1000000; //100만원
    double toYen; //환전한 엔화값

    
    int cost; //여행비용
    int myYen; //남은 여행경비
    double toWon; //남은 경비 환전한 원화 값
    
    double yenTowonRate =9.29; //1엔이 몇원? 살때
    double wonToYenRate =8.97; // 1엔이 몇 원? 팔때
    
    toYen = myWon/yenTowonRate;
    cost = 98760;
    myYen = (int)toYen - cost;
    toWon = myYen*wonToYenRate;


    System.out.println(":::한/일 23.12.28 기준환율:::");
    System.out.println("살 때 1엔= "+ yenTowonRate+"원");
    System.out.println("팔 때 1엔= "+ wonToYenRate+"원");
    System.out.println();

    System.out.println(":::원화를 엔화로 환전하기:::");
    System.out.println("환전할 원화는 "+myWon+"입니다.");
    System.out.println("원화를 엔화로 바꿀때 "+toYen+"입니다");
    System.out.println();

    System.out.println(":::엔화를 원화로 환전할 경우:::");
    System.out.println("일본에서 사용한 금액은 "+cost+"입니다.");
    System.out.println("남은 엔화는 얼마인가요? "+myYen+"엔");
    System.out.println("엔화를 원화로 바꿀때: "+toWon+"원");
    
    }

}

