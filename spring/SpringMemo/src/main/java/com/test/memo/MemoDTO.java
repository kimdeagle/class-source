package com.test.memo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//@Getter
//@Setter
//@ToString

//geter, setter, toString, constructor
@Data
public class MemoDTO {

	private String seq;
	private String name;
	private String memo;
	private String regdate;
	
}
