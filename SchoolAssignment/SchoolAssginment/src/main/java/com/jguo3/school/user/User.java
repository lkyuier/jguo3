package com.jguo3.school.user;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;




/**
 * Description:TODO
 * @author:jguo3
 * Date:Nov 12, 2019 3:31:24 PM
 * 
 */
public class User {
	public User() {
	}
    public User(String name, String password) {
		this.username = name;
		this.password = password;
	}

	/** 用户名 */
    @NotNull
    @Length(min = 5,max = 10, message = "{user.username.length}")
    public String username;

    /** 密码 */
    @NotNull
    @Length(min = 5,max = 10, message= "{user.password.length}")
    public String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

    //setter getter toString equals&hashCode
    
    
}
