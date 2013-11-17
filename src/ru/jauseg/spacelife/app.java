package ru.jauseg.spacelife;

import java.util.Random;

import js.engine.ObjectMCX;

import android.app.Application;
import android.graphics.Bitmap;
import android.os.SystemClock;

public class app extends Application
{
	private final static Random rnd = new Random(SystemClock.elapsedRealtime());

	public static Bitmap bitmapSphere = null;
	
	public static ObjectMCX mcxShip = null;
	public static ObjectMCX mcxSphere = null;

	public final static float rnd()
	{
		return rnd.nextFloat();
	}

	public final static float rnd(float from, float size)
	{
		return size * rnd.nextFloat() + from;
	}

}
