package com.dan.seckill.service;

import java.util.List;

import com.dan.seckill.dto.Exposer;
import com.dan.seckill.dto.SeckillExecution;
import com.dan.seckill.entity.Seckill;
import com.dan.seckill.exception.RepeatKillException;
import com.dan.seckill.exception.SeckillCloseException;
import com.dan.seckill.exception.SeckillException;

/**
 * 业务接口：站在“使用者”角度设计接口
 * 三个方面：方法定义粒度、参数、返回类型(return 类型/异常)
 * @author gd
 */
public interface SeckillService {

	/**
	 * 查询所有秒杀记录
	 * @return
	 */
	List<Seckill> getSeckillList();
	
	/**
	 * 查询单个秒杀记录
	 * @param seckillId
	 * @return
	 */
	Seckill getById(long seckillId);
	
	/**
	 * 秒杀开启时输出秒杀接口地址，
	 * 否则输出系统时间和秒杀时间
	 * @param seckillId
	 * @return
	 */
	Exposer exportSeckillUrl(long seckillId);
	
	/**
	 * 执行秒杀操作
	 * @param seckillId
	 * @param userPhone
	 * @param md5
	 * @return
	 */
	SeckillExecution executeSeckill(long seckillId, long userPhone, String md5)
		throws SeckillException, RepeatKillException, SeckillCloseException;
	
}



