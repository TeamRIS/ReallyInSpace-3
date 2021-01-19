package org.risteam.ris3.procedures;

import org.risteam.ris3.Ris3ModElements;

import java.util.Map;

@Ris3ModElements.ModElement.Tag
public class OxygenTickProcedure extends Ris3ModElements.ModElement {
	public OxygenTickProcedure(Ris3ModElements instance) {
		super(instance, 48);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		Ris3ModVariables.oxygenthere = (boolean) (true);
	}
}
