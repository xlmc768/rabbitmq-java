package com.mq.rabbit;

/**
 * 全局配置文件
 * 
 * @author stone
 *
 */
public class Config {

	// RabbitMQ Server相关配置
	public static final String UserName = "test";
	public static final String Password = "test";
	public static final String Host = "172.16.10.177";
	public static final int Port = 5672;
	public static final String VHost = "/";

	public static final String QueueName = "rabbittest"; // 队列名称
}
