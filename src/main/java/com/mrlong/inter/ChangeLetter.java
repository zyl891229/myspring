package com.mrlong.inter;

/*
 * 创建一个接口
 * 两个类实现
 * 配置到bean中
 * 
 * 通过这个案例可以初步体会到DI配合接口编程的却可以解耦
 * 
 * 思考题，ValidateUser接口
 * 要给方法check（）
 * 两个类实现
 * CheckUser1 implement ValidateUser 按照XML验证
 * CheckUser2 implement ValidateUser 按照数据库验证
 */
public interface ChangeLetter {
	public String change();
}
