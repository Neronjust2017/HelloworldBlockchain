package com.xingkaichun.helloworldblockchain.netcore.transport.dto;

import java.io.Serializable;
import java.util.List;

/**
 * 区块
 * 属性含义参考 com.xingkaichun.helloworldblockchain.core.model.Block
 *
 * 以下是对这个类的含有的属性的要求：
 * 在不依赖其它区块的数据情况下，可以独立计算该区块的哈希值。
 * 根据这个哈希值，可以估计出挖出这个区块的难度，根据这个难度就可以先预判这个区块的可能准确性。难度越大，造假成本越高。
 *
 * @author 邢开春 409060350@qq.com
 */
public class BlockDTO implements Serializable {

    //区块产生的时间戳
    private long timestamp;
    //上一个区块的哈希
    private String previousBlockHash;
    //区块里的交易
    private List<TransactionDTO> transactionDtoList;
    //随机数
    private String nonce;




    //region get set

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public List<TransactionDTO> getTransactionDtoList() {
        return transactionDtoList;
    }

    public void setTransactionDtoList(List<TransactionDTO> transactionDtoList) {
        this.transactionDtoList = transactionDtoList;
    }

    public String getNonce() {
        return nonce;
    }

    public void setNonce(String nonce) {
        this.nonce = nonce;
    }

    public String getPreviousBlockHash() {
        return previousBlockHash;
    }

    public void setPreviousBlockHash(String previousBlockHash) {
        this.previousBlockHash = previousBlockHash;
    }

    //endregion
}
