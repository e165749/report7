package jp.ac.uryukyu.ie.e165749;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created by South on 2017/02/06.
 */
public class Adapter  extends WindowAdapter {
    //右上の「×」クリックされると呼び出される
    public void windowClosing(WindowEvent e){
        System.exit(0);//アプリの終了
    }
}

//ウィンドウを閉じるコード