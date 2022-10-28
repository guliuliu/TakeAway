package com.tmxk.demo1;

public class Son extends Person {
	//工作岗位
	private String workPost;

	public String getWorkPost() {
		return workPost;
	}

	public void setWorkPost(String workPost) {
		this.workPost = workPost;
	}
	
	//方法重载:同类,同名,不同参
	public Son() {
	}
	
	public Son(String name,String workPost){
		super.setName(name);
		this.workPost = workPost;
	}

	public Son(String name, int age, String sex, double height, String workPost) {
		super(name, age, sex, height);
		this.workPost = workPost;
	}
	
	public void eat(){
		System.out.println(super.getName() + "叫外卖,三菜两汤");
	}
	
	public void onlinePay(){
		System.out.println("支付宝支付~~~");
	}
	
	public void playGame(){
		System.out.println("看游戏直播,玩游戏~~~");
	}
}
