package com.pokemon;
import ru.ifmo.se.pokemon.*;
import com.pokemon.attack.*;

public class Lileep extends Pokemon{
	public Lileep (java.lang.String name, int level){
		super (name, level);
		setType(Type.ROCK, Type.GRASS);
		setMove(new AncientPower(Type.ROCK, 60, 1),
			new EnergyBall(Type.GRASS, 90, 1),
			new SludgeBomb(Type.POISON, 90, 1));
		setStats(66, 41, 77, 61, 87, 23);
	}
}