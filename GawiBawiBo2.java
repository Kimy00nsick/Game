package practice.JavaPractice.GawiBawiBo;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.util.*;
import javax.swing.border.Border;
public class GawiBawiBo2 extends JFrame implements ActionListener{
    
	Panel p1 = new Panel(new GridLayout(2,1));
    Panel p1_1 = new Panel(new GridLayout(1,3));
    Panel p2 = new Panel(new GridLayout(1,3));
    Panel p3 = new Panel(new GridLayout(2,1));
    Panel p3_1 = new Panel(new GridLayout(1,3));
    Panel p3_2 = new Panel(new GridLayout(1,3));
	
	ImageIcon img_btn[] = {
		new ImageIcon("./gawibawibo/가위아이콘.png"),
		new ImageIcon("./gawibawibo/주먹아이콘.png"),
		new ImageIcon("./gawibawibo/보아이콘.png")};

	ImageIcon img_gawi = new ImageIcon("./gawibawibo/가위버튼.png");
	ImageIcon img_bawi = new ImageIcon("./gawibawibo/바위버튼.png");
	ImageIcon img_bo = new ImageIcon("./gawibawibo/보버튼.png");
	ImageIcon img_title = new ImageIcon("./gawibawibo/제목.png");
	ImageIcon img_com = new ImageIcon("./gawibawibo/컴퓨터.png");
	ImageIcon img_result = new ImageIcon("./gawibawibo/결과.png");
	ImageIcon img_user = new ImageIcon("./gawibawibo/유저.png");
	ImageIcon img_comIcon = new ImageIcon("./gawibawibo/컴퓨터아이콘.png");
	ImageIcon img_vsIcon = new ImageIcon("./gawibawibo/vs아이콘.png");
	ImageIcon img_userIcon = new ImageIcon("./gawibawibo/유저아이콘.png");
	ImageIcon img_reset = new ImageIcon("./gawibawibo/리셋.png");
	ImageIcon img_showResult = new ImageIcon("./gawibawibo/결과보기.png");
	ImageIcon img_quit = new ImageIcon("./gawibawibo/그만하기.png");
    ImageIcon img_gawiIcon = new ImageIcon("./gawibawibo/가위아이콘.png");
    ImageIcon img_bawiIcon = new ImageIcon("./gawibawibo/주먹아이콘.png");
    ImageIcon img_boIcon = new ImageIcon("./gawibawibo/보아이콘.png");
    ImageIcon img_winner = new ImageIcon("./gawibawibo/승표시.png");
    ImageIcon img_loser = new ImageIcon("./gawibawibo/패표시.png");
    ImageIcon img_win = new ImageIcon("./gawibawibo/가운데승.png");
    ImageIcon img_draw = new ImageIcon("./gawibawibo/가운데무.png");
    ImageIcon img_lose = new ImageIcon("./gawibawibo/가운데패.png");

	JLabel label_title = new JLabel(img_title);
	JLabel label_com = new JLabel(img_com);
	JLabel label_result = new JLabel(img_result);
	JLabel label_user = new JLabel(img_user);
	JLabel label_comSide = new JLabel(img_comIcon);
	JLabel label_vsIcon = new JLabel(img_vsIcon);
	JLabel label_userSide = new JLabel(img_userIcon);

	JButton btn[] = {
        new JButton(img_gawi),
        new JButton(img_bawi),
	    new JButton(img_bo)};
	
    JButton btn_reset = new JButton(img_reset);
	JButton btn_result = new JButton(img_showResult);
	JButton btn_quit = new JButton(img_quit);
	int draw = 0;
	int win = 0;
	int lose = 0;
    
