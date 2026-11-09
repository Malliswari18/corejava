package com.multiple_inheritance;

public class Mobile  extends Electronic_Device implements Camera,MusicPlayer  {
	
	
	String model;
	 Mobile(String model){
		this.model=model;
		
	}
	@Override
	public void ClickPhotos(int pixels) {
		System.out.println(model+" click photos on "+pixels);
	}
	@Override
	public void PlayMusic(String SpeakerType) {
		System.out.println(model+" Playmusic in "+SpeakerType);
	}
	

}
