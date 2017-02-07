package jp.ac.uryukyu.ie.e165749;

/**
 * Created by South on 2017/02/06.
 */

//
//  Canvasのテストです。
//
import java.awt.*;//FrameやCanvasを使うのに必要なimport文
import java.awt.event.*;//FrameやCanvasのイベント処理に必要

//
// Canvasは継承クラスAppCanvas
//  ★Canvasの継承クラス内中の
//　　　public void paint(Graphics g)
//  は描画の必要が生じると、自動で呼びだれます。
public class DrawCanvas extends Canvas{
    public static void main(String[] args) {
        //アプリはここから実行されます。
        Frame frame = new Frame();//Frameを作成
        AppCanvas canvas = new AppCanvas();//Canvasの継承クラスのAppCanvasを作成
        frame.add(canvas);//canvasをフレームに追加
        frame.addWindowListener(new Adapter());//Windowのイベントの処理先を指定
        frame.setSize(240, 240);//サイズを指定
        frame.setVisible(true);//表示
    }
}

//キャンバスそのものを出力する

