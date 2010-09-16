package com.googlecode.reunion.jreunion.game;

import com.googlecode.reunion.jreunion.server.S_Map;

public class G_Position {
	
	private int x;
	private int y;
	private int z;
	
	private S_Map map;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}

	public S_Map getMap() {
		return map;
	}

	public void setMap(S_Map map) {
		this.map = map;
	}
	
	public double rotation;

	public double getRotation() {
		return rotation;
	}

	public void setRotation(double rotation) {
		this.rotation = rotation;
	}
	

}