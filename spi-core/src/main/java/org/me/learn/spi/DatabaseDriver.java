/*
 * Copyright 2020 tu.cn All right reserved. This software is the
 * confidential and proprietary information of tu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tu.cn
 */
package org.me.learn.spi;

/**
 * @author Administrator
 * @date 2020/12/7 22:54
 * Project Name: spi-demo
 */
public interface DatabaseDriver {
    String buildConnection(String url);
}
