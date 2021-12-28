package com.example.flappybirdgame_project;
import android.graphics.Bitmap;
import android.graphics.Canvas;

public class Pipe extends BaseObject {
    public  static int speed;
    public  Pipe(float x, float y, int width, int height){
        super(x,y,width,height);
        speed=10*Constants.SCREEN_WIDTH/1000;
    }
    public  void  draw(Canvas canvas)
    {
        this.x=speed;
        canvas.drawBitmap(this.bm,this.x,this.y,null);
    }
    
}
