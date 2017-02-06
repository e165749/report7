package jp.ac.uryukyu.ie.e165749;

/**
 * Created by South on 2017/02/06.
 */
//import javax.microedition.midlet.MIDlet;
//import javax.microedition.lcdui.*;
import java.awt.Graphics;
//import java.awt.Color;
import java.awt.*;
//import java.awt.event.*;//FrameやCanvasのイベント処理に必要
//import org.eclipse.swt.widgets.Display;
//import org.eclipse.swt.widgets.Shell;
import java.applet.Applet;
//import java.awt.Graphics;
//import java.awt.Color;

public class DisplayField extends Applet{
    // 迷路データは内部クラスで参照するため、
    // インスタンス変数として宣言
    private DrawField md;

    // 最初に実行される部分
    public void startApp() {

        // 迷路データを用意する
        md = new DrawField();
        md.init();

        // 表示するための Canvas クラスを定義し、生成
        Canvas canvas = new Canvas() {
            public void paint(Graphics g) {
                // まず全体を黒色で塗りつぶす
                g.setColor(Color.white);
                g.fillRect(0, 0, getWidth(), getHeight());
                // 周りに5ドット残し、迷路を描画
                md.drawfield(g, 5, 5, getWidth() - 10, getHeight() - 10);
            }
        };

        // 生成した Canvas インスタンスを表示
       // Display.getDisplay(this).setCurrent(canvas);
    }
   // public void paint(Graphics g){
   //     g.drawString("Canvas Test", 0, 120);//文字を表示
   // }

   // public void pauseApp() {}
    //public void destroyApp(boolean unconditional) {}
}
