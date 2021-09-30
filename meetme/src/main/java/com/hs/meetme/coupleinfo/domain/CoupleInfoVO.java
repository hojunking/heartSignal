package com.hs.meetme.coupleinfo.domain;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CoupleInfoVO {
	private int coupleId;
	private String coupleStatus; //연결중 y, 끊김 n 
	private int userRequest; //커플신청유저
	private int userReceived; //신청받은유저
	@DateTimeFormat(pattern = "yyyy-mm-dd")
	private Date coupleDate; //사귀기 시작한 날짜
	private int imageId;	//커플대문
	private long subTerm;	//구독기간(1,3,6,0)
	private Date startDate; //결제날(시작날)
	private String coupleImg; //커플이미지 url
	
	//유저 정보에 필요한 vo
	private int userId;
	private String name;
	private String nickName;
	private Date birthDate;  
	private String userImg; //유저이미지 url
}



