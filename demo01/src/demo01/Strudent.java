package demo01;

import java.util.UUID;

public class Strudent {
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	public static void main(String[] args) {
		String str="a.png?abc";
		String imgUrl=str.substring(0,str.lastIndexOf("?"));
		String s=imgUrl.substring(imgUrl.lastIndexOf("."));
		System.out.println(s);
		/*Strudent strudent=new Strudent();
		System.out.println(strudent.age);*/
		String dString=UUID.randomUUID().toString();
		String s1=dString.replace("-", "");
		System.out.println(s1);
	}
}
