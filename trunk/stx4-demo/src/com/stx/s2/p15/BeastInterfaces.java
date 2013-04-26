package com.stx.s2.p15;

/**
 * 怪兽接口大全 
 * 
 * @author getan
 * 
 */
public class BeastInterfaces {

}
//接口可以看成是没有实例域的抽象类
interface OnLand {
	// 陆地移动方法
	void landMove();
}

interface InWater {
	// 水中移动方法
	void waterMove();
}

interface InAir {
	// 空中移动方法
	void airMove();
}

interface NearAttack {
	// 近距离攻击方法
	void nearAttack();
}

interface FarAttack {
	// 远距离攻击方法
	void farAttack();
}
