package com.yujingzhou;

/**
 * http://c.biancheng.net/view/1338.html
 * 懒汉模式
 * @author yubo
 * 2020-11-23
 */
public class SingletonPatten {
    //保证 instance 在所有线程中同步
    private static volatile SingletonPatten instance = null;

    //private 避免类在外部被实例化
    private SingletonPatten() {
    }

    public static synchronized SingletonPatten getInstance() {
        //getInstance 方法前加同步
        if (instance == null) {
            instance = new SingletonPatten();
        }
        return instance;
    }
}
