package com.pigeoncat.log;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author pigeoncat
 * @Date 2024/04/09  13:58
 * @TODO description
 */
public class SLF4JLogging {
    private static Logger log = LoggerFactory.getLogger(SLF4JLogging.class);

    public static void main(String[] args) {
        log.info("hello logging?");
    }
}
