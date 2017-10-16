/*
 *
 * 陈德元：



 *
 */
package com.roncoo.pay.service.trade.dao;

import com.roncoo.pay.common.core.dao.BaseDao;
import com.roncoo.pay.service.trade.entity.RpTradePaymentRecord;

/**
 * @功能说明:
 * @创建者:
 * @创建时间: 16/5/18  下午5:01
 *
 * @版本:V1.0
 */
public interface RpTradePaymentRecordDao extends BaseDao<RpTradePaymentRecord>{
	
	/** 获取支付流水号 **/
	String buildTrxNo();
	
	/** 获取银行订单号 **/
	String buildBankOrderNo();
	
	
    int deleteByPrimaryKey(String id);

    int insertSelective(RpTradePaymentRecord record);

    RpTradePaymentRecord selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(RpTradePaymentRecord record);

    /**
     * 根据银行订单号获取支付信息
     * @param bankOrderNo
     * @return
     */
    RpTradePaymentRecord getByBankOrderNo(String bankOrderNo);

    /**
     * 根据商户编号及商户订单号获取支付结果
     * @param merchantNo
     * @param merchantOrderNo
     * @return
     */
    RpTradePaymentRecord getByMerchantNoAndMerchantOrderNo(String merchantNo, String merchantOrderNo);

    /**
	 * 根据支付流水号查询支付记录
	 * 
	 * @param trxNo
	 * @return
	 */
	RpTradePaymentRecord getByTrxNo(String trxNo);

}
