-- 数据库初始化脚本

-- 创建数据库
create database seckill;
-- 使用数据库
use seckill;
-- 创建秒杀库存表
create table seckill (
	'seckill_id' bigint NOT NULL AUTO_INCREMENT COMMENT '商品库存id',
	'name' 

) ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=UTF8 COMMENT='秒杀库存表'