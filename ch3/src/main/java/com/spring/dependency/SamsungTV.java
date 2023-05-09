package com.spring.dependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("tv") // SamsungTV ��ü ����
public class SamsungTV implements TV {
	
	@Autowired // ����(������ �����̳ʰ� �����ϴ� �� �߿��� �ϳ��� ���Ե�)
	@Qualifier("apple")
	private Speaker speaker; // has-a(����) ����
	
	public SamsungTV() {
		System.out.println("SamsungTV �ν��Ͻ� ���� - default ������");
	}
	
	public SamsungTV(Speaker speaker) {
		super();
		this.speaker = speaker; //��� ���� �ʱ�ȭ
		System.out.println("SamsungTV �ν��Ͻ� ���� - ���� ������");		
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
