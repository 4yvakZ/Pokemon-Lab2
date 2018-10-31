package com.pokemon.attack;
import ru.ifmo.se.pokemon.*;

public class NightShade extends SpecialMove{
	public NightShade(Type type, double pow, double acc){
		super(type, pow, acc);
	} 
	protected java.lang.String describe(){
		return "использует Night Shade";
	}
	
}