    public void actionPerformed(ActionEvent e){
  
		Random random = new Random();
        int computer = random.nextInt(3);
        JButton user = (JButton)e.getSource();
        label_comSide.setText(null);
		label_vsIcon.setText(null);
		label_userSide.setText(null);
		label_result.setIcon(img_result);
		if(btn[computer].equals(user)){//무승부
			if(user.equals(btn[0])){label_userSide.setIcon(img_btn[0]);}
			if(user.equals(btn[1])){label_userSide.setIcon(img_btn[1]);}
			if(user.equals(btn[2])){label_userSide.setIcon(img_btn[2]);}
			label_comSide.setIcon(img_btn[computer]);
		    label_com.setIcon(img_loser);
            label_vsIcon.setIcon(img_draw);
            label_user.setIcon(img_loser);
			draw++;
        }
		else if(user.equals(btn[0]) && !(btn[computer].equals(user))){//유저 가위
			label_userSide.setIcon(img_btn[0]);
			if(btn[computer] == btn[1]){
				label_comSide.setIcon(img_btn[1]);
				label_com.setIcon(img_winner);
				label_vsIcon.setIcon(img_lose);
				label_user.setIcon(img_loser);
				lose++;
		}
			 else{
				label_comSide.setIcon(img_btn[2]);
				label_com.setIcon(img_loser);
				label_vsIcon.setIcon(img_win);
				label_user.setIcon(img_winner);
				win++;
			}
		
    }
	else if(user.equals(btn[1])&& !(btn[computer].equals(user))){//유저 바위
		label_userSide.setIcon(img_btn[1]);
			if(btn[computer] == btn[2]){
				label_comSide.setIcon(img_btn[2]);
				label_com.setIcon(img_winner);
				label_vsIcon.setIcon(img_lose);
				label_user.setIcon(img_loser);
				lose++;
		}
			else{
				label_comSide.setIcon(img_btn[0]);
				label_com.setIcon(img_loser);
				label_vsIcon.setIcon(img_win);
				label_user.setIcon(img_winner);
				win++;
			}  
    }
	else if(user.equals(btn[2])&& !(btn[computer].equals(user))){//유저 보
		label_userSide.setIcon(img_btn[2]);
			if(btn[computer] == btn[0]){
				label_comSide.setIcon(img_btn[0]);
				label_com.setIcon(img_winner);
				label_vsIcon.setIcon(img_lose);
				label_user.setIcon(img_loser);
				lose++;
		}
			else{
				label_comSide.setIcon(img_btn[1]);
				label_com.setIcon(img_loser);
				label_vsIcon.setIcon(img_win);
				label_user.setIcon(img_winner);
				win++;
			} 
    }
	//결과보기
	if(user.equals(btn_result)){
		String comwin =lose+"승";
		String userwin = win+"승";
		String allresult = draw+"무";
		label_comSide.setIcon(new ImageIcon("./gawibawibo/배경.png"));
		label_userSide.setIcon(new ImageIcon("./gawibawibo/배경.png"));
		label_comSide.setText(comwin);
		label_userSide.setText(userwin);
		label_vsIcon.setIcon(new ImageIcon("./gawibawibo/경기결과.png"));
		label_comSide.setHorizontalTextPosition(JLabel.CENTER);
		label_userSide.setHorizontalTextPosition(JLabel.CENTER);
		label_vsIcon.setText(allresult);
		label_vsIcon.setHorizontalTextPosition(JLabel.CENTER);
		label_comSide.setFont(new Font("휴먼둥근헤드라인",Font.BOLD,25));
		label_vsIcon.setFont(new Font("휴먼둥근헤드라인",Font.BOLD,25));
		label_userSide.setFont(new Font("휴먼둥근헤드라인",Font.BOLD,25));
		if (lose > win){
			label_com.setIcon(new ImageIcon("./gawibawibo/최종승.png"));
			label_user.setIcon(new ImageIcon("./gawibawibo/최종패.png"));
			label_result.setIcon(new ImageIcon("./gawibawibo/컴승리.png"));
		}
		if(lose == win){
			label_com.setIcon(new ImageIcon("./gawibawibo/최종패.png"));
			label_user.setIcon(new ImageIcon("./gawibawibo/최종패.png"));
			label_result.setIcon(new ImageIcon("./gawibawibo/무승부.png"));
		}
		if(lose < win){
			label_com.setIcon(new ImageIcon("./gawibawibo/최종패.png"));
			label_user.setIcon(new ImageIcon("./gawibawibo/최종승.png"));
			label_result.setIcon(new ImageIcon("./gawibawibo/유저승리.png"));
		}
	}
	//리셋
	if(user.equals(btn_reset)){
		lose = 0;
		win = 0;
		draw = 0;
		label_comSide.setText(null);
		label_vsIcon.setText(null);
		label_userSide.setText(null);
		label_com.setIcon(img_com);
		label_result.setIcon(img_result);
		label_user.setIcon(img_user);
		label_comSide.setIcon(img_comIcon);
		label_vsIcon.setIcon(img_vsIcon);
		label_userSide.setIcon(img_userIcon);
	}
	//그만하기
	if(user.equals(btn_quit)){
		System.exit(0);
	}
	   

	}


    public static void main(String[] args) {
        GawiBawiBo2 obj = new GawiBawiBo2();
        obj.setLayout(new GridLayout(3,1));
		Border border = BorderFactory.createLineBorder(Color.DARK_GRAY);
		obj.label_title.setBorder(border);
        // 1열
        obj.add(obj.p1);
        obj.p1.add(obj.label_title);
        obj.p1.add(obj.p1_1);
        obj.p1_1.add(obj.label_com);
        obj.p1_1.add(obj.label_result);
        obj.p1_1.add(obj.label_user);
        // 2열 
        obj.add(obj.p2);
        obj.p2.add(obj.label_comSide);
        obj.p2.add(obj.label_vsIcon);
        obj.p2.add(obj.label_userSide);
        // 3열
        obj.add(obj.p3);
        obj.p3.add(obj.p3_1);
        obj.p3_1.add(obj.btn[0]);
        obj.p3_1.add(obj.btn[1]);
        obj.p3_1.add(obj.btn[2]);
        obj.p3.add(obj.p3_2);
        obj.p3_2.add(obj.btn_reset);
        obj.p3_2.add(obj.btn_result);
        obj.p3_2.add(obj.btn_quit);
       
		for (int i = 0;i<obj.btn.length ;i++ )
        {
			obj.btn[i].addActionListener(obj);
        }
	    obj.btn_reset.addActionListener(obj);
		obj.btn_result.addActionListener(obj);
		obj.btn_quit.addActionListener(obj);
	   
//set frame
        obj.setTitle("가위-바위-보 게임");
	    obj.setSize(650,800);
	    obj.setVisible(true);

		 obj.addWindowListener(new WindowListener(){
            public void windowActivated(WindowEvent e){}
            public void windowClosed(WindowEvent e){}
            public void windowClosing(WindowEvent e){
                System.exit(0);
                }
            public void windowDeactivated(WindowEvent e){}
            public void windowDeiconified(WindowEvent e){}
            public void windowIconified(WindowEvent e){}
            public void windowOpened(WindowEvent e){}
        }
        );
	  
    }
}
