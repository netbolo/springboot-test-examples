//package com.legend.rest.tutorial;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
///**
// * @author iot
// * @Description TODO
// * {@link}
// * @date 2021/6/22上午6:41
// */
//@RestController
//public class LoggingController {
//
//  Logger logger = LoggerFactory.getLogger(LoggingController.class);
//
//  @RequestMapping("/")
//  public String index() {
//    logger.trace("A TRACE Message");
//    logger.debug("A DEBUG Message");
//    logger.info("An INFO Message");
//    logger.warn("A WARN Message");
//    logger.error("An ERROR Message");
//
//    return "Howdy! Check out the Logs to see the output...";
//  }
//}
