package com.yy.task;

import org.apache.log4j.Logger;

//@Component
public class DataConversionTask {

    private static Logger logger = Logger.getLogger(DataConversionTask.class);
    public void run(){

        if (logger.isInfoEnabled()){
            logger.info("数据转换任务线程开始执行");
        }

    }

}
