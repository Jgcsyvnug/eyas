package com.hdsx.framework.util;

import java.io.Serializable;

/**
 * ResponseMessage返回信息类
 * @author jingzh
 *
 * @param 
 */
public class ResponseMessage  implements Serializable{
	
	private boolean status;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Object message;
	public ResponseMessage(){
	}
	public ResponseMessage(Object message){
		this.message=message;
	}
	
	public ResponseMessage(boolean status,Object message){
		this.status=status;
		this.message=message;
	}
	
	public boolean isStatus() {
		return status;
	}
	
	public void setStatus(boolean status) {
		this.status = status;
	}

	public Object getMessage() {
		return message;
	}
	public void setMessage(Object message) {
		this.message = message;
	}
	
}
