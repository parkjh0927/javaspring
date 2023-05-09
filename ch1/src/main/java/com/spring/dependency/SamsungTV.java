package com.spring.dependency;

public class SamsungTV implements TV {
	
	private SonySpeaker speaker; // has-a(����) ����
	
	public SamsungTV() {}
	
	public SamsungTV(SonySpeaker speaker) {
		super();
		this.speaker = speaker;
	}
	
	public void setSpeaker(SonySpeaker speaker) {
		this.speaker = speaker;
	}
	
	@Override
	public void powerOn() {
		System.out.println("SamsungTV - �Ŀ� On");
	}
	@Override
	public void powerOff() {
		System.out.println("SamsungTV - �Ŀ� Off");
	}
	@Override
	public void volumeUp() {
//		System.out.println("SamsungTV - ���� Up");
		speaker.volumeUp();
	}
	@Override
	public void volumeDown() {
//		System.out.println("SamsungTV - ���� Down");
		speaker.volumeDown();
	}
}
