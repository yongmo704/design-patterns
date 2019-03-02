package com;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * Created by caowei on 2019/2/15.
 */
public class ThreadCreate implements Runnable {

    private static final Logger logger = LoggerFactory.getLogger(ThreadCreate.class);
    @Override
    public void run() {
        logger.info(Singleton.getInstance().toString());
    }
}
