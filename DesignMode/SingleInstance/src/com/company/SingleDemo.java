package com.company;

/**
 * 单利模式测试类
 */
public class SingleDemo {

    public static void main(String[] args) {
        NumThread numThreadA = new NumThread("thread A");
        NumThread numThreadB = new NumThread("thread B");

        numThreadA.start();
        numThreadB.start();

    }






    static class NumThread extends Thread {
        private String threadName;

        public NumThread(String name) {
            this.threadName = name;
        }

        //

        @Override
        public void run() {
            GlobalNum globalNum = GlobalNum.getInstance();

            //打印num以查看
            for(int i = 0; i < 10; i++) {
                System.out.println(threadName + "第" + globalNum.getNum() + "次访问 GlobalNum.num");
                try {
                    this.sleep(1000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
