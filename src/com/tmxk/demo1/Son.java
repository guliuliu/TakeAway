package com.tmxk.demo1;

public class Son extends Person {
	//������λ
	private String workPost;

	public String getWorkPost() {
		return workPost;
	}

	public void setWorkPost(String workPost) {
		this.workPost = workPost;
	}
	
	//��������:ͬ��,ͬ��,��ͬ��
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
		System.out.println(super.getName() + "������,��������");
	}
	
	public void onlinePay(){
		System.out.println("֧����֧��~~~");
	}
	
	public void playGame(){
		System.out.println("����Ϸֱ��,����Ϸ~~~");
	}
}
