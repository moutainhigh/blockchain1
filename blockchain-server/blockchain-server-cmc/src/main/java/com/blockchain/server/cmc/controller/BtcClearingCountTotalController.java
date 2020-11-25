package com.blockchain.server.cmc.controller;

import com.blockchain.common.base.dto.ResultDTO;
import com.blockchain.server.cmc.controller.api.BtcTotalApi;
import com.blockchain.server.cmc.dto.BtcCountTotalInfoDTO;
import com.blockchain.server.cmc.service.IBtcClearingCountTotalService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * 提现记录查询接口
 *
 * @author YH
 * @date 2019年3月9日09:50:24
 */
@RestController
@RequestMapping("/countTotal")
public class BtcClearingCountTotalController {
    @Autowired
    IBtcClearingCountTotalService btcClearingCountTotalService;

    @ApiOperation(value = BtcTotalApi.All.METHOD_TITLE_NAME, notes = BtcTotalApi.All.METHOD_TITLE_NOTE)
    @GetMapping("/all")
    public ResultDTO all() {
        List<BtcCountTotalInfoDTO> totalInfos = btcClearingCountTotalService.selectInfoAll();
        return ResultDTO.requstSuccess(totalInfos);
    }


    @ApiOperation(value = BtcTotalApi.Total.METHOD_TITLE_NAME, notes = BtcTotalApi.Total.METHOD_TITLE_NOTE)
    @PostMapping("/total")
    public ResultDTO total() {
        List<BtcCountTotalInfoDTO> totalInfos = btcClearingCountTotalService.insertTotals();
        return ResultDTO.requstSuccess(totalInfos);
    }

}
