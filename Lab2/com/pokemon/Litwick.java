package com.pokemon;
import ru.ifmo.se.pokemon.*;
import com.pokemon.attack.*;

public class Litwick extends Pokemon{
	public Litwick (java.lang.String name, int level){
		super (name, level);
		setType(Type.FIRE,Type.GHOST);
		setMove(new Smog(Type.POISON, 30, 0.7),
			new CalmMind(Type.PSYCHIC, 0, 1));
		setStats(50, 30, 55, 65, 55, 20);
	}
}
