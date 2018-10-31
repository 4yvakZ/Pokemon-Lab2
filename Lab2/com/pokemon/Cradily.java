package com.pokemon;
import ru.ifmo.se.pokemon.*;
import com.pokemon.attack.*;

public class Cradily extends Lileep{
	public Cradily (java.lang.String name, int level){
		super (name, level);
		addMove(new SludgeWave(Type.POISON, 95, 1));
		setStats(86, 81, 97, 81, 107, 43);
	}
}
