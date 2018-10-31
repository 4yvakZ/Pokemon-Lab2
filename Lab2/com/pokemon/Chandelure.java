package com.pokemon;
import ru.ifmo.se.pokemon.*;
import com.pokemon.attack.*;

public class Chandelure extends Lampent{
	public Chandelure (java.lang.String name, int level){
		super (name, level);
		addMove(new ConfuseRay(Type.GHOST, 0, 1));
		setStats(60, 55, 90, 145, 90, 80);
	}
}
