package com.pokemon.attack;
import ru.ifmo.se.pokemon.*;

public class DoubleTeam extends StatusMove{
	public DoubleTeam(Type type, double pow, double acc){
		super(type, pow, acc);
	}
	protected java.lang.String	describe(){
		return "использует Double Team";
	}
	protected void applySelfEffects(Pokemon p){
		p.setMod(Stat.EVASION , 1);
	}
}
