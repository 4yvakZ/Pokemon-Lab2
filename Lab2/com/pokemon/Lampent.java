package com.pokemon;
import ru.ifmo.se.pokemon.*;
import com.pokemon.attack.*;

public class Lampent extends Litwick{
	public Lampent (java.lang.String name, int level){
		super (name, level);
		addMove(new NightShade(Type.GHOST, level, 1));
		setStats(60, 40, 60, 95, 60, 55);
	}
}
