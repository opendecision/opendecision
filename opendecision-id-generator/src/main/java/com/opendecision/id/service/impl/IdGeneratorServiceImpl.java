package com.opendecision.id.service.impl;

import com.opendecision.id.service.IdGeneratorService;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;

import java.text.DecimalFormat;
import java.util.UUID;
import java.util.concurrent.locks.ReentrantLock;

@Service
public class IdGeneratorServiceImpl implements IdGeneratorService {

    /** 计数器 */
    private int count = 1;

    /** 计数器锁 */
    private ReentrantLock lock = new ReentrantLock();

    /** 当前秒 */
    private long current = System.currentTimeMillis() / 1000;

    private String clusterNo = "10"; // 默认10

    private static DecimalFormat decimalFormat = new DecimalFormat("000000");

    /**
     * 32长度UUID
     *
     * @return 32长度字符
     */
    @Override
    public String uuid() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }

    /**
     * mongodb主键生成器
     *
     * @return
     */
    @Override
    public String objectId() {
        return new ObjectId().toString();
    }

    /**
     * 获取18位长的主键
     *
     * @return 18位数字，集群中的编号(2)+当前秒(10)+inc(6)
     */
    @Override
    public String simpleId() {

        lock.lock();
        StringBuilder sb = new StringBuilder();
        try {
            long timestamp = System.currentTimeMillis() / 1000;
            if (current != timestamp) {
                current = timestamp;
                count = 1;
            }

            sb.append(clusterNo).append(timestamp).append(decimalFormat.format(count));
        } finally {
            lock.unlock();
        }
        return sb.toString();
    }
}
