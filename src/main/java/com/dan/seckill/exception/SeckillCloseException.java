package com.dan.seckill.exception;

/**
 * 秒杀关闭异常
 * @author gd
 *
 */
public class SeckillCloseException extends SeckillException {
	
	public SeckillCloseException(String message) {
		super(message);
	}
	
	public SeckillCloseException(String message, Throwable cause) {
		super(message, cause);
	}
	
}
