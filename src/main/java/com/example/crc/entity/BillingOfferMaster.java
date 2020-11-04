package com.example.crc.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "BILLING_OFFER_MASTER", schema = "RE_DATA")
public class BillingOfferMaster {

    @Id
    @Column(name = "ID_TAB_BO_MASTER")
    private String id;
    
    @Column(name = "CID_BO")
    private String cidBO;

    @Column(name = "VERSION_BO")
    private String versionBO;
    
    @Column(name = "CAPTION_BO")
    private String captionBO;
    
    @Column(name = "NAME_BO")
    private String nameBO;
    
    @Column(name = "DATE_BEGIN")
    private LocalDateTime dateBegin;
    
    @Column(name = "DATE_END")
    private LocalDateTime dateEnd;
    
    @Column(name = "DESCRIPTION_TEXT")
    private String descriptionText;

}
