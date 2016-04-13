package com.mrlong.inter;

/*
 * 创建一个接口
 * 两个类实现
 * 配置到bean中
 * 
 * 通过这个案例可以初步体会到di配合接口编程的却可以解耦
 */
public interface ChangeLetter {
	public String change();
}
