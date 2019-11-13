/**
 * Copyright 2019 Jguo3 Studio
 * 
 * All right reserved
 *
 * Created on Nov 13, 2019 4:08:27 PM
 *
 * 
 */
package com.jguo3.school.validation;

import org.apache.log4j.Logger;

/**
 * Description:TODO
 * @author:jguo3
 * Date:Nov 13, 2019 4:08:27 PM
 * 
 */
public class AppLog4j {
	private static final Logger LOGGER = Logger.getLogger(AppLog4j.class);

    public static void main(String[] args) {
        LOGGER.fatal("致命级别日志: 指出每个严重的错误事件将会导致应用程序的退出。");
        LOGGER.error("错误级别日志: 指出虽然发生错误事件，但仍然不影响系统的继续运行的信息。");
        LOGGER.warn("警告级别日志: 表明会出现潜在错误的情形，有些信息不是错误信息，但是也要给程序员的一些提示。");
        LOGGER.info("消息级别日志: 用于生产环境中输出程序运行的一些重要信息，但是不能滥用，避免打印过多的日志。");
        LOGGER.debug("调试级别日志: 开发人员可以将任意信息在此打印，比如局部变量的值等等，主要是为了了解程序运行状态，便于调试。");
        LOGGER.trace("跟踪级别日志: 一般不使用。");
    }
}
