package com.tower.domain;

public class User {
	private int uid;
	private String uname;
	private String upassword;
	private String nickname;
	private int authorityguid;
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpassword() {
		return upassword;
	}
	public void setUpassword(String upassword) {
		this.upassword = upassword;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public int getAuthorityguid() {
		return authorityguid;
	}
	public void setAuthorityguid(int authorityguid) {
		this.authorityguid = authorityguid;
	}
}
