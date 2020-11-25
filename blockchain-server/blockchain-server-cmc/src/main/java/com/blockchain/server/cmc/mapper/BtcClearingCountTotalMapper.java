package com.blockchain.server.cmc.mapper;

import com.blockchain.common.base.dto.wallet.WalletCountTotalDTO;
import com.blockchain.server.cmc.entity.BtcClearingCountTotal;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.Date;
import java.util.List;

/**
 * EthClearingCountTotal 数据访问类
 *
 * @version 1.0
 * @date 2019-02-16 15:44:06
 */
@Repository
public interface BtcClearingCountTotalMapper extends Mapper<BtcClearingCountTotal> {

    /**
     * 獲取最新的記錄
     *
     * @param tokenSymbol
     * @return
     */
    BtcClearingCountTotal selectNewestOne(@Param("tokenSymbol") String tokenSymbol);


    /**
     * 获取基础数据，用于统计
     *
     * @param stareDate
     * @param endDate
     * @return
     */
    List<WalletCountTotalDTO> selectBasicsRecord(@Param("coinName") String coinName,
                                                 @Param("walletType") String walletType,
                                                 @Param("stareDate") Date stareDate,
                                                 @Param("endDate") Date endDate);

}