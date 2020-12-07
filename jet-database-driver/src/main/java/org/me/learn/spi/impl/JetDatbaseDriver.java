/*
 * Copyright 2020 tu.cn All right reserved. This software is the
 * confidential and proprietary information of tu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tu.cn
 */
package org.me.learn.spi.impl;

import org.me.learn.spi.DatabaseDriver;

/**
 * @author Administrator
 * @date 2020/12/7 23:12
 * Project Name: spi-demo
 */
public class JetDatbaseDriver implements DatabaseDriver {
    @Override
    public String buildConnection(String url) {
        return "JedDatabaseDriver: " + url;
    }
}
