package com.fsd.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@CrossOrigin
@Controller
public class IndexController {
    private static Logger logger = LoggerFactory.getLogger(IndexController.class);

  @RequestMapping(value = "/", method = RequestMethod.GET)
  @ResponseBody
  public String root() {
	logger.trace("trace message...");
	logger.debug("debug message...");
	logger.info("info message...");
	logger.warn("warn message...");
	logger.error("error message...");
    return "Hello FSD & let's Go!";
  }

  @RequestMapping(value = "/index", method = RequestMethod.GET)
  public String index() {
    return "redirect:/";
  }

}
