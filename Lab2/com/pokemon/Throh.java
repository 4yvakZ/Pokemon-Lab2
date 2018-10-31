package com.pokemon;
import ru.ifmo.se.pokemon.*;
import com.pokemon.attack.*;

public class Throh extends Pokemon{
	public Throh (java.lang.String name, int level){
		super (name, level);
		setType(Type.FIGHTING);
		setMove(new BulkUp(Type.FIGHTING, 0, 1),
			new SeismicToss(Type.FIGHTING, level, 1),
			new WorkUp(Type.NORMAL, 0, 1),
			new DoubleTeam(Type.NORMAL, 0, 1));
		setStats(120, 100, 85, 30, 85, 45);
	}
}
