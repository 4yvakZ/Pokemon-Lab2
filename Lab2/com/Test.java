package com;
import ru.ifmo.se.pokemon.*;
import com.pokemon.*;
public class Test{
	public static void main(String[] arg){
		Battle b = new Battle();
		b.addAlly(new Throh("Ванёчек", 25));
		b.addAlly(new Lileep("Ванёчек", 44));
		b.addAlly(new Chandelure("Ванёчек", 13));
		b.addFoe(new Litwick("Дашок", 5));
		b.addFoe(new Lampent("Дашок", 13));
		b.addFoe(new Cradily("Дашок", 44));
		b.go();
	}
}
