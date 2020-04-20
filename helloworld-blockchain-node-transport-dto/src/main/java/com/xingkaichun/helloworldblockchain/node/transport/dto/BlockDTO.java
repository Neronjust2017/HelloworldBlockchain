package com.xingkaichun.helloworldblockchain.node.transport.dto;

import lombok.Data;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.List;

/**
 * 区块
 */
@Data
public class BlockDTO implements Serializable {
    //TODO 持续检查缩减dto字段
    private long timestamp;
    private String previousHash;
    private BigInteger height;
    private List<TransactionDTO> transactions;
    private String merkleRoot;
    private BigInteger nonce;
    private String hash;
}
