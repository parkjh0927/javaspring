package com.spring.dependency;

public class LgTV implements TV{
	@Override
	public void powerOn() {
		System.out.println("LGTV - �Ŀ� On");
	}
	@Override
	public void powerOff() {
		System.out.println("LGTV - �Ŀ� Off");
	}
	@Override
	public void volumeUp() {
		System.out.println("LGTV - ���� Up");
	}
	@Override
	public void volumeDown() {
		System.out.println("LGTV - ���� Down");
	}
}
