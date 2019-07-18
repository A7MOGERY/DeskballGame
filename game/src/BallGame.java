import sun.awt.image.ToolkitImage;

import javax.swing.*;
import java.awt.*;

public class BallGame extends JFrame {

    Image ball= Toolkit.getDefaultToolkit().getImage("C:\\Users\\14807\\Downloads\\ball.jpg");
    Image desk= Toolkit.getDefaultToolkit().getImage("C:\\Users\\14807\\Downloads\\desk.jpg");
    double x=100;//小球横坐标
    double y=100;//小球纵坐标
    boolean right = true;
    //画窗口
    public void paint(Graphics g){
        g.drawImage(desk,0,0,null);
        g.drawImage(ball,(int)x,(int)y,null);
        if (right){
            x=x+5;
        }else {
            x=x-5;
        }
        if (x>490){
            right=false;
        }
        if (x<0){
            right=true;
        }
    }
    //窗口加载
    void launchFrame(){
        setSize(555,300);
        setLocation(400,400);
        setVisible(true);
        //重画窗口
        while(true){
            repaint();
            try {
                Thread.sleep(40);//40ms,1s=1000ms
            }catch (Exception e){
                e.printStackTrace();
            }

        }
    }

    public static void main(String[] args) {
        BallGame ballGame=new BallGame();
        ballGame.launchFrame();
    }




}
