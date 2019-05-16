package com.ten.aditum.statistics.util;

import java.util.UUID;

/**
 * 基于UUID 生成分布式全局唯一ID
 */
public class UidGenerator {

    public static String generateUid() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }

}