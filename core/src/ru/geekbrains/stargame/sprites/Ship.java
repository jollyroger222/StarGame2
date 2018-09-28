package ru.geekbrains.stargame.sprites;

import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector2;

import ru.geekbrains.stargame.base.Sprite;
import ru.geekbrains.stargame.math.Rect;

public class Ship extends Sprite {
    private Vector2 v = new Vector2();
    private Vector2 v2 = new Vector2(0f,0f);
    private Rect worldBounds;

    public Ship(TextureRegion region) {
        super(region);
        //v.set(0.1f,0f);
        //setHeightProportion();

    }

    @Override
    public void resize(Rect worldBounds) {
        this.worldBounds = worldBounds;
    }

    @Override
    public  void update(float delta) {
//        setV(v2);
        //System.out.println("v, delta");
        pos.mulAdd(v, delta);
//        v.set(0f,0f);
        //checkAndHandleBounds();
    }

    public void setV(Vector2 v) {
        this.v = v;
    }



}
