package practice.JavaPractice.GawiBawiBo;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.util.*;
import javax.swing.border.Border;
public class GawiBawiBo4 extends JFrame implements ActionListener{
    
	Panel p1 = new Panel(new GridLayout(2,1));
    Panel p1_1 = new Panel(new GridLayout(1,3));
    Panel p2 = new Panel(new GridLayout(1,3));
    Panel p3 = new Panel(new GridLayout(2,1));
    Panel p3_1 = new Panel(new GridLayout(1,3));
    Panel p3_2 = new Panel(new GridLayout(1,3));
	
    ImageIcon img_title = new ImageIcon("./gawibawibo/제목.png");
	ImageIcon img_btnIcon[] = {
		new ImageIcon("./gawibawibo/가위아이콘.png"),
		new ImageIcon("./gawibawibo/주먹아이콘.png"),
		new ImageIcon("./gawibawibo/보아이콘.png")};
    ImageIcon img_btn[] = {
	    new ImageIcon("./gawibawibo/가위버튼.png"),
	    new ImageIcon("./gawibawibo/바위버튼.png"),
	    new ImageIcon("./gawibawibo/보버튼.png")};
    ImageIcon img_2line[] = {
        new ImageIcon("./gawibawibo/컴퓨터.png"),
        new ImageIcon("./gawibawibo/결과.png"),
        new ImageIcon("./gawibawibo/유저.png")};
    ImageIcon img_3line[] = {
        new ImageIcon("./gawibawibo/컴퓨터아이콘.png"),
        new ImageIcon("./gawibawibo/vs아이콘.png"),
        new ImageIcon("./gawibawibo/유저아이콘.png")};
	ImageIcon img_btn2 [] = {
		new ImageIcon("./gawibawibo/리셋.png"),
		new ImageIcon("./gawibawibo/결과보기.png"),
		new ImageIcon("./gawibawibo/그만하기.png")};
    ImageIcon img_winner = new ImageIcon("./gawibawibo/승표시.png");
    ImageIcon img_loser = new ImageIcon("./gawibawibo/패표시.png");
	ImageIcon img_midResult [] = {
		new ImageIcon("./gawibawibo/가운데승.png"),
		new ImageIcon("./gawibawibo/가운데무.png"),
		new ImageIcon("./gawibawibo/가운데패.png")
	};
	JLabel label_title = new JLabel(img_title);
	JLabel label_2line [] = {
        new JLabel(img_2line[0]),
        new JLabel(img_2line[1]),
        new JLabel(img_2line[2])
    };
    JLabel label_3line [] = {
        new JLabel(img_3line[0]),
        new JLabel(img_3line[1]),
        new JLabel(img_3line[2])
    };
	JButton btn[] = {
        new JButton(img_btn[0]),
        new JButton(img_btn[1]),
	    new JButton(img_btn[2])};
	JButton btn2[] = {
		new JButton(img_btn2[0]),
		new JButton(img_btn2[1]),
		new JButton(img_btn2[2])
	};
	int draw = 0;
	int win = 0;
	int lose = 0;
    
