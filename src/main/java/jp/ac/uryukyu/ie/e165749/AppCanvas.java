package jp.ac.uryukyu.ie.e165749;

import java.awt.*;

/**
 * Created by South on 2017/02/06.
 */
public class AppCanvas extends Canvas {

  //  DrawField drawfield = new DrawField();
  //  drawfield.drawfield(g,x,y,w,h);
    //以下に描画したい内容を書く
    public void paint(Graphics g){
       // g.drawfield(g, 5, 5, getWidth() - 10, getHeight() - 10);
        g.drawString("Canvas Test", 0, 120);//文字を表示
        g.setColor(Color.blue);
        g.fillRect(0, 0, getWidth(), getHeight());
        // 周りに5ドット残し、迷路を描く
    }
}
//実際のフィールドの描画