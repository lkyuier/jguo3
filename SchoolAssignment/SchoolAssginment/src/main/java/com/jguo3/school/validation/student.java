package com.jguo3.school.validation;

import javax.validation.GroupSequence;
import org.hibernate.validator.constraints.CreditCardNumber;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;
import org.hibernate.validator.constraints.URL;
import javax.validation.constraints.*;
import java.util.Date;

@GroupSequence({insertGroup.class,updateGroup.class,student.class})
public class student {
	/////////////////////////////javax.validation/////////////////////////////
	//添加学生时，id必为空；修改学生时，id必须有值
	@Null(groups = insertGroup.class,message = "{Null.student.id}")
	@NotNull(groups = updateGroup.class,message = "{NotNull.student.id}")
	private String id;
	
	@Size(min = 2,max = 16,message = "{Size.student.name}",groups = {insertGroup.class,updateGroup.class})
	private String name;//名字
	
	@AssertTrue(groups = insertGroup.class, message = "{AssertTrue.student.newRegister}")
	@AssertFalse(groups = updateGroup.class, message = "{AssertTrue.student.newRegister}")
	private boolean newRegister;//是否新注册
	
	@Max(value = 100, message = "{Max.student.score}",groups = {insertGroup.class,updateGroup.class})
	@Min(value = 0, message = "{Min.student.score}",groups = {insertGroup.class,updateGroup.class})
	private int score;//分数[0-100]
	
	@DecimalMax(value = "30",inclusive = true, message = "{student.age}",groups = {insertGroup.class,updateGroup.class})
	@DecimalMin(value = "19",inclusive = false, message = "{student.age}",groups = {insertGroup.class,updateGroup.class})
	private String age;//年龄范围[20-30]
	
	@Digits(integer = 3,fraction = 2, message = "{Digits.student.weight}",groups = {insertGroup.class,updateGroup.class})
	private float weight;//体重格式[xxx.yy]
	
	@Past(message = "{Past.student.entrance}",groups = {insertGroup.class,updateGroup.class})
	private Date entrance;//入学时间
	
	@Future(message = "{Future.student.graduation}",groups = {insertGroup.class,updateGroup.class})
	private Date graduation;//毕业时间
	
	@Pattern(regexp = "^S2018[0-9]{4}$",flags = Pattern.Flag.CASE_INSENSITIVE, message = "{Pattern.student.number}",groups = {insertGroup.class,updateGroup.class})
	private String number;//学号形式 S20180000-S20189999 大小写敏感
	
	/////////////////////////////hibernate.validator/////////////////////////////
	
	@URL(message = "{URL.student.blog}",groups = {insertGroup.class,updateGroup.class})
	private String blog;//个人学生主页
	
	@Length(min = 1000,max = 5000 ,message = "{Length.student.bonus}",groups = {insertGroup.class,updateGroup.class})
	private String tuition;//学费
	
	@Range(min = 2000L,max = 4000L,message = "{Rang.student.bonus}",groups = {insertGroup.class,updateGroup.class})
	private String bonus;//奖金
	
	@CreditCardNumber(message = "{CreditCardNumber}",groups = {insertGroup.class,updateGroup.class})
	private String creditCard;//银行账号
	
	//toString()
	//setter and getter
}
