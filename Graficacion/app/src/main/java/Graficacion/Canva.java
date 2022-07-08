/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Graficacion;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.PerspectiveCamera;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g3d.Environment;
import com.badlogic.gdx.graphics.g3d.Model;
import com.badlogic.gdx.graphics.g3d.ModelBatch;
import com.badlogic.gdx.graphics.g3d.ModelInstance;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

/**
 *
 * @author Ivan
 */
public class Canva implements ApplicationListener {
    
    SpriteBatch batch;
    BitmapFont font;
    ShapeRenderer shapeRenderer;
    
    Environment environment;
    ModelBatch modelBatch;
    PerspectiveCamera cam;
    Model model;
    ModelInstance instance;
    
    
    public void create() {
        System.out.println("Llamar create");
        batch = new SpriteBatch();
        font = new BitmapFont();
        shapeRenderer = new ShapeRenderer();
    }
    
    @Override
    public void resize(int i, int i1) {
        System.out.println("llamar a resize");
    }
    
    @Override
    public void render() {
        System.out.println("render");        
        Gdx.gl.glClearColor(.25f, .25f, .25f, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        
        batch.begin();
        
        font.draw(batch, "verano graficacion", 100, 100);
        
        batch.end();
                
    }
    
    @Override
    public void pause() {
        System.out.println("pause");
    }
    
    @Override
    public void resume() {
        System.out.println("resume");
    }
    
    @Override
    public void dispose() {
        System.out.println("dispose");        
        batch.dispose();
        font.dispose();
        shapeRenderer.dispose();
    }
    
}
