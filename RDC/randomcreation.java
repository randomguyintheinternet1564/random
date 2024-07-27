package RDC;

import arc.*;
import arc.util.*;
import RDC.units.RDCUnitTypes;
import mindustry.*;
import mindustry.mod.*;
import mindustry.gen.*;
import midustry.graphics.*;


public class random-creation extends Mod{
	public void loadContent(){
		RDCUnitTypes.load();
		MOD = Vars.mods.getMod(getClass());
			}
	public static Mods.LoadedMod MOD;
	
}