    public void actionPerformed(ActionEvent e){
  
		Random random = new Random();
        int computer = random.nextInt(3);
        JButton user = (JButton)e.getSource();
        for(int i = 0;i<label_3line.length;i++){label_3line[i].setText(null);}
		label_2line[1].setIcon(img_2line[1]);  
        if(user.getIcon().equals(img_btn[computer])){
            label_3line[0].setIcon(img_btnIcon[computer]);
            label_3line[2].setIcon(img_btnIcon[computer]);
            label_3line[1].setIcon(img_midResult[1]);
            label_2line[0].setIcon(img_loser);
            label_2line[2].setIcon(img_loser);
            draw++;
            }
        else if(user.getIcon()==img_btn[0] && computer==2||
                user.getIcon()==img_btn[1] && computer==0||
                user.getIcon()==img_btn[2] && computer==1){
                    for(int i=0;i<img_btn.length;i++)if(user.getIcon()==img_btn[i])label_3line[2].setIcon(img_btnIcon[i]);
                    win++;
                    label_2line[0].setIcon(img_loser);
                    label_2line[2].setIcon(img_winner);
                    label_3line[0].setIcon(img_btnIcon[computer]);
                    label_3line[1].setIcon(img_midResult[0]);
                }
        else if(user.getIcon()==img_btn[0] && computer==1||
                user.getIcon()==img_btn[1] && computer==2||
                user.getIcon()==img_btn[2] && computer==0){
                    for(int i=0;i<img_btn.length;i++)if(user.getIcon()==img_btn[i])label_3line[2].setIcon(img_btnIcon[i]);
                    lose++;
                    label_2line[0].setIcon(img_winner);
                    label_2line[2].setIcon(img_loser);
                    label_3line[0].setIcon(img_btnIcon[computer]);
			        label_3line[1].setIcon(img_midResult[2]);  
                }
	//결과보기
	if(user.equals(btn2[1])){
		String comwin =lose+"승";
		String userwin = win+"승";
		String allresult = draw+"무";
		label_3line[1].setIcon(new ImageIcon("./gawibawibo/배경.png"));
		label_3line[0].setIcon(new ImageIcon("./gawibawibo/배경.png"));
		label_3line[2].setIcon(new ImageIcon("./gawibawibo/배경.png"));
		label_3line[1].setHorizontalTextPosition(JLabel.CENTER);
		label_3line[1].setText(allresult);
		label_3line[0].setText(comwin);
		label_3line[2].setText(userwin);
		label_3line[0].setHorizontalTextPosition(JLabel.CENTER);
		label_3line[2].setHorizontalTextPosition(JLabel.CENTER);
        for(int i = 0;i<label_3line.length;i++){label_3line[i].setFont(new Font("휴먼둥근헤드라인",Font.BOLD,25));}
		if (lose > win){
			label_2line[0].setIcon(new ImageIcon("./gawibawibo/최종승.png"));
			label_2line[2].setIcon(new ImageIcon("./gawibawibo/최종패.png"));
			label_2line[1].setIcon(new ImageIcon("./gawibawibo/컴승리.png"));
		}
		if(lose == win){
			label_2line[0].setIcon(new ImageIcon("./gawibawibo/최종패.png"));
			label_2line[2].setIcon(new ImageIcon("./gawibawibo/최종패.png"));
			label_2line[1].setIcon(new ImageIcon("./gawibawibo/무승부.png"));
		}
		if(lose < win){
			label_2line[0].setIcon(new ImageIcon("./gawibawibo/최종패.png"));
			label_2line[2].setIcon(new ImageIcon("./gawibawibo/최종승.png"));
			label_2line[1].setIcon(new ImageIcon("./gawibawibo/유저승리.png"));
		}
	}
	//리셋
	if(user.equals(btn2[0])){
		lose = 0;
		win = 0;
		draw = 0;
		for(int i = 0;i<label_3line.length;i++){
			label_3line[i].setText(null);
			label_3line[i].setIcon(img_3line[i]);
			label_2line[i].setIcon(img_2line[i]);
		}
	}
	//그만하기
	if(user.equals(btn2[2])){
		System.exit(0);
	}  
	}

    public static void main(String[] args) {
        GawiBawiBo4 obj = new GawiBawiBo4();
        obj.setLayout(new GridLayout(3,1));
		Border border = BorderFactory.createLineBorder(Color.DARK_GRAY);
		obj.label_title.setBorder(border);
        // 1열
        obj.add(obj.p1);
        obj.p1.add(obj.label_title);
        obj.p1.add(obj.p1_1);
		for(int i = 0;i<obj.label_2line.length;i++)obj.p1_1.add(obj.label_2line[i]);
        // 2열 
        obj.add(obj.p2);
		for(int i = 0;i<obj.label_3line.length;i++)obj.p2.add(obj.label_3line[i]);
        // 3열
        obj.add(obj.p3);
        obj.p3.add(obj.p3_1);
		for(int i = 0;i<obj.btn.length ;i++ )obj.p3_1.add(obj.btn[i]);
        obj.p3.add(obj.p3_2);
		for(int i = 0;i<obj.btn.length ;i++ )obj.p3_2.add(obj.btn2[i]);
		for (int i = 0;i<obj.btn.length ;i++ )obj.btn[i].addActionListener(obj);
		for (int i = 0;i<obj.btn2.length ;i++)obj.btn2[i].addActionListener(obj);   
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
