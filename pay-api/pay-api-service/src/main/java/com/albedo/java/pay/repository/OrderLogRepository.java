/**
 * Copyright &copy; 2015 <a href="http://www.bs-innotech.com/">bs-innotech</a> All rights reserved.
 */
package com.albedo.java.pay.repository;

import com.albedo.java.common.data.persistence.repository.BaseRepository;
import com.albedo.java.pay.domain.OrderLog;

/**
 * 订单日志Repository 订单日志
 * 
 * @author lj
 * @version 2017-05-05
 */
public interface OrderLogRepository extends BaseRepository<OrderLog, String> {

	OrderLog findOneByOrderId(String id);
}