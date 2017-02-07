package jp.ac.uryukyu.ie.e165749;

/**
 * Created by South on 2017/02/06.
 */
//import java.awt.*;//FrameやCanvasを使うのに必要なimport文
//import java.awt.event.*;//FrameやCanvasのイベント処理に必要
//import java.awt.Graphics;
//import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.*;

public class Main extends WindowAdapter {
    public static void main(String[] args){

        DisplayField displayfield = new DisplayField();
        displayfield.startApp();

        Field2 field2 = new Field2();
        field2.init();

       // DrawField drawfileder = new DrawField();
        //drawfileder.drawfield(); //ここにgrapfhicsの引数が必要だが何入れればいいのかわからない




     //   Adapter adapter = new Adapter();
     //   adapter.windowClosing();
            //アプリはここから実行されます。
           // Frame frame=new Frame();//Frameを作成
           //AppCanvas canvas=new AppCanvas();//Canvasの継承クラスのAppCanvasを作成
           // frame.add(canvas);//canvasをフレームに追加
           // frame.addWindowListener(new Adapter());//Windowのイベントの処理先を指定
           // frame.setSize(240,240);//サイズを指定
          //  frame.setVisible(true);//表示


        /*
        Hero hero = new Hero("勇者", 10, 5);
        Enemy enemy = new Enemy("スライム", 6, 3);
        System.out.printf("%s vs. %s\n", hero.getName(), enemy.getName());

        int turn = 0;
        while( hero.isDead() == false && enemy.isDead() == false ){
            turn++;
            System.out.printf("%dターン目開始！\n", turn);
            hero.attack(enemy);
            enemy.attack(hero);
        }
        System.out.println("戦闘終了");
        //こみっとプッシュ確認のためのテストコメント
        */
    }
    public void windowClosing(WindowEvent e) {
        System.exit(0);//アプリの終了
    }

}