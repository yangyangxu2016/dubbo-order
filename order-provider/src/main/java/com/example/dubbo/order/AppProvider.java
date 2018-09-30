package com.example.dubbo.order;


import com.alibaba.dubbo.common.logger.Logger;
import com.alibaba.dubbo.common.logger.LoggerFactory;
import com.alibaba.dubbo.container.Main;

import java.io.IOException;

/**
 * Hello world!
 */
public class AppProvider {
    private static Logger logger = LoggerFactory.getLogger(AppProvider.class);

    public static void main(String[] args) throws IOException {
        Main.main(args);
    }

}
