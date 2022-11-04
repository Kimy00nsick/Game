package practice.JavaPractice.GawiBawiBo;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
public class GawiBawiBo extends Frame implements ActionListener{
    JButton btnGawi = new JButton("가위");
    JButton btnBawi = new JButton("바위");
    JButton btnBo = new JButton("보");

    Button btnStart = new Button("게임을 시작합니다");
    Button btnExit = new Button("게임을 종료합니다");
    Panel panel_Top = new Panel(new GridLayout(2,1));
    Panel panel_Top2 = new Panel(new GridLayout(1,3));
    Panel panel_Cen = new Panel(new GridLayout());
    Panel panel_Bot = new Panel(new FlowLayout());
    
    Label label_Top = new Label("가위 바위 보 게임",1);
    Label label_Left = new Label("컴퓨터",1);
    Label label_Right = new Label("유저",1);
    Label label_Mid = new Label("결과",1);
    
    public void actionPerformed(ActionEvent e){
        Random random = new Random();
        int computer = random.nextInt(3);
        String com[] = {"가위", "바위", "보"};
        if(com[computer] == e.getActionCommand()){
            System.out.println("비겼습니다.");
        }
        if(e.getActionCommand()=="가위"){
            if(com[computer]=="바위"){
                System.out.println("졌습니다.");
            }
            else if(com[computer]=="보"){
                System.out.println("이겼습니다");
            }
        }
        if(e.getActionCommand()=="바위"){
            if(com[computer]=="보"){
                System.out.println("졌습니다.");
            }
            else if(com[computer]=="가위"){
                System.out.println("이겼습니다");
            }
        }
        if(e.getActionCommand()=="보"){
            if(com[computer]=="가위"){
                System.out.println("졌습니다.");
            }
            else if(com[computer]=="바위"){
                System.out.println("이겼습니다");
            }
        }
    
    }
    public static void main(String[] args) {
        GawiBawiBo k = new GawiBawiBo();
     
        k.setLayout(new BorderLayout(20,20));
        k.setBackground(Color.gray);
        //1행
        k.add(k.panel_Top,BorderLayout.NORTH);
        k.panel_Top.add(k.label_Top);
        k.panel_Top.add(k.panel_Top2);
        k.panel_Top2.add(k.label_Left);
        k.panel_Top2.add(k.label_Mid);
        k.panel_Top2.add(k.label_Right);


        //2행
        k.label_Left.setBackground(Color.darkGray);
        k.label_Right.setBackground(Color.darkGray);
        k.add(k.panel_Cen);
        k.panel_Cen.add(k.btnGawi);
        k.panel_Cen.add(k.btnBawi);
        k.panel_Cen.add(k.btnBo);
        k.btnGawi.addActionListener(k);
        k.btnBawi.addActionListener(k);
        k.btnBo.addActionListener(k);
        k.btnGawi.setFont(new Font("굴림체",Font.BOLD,20));
        k.btnBawi.setFont(new Font("굴림체",Font.BOLD,20));
        k.btnBo.setFont(new Font("굴림체",Font.BOLD,20));
    
        //3행
        k.add(k.panel_Bot,BorderLayout.SOUTH);
        k.panel_Bot.add(k.btnStart);
        k.panel_Bot.add(k.btnExit);
        k.panel_Bot.setBackground(Color.darkGray);
        k.panel_Bot.setBackground(Color.darkGray);

       
        k.setTitle("가위바위보 게임");
        k.setSize(600,600);
        k.setVisible(true);

        k.addWindowListener(new WindowListener(){
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

        k.btnExit.addMouseListener(new MouseListener(){
            public void mouseClicked(MouseEvent e){
                System.exit(0);
            }
            public void mouseEntered(MouseEvent e){}
            public void mouseExited(MouseEvent e){}
            public void mousePressed(MouseEvent e){}
            public void mouseReleased(MouseEvent e){}  
        });

        }
        
    }
    

