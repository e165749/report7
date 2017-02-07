package jp.ac.uryukyu.ie.e165749;

/**
 * Created by South on 2017/02/06.
 */

//import javax.microedition.lcdui.*;
//import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;
//import java.awt.*;//FrameやCanvasを使うのに必要なimport文
//import java.awt.event.*;//FrameやCanvasのイベント処理に必要

public class DrawField extends Field2 {
    public Graphics field_g;
    public int field_x, field_y;
    public int field_width, field_height;
    public int block_width, block_height;

    // 最初に迷路を描画する際に呼び出される
    public void drawfield(Graphics g, int x, int y, int w, int h) {
        // 迷路の描画情報を保存
        field_g = g;
        field_x = x;
        field_y = y;
        field_width = w;
        field_height = h;

        // ブロックのサイズを求める
        block_width = w / width;
        block_height = h / height;

        // 実際に迷路を描画する
        updateField();
    }

    public void updateField() {
        // まず描画する範囲を白色で塗りつぶす
        // 描画する範囲は、ブロックの大きさの整数倍に切捨て
        // (切捨てをしないと、右端と下端に隙間ができてしまう)
        field_g.setColor(Color.black);
        field_g.fillRect(field_x, field_y, block_width * width, block_height * height);

        // 迷路データをチェックし、1ブロックずつ描画
        field_g.setColor(Color.white);
        for (int loop = 0; loop < data.length; loop++)
            drawBlock(field_g, data[loop], field_x + loop % width * block_width,
                    field_y + loop / width * block_height, block_width, block_height);
    }

    // 座標を指定し、ブロックを描画する
    public static void drawBlock(Graphics g, byte type, int x, int y, int w, int h) {
        if (type == WALL)
            g.fillRect(x, y, w, h); // 描画色は黒であることが前提
        //else if (type == ENTRANCE) {
          //  g.setColor(0x00ff0000);
            //g.drawArc(x, y, w, h, 0, 360);
            //g.setColor(0x00000000);
        //} //else if (type == EXIT) {
           // g.setColor(0x000000ff);
            //g.fillArc(x, y, w, h, 0, 360);
            //g.setColor(0x00000000);
        //}
    }
}

//フィールドの基本データ
