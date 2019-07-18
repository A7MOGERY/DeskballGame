import javax.swing.*;
import java.awt.*;


public class BallGame2 extends JFrame {
    Image ball= Toolkit.getDefaultToolkit().getImage("C:\\Users\\14807\\Downloads\\ball.jpg");
    Image desk= Toolkit.getDefaultToolkit().getImage("C:\\Users\\14807\\Downloads\\desk.jpg");

    double x=100;//小球横坐标
    double y=100;//小球纵坐标

    double degree = 3.14/3;//弧度，此处为60度
    //画窗口
    public void paint(Graphics g){
        g.drawImage(desk,0,0,null);
        g.drawImage(ball,(int)x,(int)y,null);
        x=x+5*Math.cos(degree);
        y=y+5*Math.sin(degree);
        if(y>210||y<20){
            degree=-degree;
        }
        if(x<20||x>490){
            degree=3.14-degree;
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
        BallGame2 ballGame=new BallGame2();
        ballGame.launchFrame();
    }
}
