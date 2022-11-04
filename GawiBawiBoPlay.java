package practice.JavaPractice.GawiBawiBo;
import java.util.Random;
import java.util.Scanner;
public class GawiBawiBoPlay{
    void mLine(char a, int b){
        for(b=0;b<=a;b++){
            System.out.print(a);
        }
        System.out.println();
    }
    
    int draw = 0;
    int win = 0;
    int lose = 0;
    int n = 0;

    void start(){
        n++;
        mLine('=',50);
        System.out.printf("\t\t%d번째 게임입니다.\n",n);
        mLine('=',50);
        System.out.println("[1.가위 2.바위 3.보]중 번호를 선택하세요 [종료 : 0]");
    }
    void game(){
        Random random = new Random();
        Scanner scann = new Scanner(System.in);
        String i = scann.nextLine();
        int user = Integer.parseInt(i);
        int computer = random.nextInt(3)+1;

        if(user==0){
            System.out.println("시스템을 종료합니다.");
            System.exit(0);
        }
        if(user==1 && user!=computer){
            if(computer==2){
                System.out.println("\t컴퓨터 : 바위   사용자 : 가위");
                System.out.println("\tㅠㅠ\t 졌습니다 \tㅠㅠ");
                lose++;
            }
            else{
                System.out.println("\t컴퓨터 : 보   사용자 : 가위");
                System.out.println("\t☆☆\t이겼습니다!!\t☆☆");
                win++;
            }
        }
        else if(user==2 && user!=computer){
            if(computer==1){
                System.out.println("\t컴퓨터 : 가위   사용자 : 바위");
                System.out.println("\t☆☆\t이겼습니다!!\t☆☆");
                win++;
            }
            else{
                System.out.println("\t컴퓨터 : 보   사용자 : 바위");
                System.out.println("\tㅠㅠ\t 졌습니다 \tㅠㅠ");
                lose++;
            }
        }
        else if(user==3 && user!=computer){
            if(computer==1){
                System.out.println("\t컴퓨터 : 가위   사용자 : 보");
                System.out.println("\tㅠㅠ\t 졌습니다 \tㅠㅠ");
                lose++;
            }
            else{
                System.out.println("\t컴퓨터 : 바위   사용자 : 보");
                System.out.println("\t☆☆\t이겼습니다!!\t☆☆");
                win++;
            }
        }
        else if(user==computer){
            if(user==1){
                System.out.println(" \t컴퓨터 : 가위     사용자 : 가위");
			    System.out.println("\n\t☆☆\t비겼습니다!!\t☆☆");
			    draw++;
            }
            if(user==2){
                System.out.println(" \t컴퓨터 : 바위     사용자 : 바위");
			    System.out.println("\n\t☆☆\t비겼습니다!!\t☆☆");
			    draw++;
            }
            if(user==3){
                System.out.println(" \t컴퓨터 : 보     사용자 : 보");
			    System.out.println("\n\t☆☆\t비겼습니다!!\t☆☆");
			    draw++;
            }
        }
        System.out.printf("\t\t\t\t\t\t\t총 %d회중\n\t\t\t\t\t\t\t컴퓨터가 %d회 이겼습니다\n\t\t\t\t\t\t\t사용자가 %d회 이겼습니다\n\t\t\t\t\t\t\t그리고 %d회 비겼습니다\n",n,lose,win,draw);
        }
        public static void main(String[] args) {
            GawiBawiBoPlay play = new GawiBawiBoPlay();
            while(true){
                play.start();
                play.game();
            }    
        }
                
}
