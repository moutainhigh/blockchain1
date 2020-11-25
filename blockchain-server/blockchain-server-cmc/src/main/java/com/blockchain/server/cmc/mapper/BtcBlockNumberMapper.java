package com.blockchain.server.cmc.mapper;

import com.blockchain.server.cmc.entity.BtcBlockNumber;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

/**
 * BtcBlockNumberMapper 数据访问类
 *
 * @version 1.0
 * @date 2019-02-16 15:08:16
 */
@Repository
public interface BtcBlockNumberMapper extends Mapper<BtcBlockNumber> {

}