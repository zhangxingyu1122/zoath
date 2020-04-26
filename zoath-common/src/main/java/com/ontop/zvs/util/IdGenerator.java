package com.ontop.zoath.util;


/**
 * 项目名称：GDWeb<br>
 * 包名：com.unistec.util <br>
 * 类名称：IdGenerator  <br>
 * 类描述：主键生成工具类 模仿snowflake算法<br>
 * *****************************************************<br>
 * 主要方法：<br>
 * 描述各个方法用途  <br>
 * 描述各个方法用途  <br>
 * *****************************************************<br>
 * 作者：zhangzijun  <br>
 * 创建日期：2018年8月31日 <br>
 * 版本：V1.0<br>
 */
public class IdGenerator {
    private final static long beginTs = 1483200000000L;

    private long lastTs = 0L;

    private long processId;
    private int processIdBits = 10;

    private long sequence = 0L;
    private int sequenceBits = 12;

    // 10位进程ID标识
    public IdGenerator(long processId) {
        if (processId > ((1 << processIdBits) - 1)) {
            throw new RuntimeException("进程ID超出范围，设置位数" + processIdBits + "，最大"
                    + ((1 << processIdBits) - 1));
        }
        this.processId = processId;
    }

    protected long timeGen() {
        return System.currentTimeMillis();
    }

    public synchronized long nextId() {
        long ts = timeGen();
        if (ts < lastTs) {// 刚刚生成的时间戳比上次的时间戳还小，出错
            throw new RuntimeException("时间戳顺序错误");
        }
        if (ts == lastTs) {// 刚刚生成的时间戳跟上次的时间戳一样，则需要生成一个sequence序列号
            // sequence循环自增
            sequence = (sequence + 1) & ((1 << sequenceBits) - 1);
            // 如果sequence=0则需要重新生成时间戳
            if (sequence == 0) {
                // 且必须保证时间戳序列往后
                ts = nextTs(lastTs);
            }
        } else {// 如果ts>lastTs，时间戳序列已经不同了，此时可以不必生成sequence了，直接取0
            sequence = 0L;
        }
        lastTs = ts;// 更新lastTs时间戳
        return ((ts - beginTs) << (processIdBits + sequenceBits)) | (processId << sequenceBits)
                | sequence;
    }

    protected long nextTs(long lastTs) {
        long ts = timeGen();
        while (ts <= lastTs) {
            ts = timeGen();
        }
        return ts;
    }

    /**
     * 日期：2018年8月31日<br>
     * 版本：v1.0<br>
     * 描述：getNextId(根据计数器计算毫秒数值) <br>
     * 主要方法：<br>
     * ===============================================<br>
     * 创建日期：2018年8月31日 上午9:54:08 <br>
     * 创建人 zhangzijun<br>
     * ===============================================<br>
     * 修改日期：2018年8月31日<br>
     * 修改人 zhangzijun<br>
     * 修改描述 getNextId(这里用一句话描述这个方法修改原因和作用) <br>
     * ===============================================<br>
     *
     * @return String
     * @Exception 异常对象 <br>
     */
    public static String getNextId() {
        IdGenerator ig = new IdGenerator(1023);
        //long begin = System.nanoTime();
        System.out.println(ig.nextId());
        return String.valueOf(ig.nextId());
    }

    public static void main(String[] args) throws Exception {
        IdGenerator ig = new IdGenerator(1023);
        System.out.println(ig.nextId());
    }
}
