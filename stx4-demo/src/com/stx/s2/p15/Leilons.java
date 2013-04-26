package com.stx.s2.p15;

/**
 * 怪兽1 雷龙，继承Beast类，实现了Inwater、FarAttack和Onland接口
 * 
 * 
 * @author getan
 * 
 */
public class Leilons extends Beast implements InWater, FarAttack, OnLand {

	@Override
	public void landMove() {
		System.out.println("能以0.5马赫的速度飞奔");
	}

	@Override
	public void farAttack() {
		System.out.println("从口中喷出强烈水流，或喷射泡沫");
	}

	@Override
	public void waterMove() {
		System.out.println("在水上水下都可以运动");
	}

}
