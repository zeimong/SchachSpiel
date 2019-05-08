package Spiel;

import java.awt.Color;

/**
 * Beschreiben Sie hier die Klasse Figuren.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public abstract class Figuren {
	
    //Variablen
    
    private Zug zug;
    private Feld feld;
    private Color color;
    private String figureID;

    //Konstruktor
    public Figuren(Feld feld, String figureID) {
    	this.setFigureID(figureID);
    	this.zug = null;
    	this.feld = feld;
    	
    	if(feld.getY() < 3) {
    		this.color = Color.WHITE;
    	}
    	
    	else {
    		this.color = Color.BLACK;
    	}
    }
    
    //Methoden
    public Feld getFeld() {
    	return this.feld;
    }
    
    public Zug getZug() {
    	return this.zug;
    }
    
    public Color getColor() {
    	return this.color;
    }
    
    public void setFeld(Feld feld) {
    	this.feld = feld;
    }
    
    public void setZug(Zug zug) {
    	this.zug = zug;
    }
    
    public void setColor(Color color) {
    	this.color = color;
    }

	public String getFigureID() {
		return figureID;
	}

	public void setFigureID(String figureID) {
		this.figureID = figureID;
	}

}
