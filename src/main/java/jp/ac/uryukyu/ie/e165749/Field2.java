package jp.ac.uryukyu.ie.e165749;

/**
 * Created by South on 2017/02/06.
 */
public class Field2 extends Field {
    public void init() {
        width = 9;  // フィールド横幅は 9
        height = 6; // フィールド縦幅は 6
        data = new byte[] {
                1, 1, 1, 1, 1, 1, 1, 1, 1,  // 0 = 通れるところ
                1, 0, 0, 0, 0, 0, 0, 0, 1,  // 1 = 壁
                1, 0, 0, 0, 0, 0, 0, 0, 1,
                1, 0, 0, 0, 0, 0, 0, 0, 1,
                1, 0, 0, 0, 0, 0, 0, 0, 1,
                1, 1, 1, 1, 1, 1, 1, 1, 1
        };
    }
}