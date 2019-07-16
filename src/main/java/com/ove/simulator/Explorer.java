package com.ove.simulator;


public class Explorer implements CanvasArrayHolder {

	private HolderType holderType;
	private Coordinates coordinates;
	
	public Explorer(HolderType holderType, Coordinates coordinates){
		this.coordinates = coordinates;
		this.holderType = holderType;
	}
	@Override
	public HolderType getHolderType() {
		// TODO Auto-generated method stub
		return holderType;
	}

	@Override
	public Coordinates getCoordinates() {
		// TODO Auto-generated method stub
		return coordinates;
	}

}
