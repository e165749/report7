package jp.ac.uryukyu.ie.e165749;

/**
 * Created by South on 2017/02/06.
 */
public class Field {
    public int width;  // 迷路の横の大きさ
    public int height;  // 迷路の縦の大きさ
    public byte[] data;  // 実際の迷路データ
    public static final byte PATH = 0;  // 通路
    public static final byte WALL = 1;  // 壁
}
