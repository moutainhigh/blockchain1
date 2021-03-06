package com.blockchain.server.quantized.mapper;

import com.blockchain.server.quantized.dto.QuantizedOrderDto;
import com.blockchain.server.quantized.entity.QuantizedOrder;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;


@Repository
public interface QuantizedOrderMapper extends Mapper<QuantizedOrder> {
    List<QuantizedOrderDto> listAll(@Param("userId") String userId,@Param("state") String state,@Param("type") String type);
}
