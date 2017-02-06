package jp.ac.uryukyu.ie.e165749;

/**
 * Created by South on 2017/02/06.
 */
public class Field {
    public int width;  // フィールドの横の大きさ
    public int height;  // フィールドの縦の大きさ
    public byte[] data;  // 実際のフィールド
    public static final byte PATH = 0;  // 通れるところ
    public static final byte WALL = 1;  // 壁
}
